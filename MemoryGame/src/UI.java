import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class UI {

	public static void addHomeButtonFunc_Finish(JButton btnHome)
	{
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_green_home_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/green_home_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/pressed_light_green_home_button.png")));
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_green_home_button.png")));
				Music.playClick_R(); 
				returnHome();
			}
		});
	}
	public static void addReplayButtonFunc(JButton btnReplay)
	{
		btnReplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReplay.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_light_green_replay_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReplay.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_green_replay_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnReplay.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_pressed_light_green_replay_button.png")));
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnReplay.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_light_green_replay_button.png")));
				Music.playClick_R(); 
				showGameModePanel();
			}
		});
	}
	public static void addUpButtonFunc(JButton btnUp, JLabel lblMode)
	{
		btnUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUp.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_up_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUp.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_up_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(Constant.IS_EASY_MODE)
				{
					Constant.IS_EASY_MODE = false;
					Constant.IS_MEDIUM_MODE = true;
					Constant.IS_HARD_MODE = false;
				}
				else if(Constant.IS_MEDIUM_MODE)
				{
					Constant.IS_EASY_MODE = false;
					Constant.IS_MEDIUM_MODE = false;
					Constant.IS_HARD_MODE = true;
				}
				else if(Constant.IS_HARD_MODE)
				{
					Constant.IS_EASY_MODE = true;
					Constant.IS_MEDIUM_MODE = false;
					Constant.IS_HARD_MODE = false;
				}
				if(Constant.IS_EASY_MODE)
					lblMode.setIcon(new ImageIcon(P_Start.class.getResource("/Images/box_gameMode_easy.png")));
				if(Constant.IS_MEDIUM_MODE)
					lblMode.setIcon(new ImageIcon(P_Start.class.getResource("/Images/box_gameMode_medium.png")));
				if(Constant.IS_HARD_MODE)
					lblMode.setIcon(new ImageIcon(P_Start.class.getResource("/Images/box_gameMode_hard.png")));
				Music.playClick_P();
				btnUp.setIcon(new ImageIcon(P_Start.class.getResource("/Images/pressed_light_green_up_button.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnUp.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_up_button.png")));
				Music.playClick_R(); 
			}
		});
	}
	public static void addDownButtonFunc(JButton btnDown, JLabel lblMode)
	{
		btnDown.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDown.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_down_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDown.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_down_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(Constant.IS_EASY_MODE)
				{
					Constant.IS_EASY_MODE = false;
					Constant.IS_MEDIUM_MODE = false;
					Constant.IS_HARD_MODE = true;
				}
				else if(Constant.IS_MEDIUM_MODE)
				{
					Constant.IS_EASY_MODE = true;
					Constant.IS_MEDIUM_MODE = false;
					Constant.IS_HARD_MODE = false;
				}
				else if(Constant.IS_HARD_MODE)
				{
					Constant.IS_EASY_MODE = false;
					Constant.IS_MEDIUM_MODE = true;
					Constant.IS_HARD_MODE = false;
				}
				if(Constant.IS_EASY_MODE)
					lblMode.setIcon(new ImageIcon(P_Start.class.getResource("/Images/box_gameMode_easy.png")));
				if(Constant.IS_MEDIUM_MODE)
					lblMode.setIcon(new ImageIcon(P_Start.class.getResource("/Images/box_gameMode_medium.png")));
				if(Constant.IS_HARD_MODE)
					lblMode.setIcon(new ImageIcon(P_Start.class.getResource("/Images/box_gameMode_hard.png")));
				Music.playClick_P();
				btnDown.setIcon(new ImageIcon(P_Start.class.getResource("/Images/pressed_light_green_down_button.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnDown.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_down_button.png")));
				Music.playClick_R(); 
			}
		});
	}
	public static void addCheckButtonFunc(JButton btnCheck)
	{
		btnCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCheck.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/light_green_check_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCheck.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/green_check_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnCheck.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/pressed_light_green_check_button.png")));
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnCheck.setIcon(new ImageIcon(P_GameMode.class.getResource("/Images/light_green_check_button.png")));
				Music.playClick_R(); 
				showPlayGamePanel();
			}
		});
	}
	public static void addLightButtonFunc(JButton btnLight , JLabel lblBackGround)
	{
		btnLight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Constant.IS_DARK)
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_grey_lightmode_button.png")));
				else
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_lightmode_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(Constant.IS_DARK)
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_grey_lightmode_button.png")));
				else
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_lightmode_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(Constant.IS_DARK)
				{
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/pressed_light_grey_lightmode_button.png")));
					Constant.IS_DARK = false;
				}
				else
				{
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/pressed_light_green_lightmode_button.png")));
					Constant.IS_DARK = true;
				}
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(Constant.IS_DARK)
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_grey_lightmode_button.png")));
				else
					btnLight.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_lightmode_button.png")));
				if(Constant.IS_DARK)
					lblBackGround.setIcon(new ImageIcon(P_Start.class.getResource("/Images/dark_forest_background.gif")));
				else
					lblBackGround.setIcon(new ImageIcon(P_Start.class.getResource("/Images/fantasy_background.gif")));
				Music.playClick_R(); 
			}
		});
	}
	public static void addInfoButtonFunc(JButton btnInformation)
	{
		
		btnInformation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnInformation.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_info_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnInformation.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_info_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnInformation.setIcon(new ImageIcon(P_Start.class.getResource("/Images/pressed_light_green_info_button.png")));
				Music.playClick_P();
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnInformation.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_info_button.png")));
				if(Constant.IS_ON_START)
					showInfoPanel_start();
				if(Constant.IS_ON_GAMEMODE)
					showInfoPanel_gamemode();
				Music.playClick_R(); 
			}
		});
	}
	public static void addStartButtonFunc(JButton btnStartGame)
	{
		btnStartGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnStartGame.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_light_green_play_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnStartGame.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_green_play_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnStartGame.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_pressed_light_green_play_button.png")));
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnStartGame.setIcon(new ImageIcon(P_Start.class.getResource("/Images/big_light_green_play_button.png")));
				Music.playClick_R(); 
				showGameModePanel();
			}
		});
	}
	public static void addExitButtonFunc(JButton btnExit)
	{
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_home_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_Start.class.getResource("/Images/green_home_button.png")));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_Start.class.getResource("/Images/pressed_light_green_home_button.png")));
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_Start.class.getResource("/Images/light_green_home_button.png")));
				Music.playClick_R(); 
				exitGame();
			}
		});
	}
	public static void addHomeButtonFunc(JButton btnHome)
	{
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_grey_exit_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/grey_exit_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/pressed_light_grey_exit_button.png")));
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnHome.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_grey_exit_button.png")));
				Music.playClick_R(); 
				returnHome();
			}
		});
	}
	public static void addVolumeButtonFunc(JButton btnVolume)
	{
		btnVolume.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(Constant.IS_MUTED)
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_grey_volumeOff_button.png")));
				}
				else 
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_green_volumeOn_button.png")));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(Constant.IS_MUTED)
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/grey_volumeOff_button.png")));
				}
				else 
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/green_volumeOn_button.png")));
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if(Constant.IS_MUTED)
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/pressed_light_grey_volumeOff_button.png")));
					Constant.IS_MUTED = false;
				}
				else 
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/pressed_light_green_volumeOn_button.png")));
					Constant.IS_MUTED = true;
				}
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(Constant.IS_MUTED)
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_grey_volumeOff_button.png")));
					Music.stopBGMusic();
				}
				else 
				{
					btnVolume.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/light_green_volumeOn_button.png")));
					Music.startBGMusic();
				}
				Music.playClick_R(); 
			}	
		});
	}
	public static void checkProgressBar(JLabel lblcount)
	{
		if(Constant.IS_EASY_MODE) 
		{
			switch(Constant.COUNTING_PAIR)
			{
				case 6:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_0.png")));
					break;
				}
				case 5:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_2.png")));
					break;
				}
				case 4:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_4.png")));
					break;
				}
				case 3:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_6.png")));
					break;
				}
				case 2:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_8.png")));
					break;
				}
				case 1:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_10.png")));
					break;
				}
				case 0:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_12.png")));
					break;
				}
			}
		}
		if(Constant.IS_MEDIUM_MODE)
		{
			switch(Constant.COUNTING_PAIR)
			{
				
				case 10:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_0.png")));
					break;
				}
				case 9:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_1.png")));
					break;
				}
				
				case 8:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_2.png")));
					break;
				}
				case 7:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_4.png")));
					break;
				}
				case 6:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_5.png")));
					break;
				}
				case 5:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_6.png")));
					break;
				}
				case 4:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_8.png")));
					break;
				}
				case 3:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_9.png")));
					break;
				}
				case 2:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_10.png")));
					break;
				}
				case 1:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_11.png")));
					break;
				}
				case 0:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_12.png")));
					break;
				}
			}
		}
			
		if(Constant.IS_HARD_MODE)
		{
			switch(Constant.COUNTING_PAIR)
			{
				case 12:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_0.png")));
					break;
				}
				case 11:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_1.png")));
					break;
				}
				case 10:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_2.png")));
					break;
				}
				case 9:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_3.png")));
					break;
				}
				case 8:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_4.png")));
					break;
				}
				case 7:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_5.png")));
					break;
				}
				case 6:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_6.png")));
					break;
				}
				case 5:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_7.png")));
					break;
				}
				case 4:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_8.png")));
					break;
				}
				case 3:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_9.png")));
					break;
				}
				case 2:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_10.png")));
					break;
				}
				case 1:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_11.png")));
					break;
				}
				case 0:
				{
					lblcount.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/progressBar_12.png")));
					break;
				}
			}
		}
	}
	public static void returnHome()
	{
			P_Start p = new P_Start();
			Fr_MemoryGame.MainPanel.removeAll();
			Fr_MemoryGame.MainPanel.add(p);
			p.setLayout(null);
			Fr_MemoryGame.MainPanel.repaint();
	}
	public static void exitGame()
	{
		Fr_MemoryGame fr_MemoryGame = new Fr_MemoryGame();
		fr_MemoryGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.exit(0);
	}
	public static void showGameModePanel()
	{
		try {
			JPanel play = new P_GameMode();
			Fr_MemoryGame.MainPanel.removeAll();
			Fr_MemoryGame.MainPanel.add(play);
			play.setLayout(null);
			Fr_MemoryGame.MainPanel.repaint();
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		
	}
	public static void showPlayGamePanel()
	{
		try {
			JPanel play = new P_PlayWindow();
			Fr_MemoryGame.MainPanel.removeAll();
			Fr_MemoryGame.MainPanel.add(play);
			play.setLayout(null);
			Fr_MemoryGame.MainPanel.repaint();
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		
	}
	public static void showInfoPanel_start()
	{
				P_Info InfoPanel = new P_Info();
				P_Start p = new P_Start();
				Fr_MemoryGame.MainPanel.removeAll();
				Fr_MemoryGame.MainPanel.add(InfoPanel);
				Fr_MemoryGame.MainPanel.add(p);
				p.setLayout(null);
				Fr_MemoryGame.MainPanel.repaint();
	}
	public static void showInfoPanel_gamemode()
	{
				P_Info InfoPanel = new P_Info();
				P_GameMode p = new P_GameMode();
				Fr_MemoryGame.MainPanel.removeAll();
				Fr_MemoryGame.MainPanel.add(InfoPanel);
				Fr_MemoryGame.MainPanel.add(p);
				p.setLayout(null);
				Fr_MemoryGame.MainPanel.repaint();
	}
	public static void showStartPanel()
	{
		P_Start p = new P_Start();
		Fr_MemoryGame.MainPanel.removeAll();
		Fr_MemoryGame.MainPanel.add(p);
		p.setLayout(null);
		Fr_MemoryGame.MainPanel.repaint();
	}
	
	
	
	
	
}

