import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class P_PlayWindow extends JPanel implements Runnable{
	 private static final long serialVersionUID = 1L;
     
	 //Init Flag
	 public boolean nextButtonisClick = false;
     public boolean currentButtonisClick = false;
     public boolean isAlive = false;
     
     MyJButton currentButton;
     MyJButton nextButton;
	
	public P_PlayWindow() {
		setOpaque(false);
		setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		setLayout(null);
		
		//Set Constant's Flag
		Constant.IS_ON_GAMEMODE = false;
		Constant.IS_ON_START = false;
		
		 
		//Volume
		JButton btnVolume = new JButton("");
		UI.addVolumeButtonFunc(btnVolume);
		if(Constant.IS_MUTED)
			btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/grey_volumeOff_button.png")));
		else
			btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/green_volumeOn_button.png")));
		btnVolume.setContentAreaFilled(false);
		btnVolume.setBorder(null);
		btnVolume.setBounds(805, 10, Constant.BUTTON_WIDTH, Constant.BUTTON_HEIGHT);
		add(btnVolume);
		
		//Home
		JButton btnHome = new JButton("");
		UI.addHomeButtonFunc(btnHome);
		btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/grey_exit_button.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(null);
		btnHome.setBounds(805, 235, Constant.BUTTON_WIDTH, Constant.BUTTON_HEIGHT);
		add(btnHome);
		
		//Light
		JButton btnLight = new JButton("");
		JLabel lblBackGround = new JLabel("");
		UI.addLightButtonFunc(btnLight, lblBackGround);
		if(Constant.IS_DARK)
			btnLight.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_grey_lightmode_button.png")));
		else
			btnLight.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/green_lightmode_button.png")));
		btnLight.setBounds(805, 120, 90, 90);
		btnLight.setBorder(null);
		btnLight.setContentAreaFilled(false);
		add(btnLight);
		
		//Progress Bar
		JLabel lblCounting = new JLabel("");
		lblCounting.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_0.png")));
		lblCounting.setBounds(10, 95, 70, 380);
		add(lblCounting);
		
		// Game Mode Card and Panel
		if(Constant.IS_EASY_MODE)
		{
			EasyMode(lblCounting);
		}
		if(Constant.IS_MEDIUM_MODE)
		{
			MediumMode(lblCounting);
		}
		if(Constant.IS_HARD_MODE)
		{
			HardMode(lblCounting);
		}
		
		//BackGround
		if(Constant.IS_DARK)
			lblBackGround.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/dark_forest_background.gif")));
		else
			lblBackGround.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/fantasy_background.gif")));
		lblBackGround.setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		add(lblBackGround);

	}
	public void EasyMode(JLabel lblcount)
	{
		final int Col = 4;
		final int Row = 3;
		JPanel panel = new JPanel();
		panel.setBounds(250, 100, Constant.PANEL_EASY_MODE_WIDTH, Constant.PANEL_EASY_MODE_HEIGHT);
		panel.setOpaque(false);
		panel.setLayout(null);
		add(panel);
		Constant.COUNTING_PAIR = (Col*Row)/2;  
		int A[] = Methods.randomArray(Row, Col);
		for(int i = 0 ; i< Col; i++)
		{
			for (int j = 0 ; j< Row; j++ ) 
			{
			 
				MyJButton btn = new MyJButton();
				btn.setIndex(A[i*Row+j]);
				btn.setContentAreaFilled(false);
				btn.cardBack();
				btn.setBorder(null);
				btn.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						
						if(!(isAlive) || nextButton ==null)//Neu chua sleep hoac nextB chua duoc nhan thi chay
						{
								btn.setImage();
								if(!Constant.IS_MUTED)
									Music.playFlip();
								if(currentButtonisClick & currentButton != btn)
								{
									nextButton = btn;
									nextButtonisClick = true;
									currentButtonisClick = false;
								}
								else
								{
									if(currentButtonisClick & currentButton == btn) {
										currentButtonisClick = false;
										currentButton.cardBack();
										if(nextButton!=null)
										{
											nextButton.cardBack();
											nextButtonisClick = false;
										}
										currentButton = null;
										nextButton = null;
									}
									else 
									{
										currentButtonisClick = true;
										currentButton = btn;
									}
								}
								if(currentButton != null)
									System.out.println(currentButton.getIndex());
								if(nextButton != null)
									System.out.println(nextButton.getIndex());
								Thread t =new Thread() 
								{
									public void run()
									{
										try 
										{
											isAlive= true;
											Thread.sleep(1000);
										} 
										catch (InterruptedException e) 
										{
											e.printStackTrace();
										}
										
										if(currentButton !=null && nextButton !=null && nextButtonisClick)
										{
											if(currentButton.getIndex() == nextButton.getIndex())
											{
												currentButton.setVisible(false);
												nextButton.setVisible(false);
												Constant.COUNTING_PAIR--;
												UI.checkProgressBar(lblcount);
												checkEndGame();
											}
											currentButton.cardBack();
											nextButton.cardBack();
											currentButton = null;
											nextButton = null;
											
										}
										isAlive = false;
									}
									
								};
									t.start();
					}
					}
				});
				btn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						if(!isAlive)
						if(currentButtonisClick)
						{
							currentButton.setImage();
							if(btn!=currentButton)
								btn.lightcardBack();
						}
						else
							btn.lightcardBack();
					}
					@Override
					public void mouseExited(MouseEvent e) {
						if(!isAlive)
						if(!currentButtonisClick)
							btn.cardBack();
						else
						{
							currentButton.setImage();
							if(btn!=currentButton)
								btn.cardBack();
						}
					}
				});
				btn.setBounds(i*(Constant.CARD_WIDTH+10),10+j*(Constant.CARD_HEIGHT+10),Constant.CARD_WIDTH,Constant.CARD_HEIGHT);
				panel.add(btn);
			}
		}
		// Panel for Easy Mode
		JLabel lblPanel = new JLabel("");
		lblPanel.setBounds(225, 80, Constant.PANEL_EASY_MODE_WIDTH, Constant.PANEL_EASY_MODE_HEIGHT+40);
		lblPanel.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/panel_easyMode.png")));
		add(lblPanel);
	}
	public void MediumMode(JLabel lblcount)
	{
		final int Col = 5;
		final int Row = 4;
		JPanel panel = new JPanel();
		panel.setBounds(200, 30, Constant.PANEL_MEDIUM_MODE_WIDTH, Constant.PANEL_MEDIUM_MODE_HEIGHT);
		panel.setOpaque(false);
		panel.setLayout(null);
		add(panel);
		Constant.COUNTING_PAIR = (Row*Col)/2;
		int A[] = Methods.randomArray(Row, Col);
		for(int i = 0 ; i< Col; i++)
		{
			for (int j = 0 ; j< Row; j++ ) 
			{
				MyJButton btn = new MyJButton();
				btn.setIndex(A[i*Row+j]);
				btn.setContentAreaFilled(false);
				btn.cardBack();
				btn.setBorder(null);
				btn.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						if(!(isAlive) || nextButton ==null)
						{
								btn.setImage();
								if(!Constant.IS_MUTED)
									Music.playFlip();
								if(currentButtonisClick & currentButton != btn)
								{
									nextButton = btn;
									nextButtonisClick = true;
									currentButtonisClick = false;
								}
								else
								{
									if(currentButtonisClick & currentButton == btn) 
									{
										currentButtonisClick = false;
										currentButton.cardBack();
										if(nextButton!=null)
										{
											nextButton.cardBack();
											nextButtonisClick = false;
										}
										currentButton = null;
										nextButton = null;
									}
									else 
									{
										currentButtonisClick = true;
										currentButton = btn;
									}
								}
								Thread t =new Thread() 
								{
									public void run()
									{
										try 
										{
											isAlive= true;
											Thread.sleep(1000);
										} 
										catch (InterruptedException e) {}
										if(currentButton !=null && nextButton !=null && nextButtonisClick)
										{
											if(currentButton.getIndex() == nextButton.getIndex())
											{
												currentButton.setVisible(false);
												nextButton.setVisible(false);
												Constant.COUNTING_PAIR--;
												UI.checkProgressBar(lblcount);
												checkEndGame();
											}
											currentButton.cardBack();
											nextButton.cardBack();
											currentButton = null;
											nextButton = null;
										}
										isAlive = false;
									}
									
								};
								t.start();
						}
					}
				});
				btn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						if(!isAlive)
						if(currentButtonisClick)
						{
							currentButton.setImage();
							if(btn!=currentButton)
								btn.lightcardBack();
						}
						else
							btn.lightcardBack();
					}
					@Override
					public void mouseExited(MouseEvent e) {
						if(!isAlive)
						if(!currentButtonisClick)
							btn.cardBack();
						else
						{
							currentButton.setImage();
							if(btn!=currentButton)
								btn.cardBack();
						}
					}
				});
				btn.setBounds(i*(Constant.CARD_WIDTH+10),10+j*(Constant.CARD_HEIGHT+10),Constant.CARD_WIDTH,Constant.CARD_HEIGHT);
				panel.add(btn);
			}
		}
		
		// Panel for Medium
		JLabel lblPanel = new JLabel("");
		lblPanel.setBounds(170, 10, Constant.PANEL_MEDIUM_MODE_WIDTH, Constant.PANEL_MEDIUM_MODE_HEIGHT+40);
		lblPanel.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/panel_mediumMode.png")));
		add(lblPanel);

	}
	public void HardMode(JLabel lblcount)
	{
		final int Col = 6;
		final int Row = 4;
		JPanel panel = new JPanel();
		panel.setBounds(130, 30, Constant.PANEL_HARD_MODE_WIDTH, Constant.PANEL_HARD_MODE_HEIGHT);
		panel.setOpaque(false);
		add(panel);
		panel.setLayout(null);
		Constant.COUNTING_PAIR = (Col*Row)/2;
		int A[] = Methods.randomArray(Row, Col);
		for(int i = 0 ; i< Col; i++)
		{
			for (int j = 0 ; j< Row; j++ ) 
			{
				MyJButton btn = new MyJButton();
				btn.setIndex(A[i*Row+j]);
				btn.setContentAreaFilled(false);
				btn.cardBack();
				btn.setBorder(null);
				btn.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						
						if(!(isAlive) || nextButton ==null)//Neu chua sleep va nextB chua duoc nhan thi chay
						{
								btn.setImage();
								if(!Constant.IS_MUTED)
									Music.playFlip();
								if(currentButtonisClick & currentButton != btn)
								{
									nextButton = btn;
									nextButtonisClick = true;
									currentButtonisClick = false;
								}
								else
								{
									if(currentButtonisClick & currentButton == btn) {
										currentButtonisClick = false;
										currentButton.cardBack();
										if(nextButton!=null)
										{
											nextButton.cardBack();
											nextButtonisClick = false;
										}
										currentButton = null;
										nextButton = null;
									}
									else 
									{
										currentButtonisClick = true;
										currentButton = btn;
									}
								}
								if(currentButton != null)
									System.out.println(currentButton.getIndex());
								if(nextButton != null)
									System.out.println(nextButton.getIndex());
								Thread t =new Thread() 
								{
									public void run()
									{
										try 
										{
											isAlive= true;
											Thread.sleep(1000);
										} 
										catch (InterruptedException e) 
										{
											e.printStackTrace();
										}
										
										if(currentButton !=null && nextButton !=null && nextButtonisClick)
										{
											if(currentButton.getIndex() == nextButton.getIndex())
											{
												currentButton.setVisible(false);
												nextButton.setVisible(false);
												Constant.COUNTING_PAIR--;
												UI.checkProgressBar(lblcount);
												checkEndGame();
											}
											currentButton.cardBack();
											nextButton.cardBack();
											currentButton = null;
											nextButton = null;
											
										}
										isAlive = false;
									}
									
								};
									t.start();
							}
					}
				});
				btn.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						if(!isAlive)
						if(currentButtonisClick)
						{
							currentButton.setImage();
							if(btn!=currentButton)
								btn.lightcardBack();
						}
						else
							btn.lightcardBack();
					}
					@Override
					public void mouseExited(MouseEvent e) {
						if(!isAlive)
						if(!currentButtonisClick)
							btn.cardBack();
						else
						{
							currentButton.setImage();
							if(btn!=currentButton)
								btn.cardBack();
						}
					}
				});
				btn.setBounds(i*(Constant.CARD_WIDTH+10),10+j*(Constant.CARD_HEIGHT+10),Constant.CARD_WIDTH,Constant.CARD_HEIGHT);
				panel.add(btn);
			}
		}
		//Panel for Hard
		JLabel lblPanel = new JLabel("");
		lblPanel.setBounds(90, 10, Constant.PANEL_HARD_MODE_WIDTH, Constant.PANEL_HARD_MODE_HEIGHT+40);
		lblPanel.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/panel_HardMode.png")));
		add(lblPanel);
	}
	@Override
	public void run() {}
	public void checkEndGame()
	{
		if(Constant.COUNTING_PAIR == 0)
		{
			P_Finish p = new P_Finish();
			Fr_MemoryGame.MainPanel.removeAll();
			Fr_MemoryGame.MainPanel.add(p);
			p.setLayout(null);
			Fr_MemoryGame.MainPanel.repaint();
		}
	}
}
