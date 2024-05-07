import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class P_Start extends JPanel {

	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	public P_Start() {
		
		setOpaque(false);
		setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		setLayout(null);
		
		//Set Constant's Flag
		Constant.IS_ON_GAMEMODE = false;
		Constant.IS_ON_START = true;
		
		//Music
		if(!Constant.IS_MUTED)
			Music.startBGMusic();
		
		// Game Name with icon
		JLabel lblGameName = new JLabel("");
		lblGameName.setIcon(null);
		lblGameName.setIcon(new ImageIcon(P_Start.class.getResource("/Images/gameName.png")));
		lblGameName.setBounds(180, 50, 600, 160);
		add(lblGameName);
		JLabel lblCoin = new JLabel("");
		lblCoin.setIcon(new ImageIcon(P_Start.class.getResource("/Images/coin.gif")));
		lblCoin.setBounds(680, 50, 100, 100);
		add(lblCoin);
		
		//Start Game
		JButton btnStartGame = new JButton("");
		btnStartGame.setBorder(null);
		btnStartGame.setContentAreaFilled(false);
		UI.addStartButtonFunc(btnStartGame);
		btnStartGame.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_green_play_button.png")));
		btnStartGame.setBounds(380, 370, 120, 120);
		add(btnStartGame);
		
		//Exit
		JButton btnExit = new JButton("");
		UI.addExitButtonFunc(btnExit);
		btnExit.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_home_button.png")));
		btnExit.setBorder(null);
		btnExit.setContentAreaFilled(false);
		btnExit.setBounds(805, 230, 90, 90);
		add(btnExit);
		
		//Information
		JButton btnInformation = new JButton("");
		
		UI.addInfoButtonFunc(btnInformation);
		btnInformation.setContentAreaFilled(false);
		btnInformation.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_info_button.png")));
		btnInformation.setBounds(10, 10, Constant.BUTTON_WIDTH, Constant.BUTTON_HEIGHT);
		btnInformation.setBorder(null);
		add(btnInformation);
		
		//Volume
		JButton btnVolume = new JButton("");
		UI.addVolumeButtonFunc(btnVolume);
		if(Constant.IS_MUTED)
			btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/grey_volumeOff_button.png")));
		else
			btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/green_volumeOn_button.png")));
		btnVolume.setContentAreaFilled(false);
		btnVolume.setBorder(null);
		btnVolume.setBounds(805, 10,Constant.BUTTON_WIDTH, Constant.BUTTON_HEIGHT);
		add(btnVolume);
		
		//Light
		JButton btnLight = new JButton("");
		JLabel lblBackGround = new JLabel("");
		UI.addLightButtonFunc(btnLight, lblBackGround);
		if(Constant.IS_DARK)
			btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_grey_lightmode_button.png")));
		else
			btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_lightmode_button.png")));
		btnLight.setBounds(805, 120, 90, 90);
		btnLight.setBorder(null);
		btnLight.setContentAreaFilled(false);
		add(btnLight);
		
		//Game Name Box
		JLabel lblBox = new JLabel("");
		lblBox.setIcon(new ImageIcon(P_Start.class.getResource("/Images/box_gameName.png")));
		lblBox.setBounds(160, 30, 600, 200);
		add(lblBox);
		
		//BackGround
		if(Constant.IS_DARK)
			lblBackGround.setIcon(new ImageIcon(P_Start.class.getResource("/Images/dark_forest_background.gif")));
		else
			lblBackGround.setIcon(new ImageIcon(P_Start.class.getResource("/Images/fantasy_background.gif")));
		lblBackGround.setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		add(lblBackGround);
	}
}
