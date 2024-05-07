import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class P_GameMode extends JPanel {

	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	public P_GameMode() {
		setOpaque(false);
		setLayout(null);
		setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		
		//Set Flag
		Constant.IS_ON_GAMEMODE = true;
		Constant.IS_ON_START = false;
		
		//Information
		JButton btnInformation = new JButton("");
		UI.addInfoButtonFunc(btnInformation);
		btnInformation.setBorder(null);
		btnInformation.setContentAreaFilled(false);
		btnInformation.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/green_info_button.png")));
		btnInformation.setBounds(10, 10, Constant.BUTTON_WIDTH, Constant.BUTTON_HEIGHT);
		add(btnInformation);
		
		//Volume
		JButton btnVolume = new JButton("");
		UI.addVolumeButtonFunc(btnVolume);
		if(Constant.IS_MUTED)
			btnVolume.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/grey_volumeOff_button.png")));
		else
			btnVolume.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/green_volumeOn_button.png")));
		btnVolume.setContentAreaFilled(false);
		btnVolume.setBorder(null);
		btnVolume.setBounds(805, 10,Constant.BUTTON_WIDTH, Constant.BUTTON_HEIGHT);
		add(btnVolume);
		
		//Home
		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/grey_exit_button.png")));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorder(null);
		UI.addHomeButtonFunc(btnHome);
		btnHome.setBounds(805, 235, Constant.BUTTON_WIDTH, Constant.BUTTON_HEIGHT);
		add(btnHome);
		
		//Light
		JButton btnLight = new JButton("");
		JLabel lblBackGround = new JLabel("");
		UI.addLightButtonFunc(btnLight, lblBackGround);
		if(Constant.IS_DARK)
			btnLight.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/light_grey_lightmode_button.png")));
		else
			btnLight.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/green_lightmode_button.png")));
		btnLight.setBounds(805, 120, 90, 90);
		btnLight.setBorder(null);
		btnLight.setContentAreaFilled(false);
		add(btnLight);
		
		// Game Name with icon
		JLabel lblGameName = new JLabel("");
		lblGameName.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/gameName.png")));
		lblGameName.setBounds(180, 50, 600, 160);
		add(lblGameName);
		JLabel lblCoin = new JLabel("");
		lblCoin.setIcon(new ImageIcon(P_Start.class.getResource("/Images/coin.gif")));
		lblCoin.setBounds(680, 50, 100, 100);
		add(lblCoin);
		
		// Box for Game Name
		JLabel lblBox = new JLabel("");
		lblBox.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/box_gameName.png")));
		lblBox.setBounds(160, 30, 600, 200);
		add(lblBox);
		
		// Game Mode Code:
		JLabel lblMode = new JLabel("");
		
		// Button Down
		JButton btnDown = new JButton("");
		UI.addDownButtonFunc(btnDown, lblMode);
		btnDown.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/green_down_button.png")));
		btnDown.setBounds(30, 460, 90, 90);
		btnDown.setContentAreaFilled(false);
		btnDown.setBorder(null);
		add(btnDown);
		
		//Button Up
		JButton btnUp = new JButton("");
		UI.addUpButtonFunc(btnUp, lblMode);
		btnUp.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/green_up_button.png")));
		btnUp.setContentAreaFilled(false);
		btnUp.setBorder(null);
		btnUp.setBounds(30, 350, 90, 90);
		add(btnUp);
		
		//Button Check
		JButton btnCheck = new JButton("");
		UI.addCheckButtonFunc(btnCheck);
		btnCheck.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/green_check_button.png")));
		btnCheck.setContentAreaFilled(false);
		btnCheck.setBorder(null);
		btnCheck.setBounds(770, 390, 120, 120);
		add(btnCheck);
		
		//Box GameMode
		if(Constant.IS_EASY_MODE)
			lblMode.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/box_gameMode_easy.png")));
		if(Constant.IS_MEDIUM_MODE)
			lblMode.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/box_gameMode_medium.png")));
		if(Constant.IS_HARD_MODE)
			lblMode.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/box_gameMode_hard.png")));
		lblMode.setBounds(160, 351, 600, 200);
		add(lblMode);
		
		//BackGround
		if(Constant.IS_DARK)
			lblBackGround.setIcon(new ImageIcon(Fr_MemoryGame.class.getResource("/Images/dark_forest_background.gif")));
		else
			lblBackGround.setIcon(new ImageIcon(Fr_MemoryGame.class.getResource("/Images/fantasy_background.gif")));
		lblBackGround.setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		add(lblBackGround);
	}
	
}