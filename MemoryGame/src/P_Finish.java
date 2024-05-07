import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class P_Finish extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public P_Finish() {
		setOpaque(false);
		setLayout(null);
		setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		Constant.IS_ON_GAMEMODE = false;
		Constant.IS_ON_START = false;
		
		//Finish Name with icon
		JLabel lblFinishName = new JLabel("");
		lblFinishName.setIcon(new ImageIcon(P_Start.class.getResource("/Images/FinishGame.png")));
		lblFinishName.setBounds(220, 50, 600, 160);
		add(lblFinishName);
		for(int i = 0 ; i<5;i++)
		{	
			JLabel lblCoin = new JLabel("");
			lblCoin.setIcon(new ImageIcon(P_Start.class.getResource("/Images/coin.gif")));
			if(i<5)
				lblCoin.setBounds(180+110*i, 145, 100, 100);
			else
				lblCoin.setBounds(180+110*i, 90, 100, 100);
			add(lblCoin);
		}
		for(int i = 0 ; i<5;i++)
		{	
			JLabel lblCoin = new JLabel("");
			lblCoin.setIcon(new ImageIcon(P_Start.class.getResource("/Images/coin.gif")));
			lblCoin.setBounds(180+110*i, 15, 100, 100);
			add(lblCoin);
		}
		
		// Replay
		JButton btnReplay = new JButton("");
		UI.addReplayButtonFunc(btnReplay);
		btnReplay.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_green_replay_button.png")));
		btnReplay.setBorder(null);
		btnReplay.setContentAreaFilled(false);
		btnReplay.setBounds(380, 370, 120, 120);
		add(btnReplay);
		
		// Home
		JButton btnHome = new JButton("");
		UI.addHomeButtonFunc_Finish(btnHome);
		btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/green_home_button.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(null);
		btnHome.setBounds(805, 10, 90, 90);
		add(btnHome);
		
		// Box for Game Name
		JLabel lblBox = new JLabel("");
		lblBox.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/box_gameName.png")));
		lblBox.setBounds(160, 30, 600, 200);
		add(lblBox);
		
		//BackGround
		JLabel lblBackGround = new JLabel("");
		if(Constant.IS_DARK)
			lblBackGround.setIcon(new ImageIcon(P_Finish.class.getResource("/Images/dark_forest_background.gif")));
		else
			lblBackGround.setIcon(new ImageIcon(P_Finish.class.getResource("/Images/fantasy_background.gif")));
		lblBackGround.setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		add(lblBackGround);
	}
}














