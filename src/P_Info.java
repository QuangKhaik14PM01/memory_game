import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P_Info extends JPanel {

	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	public P_Info() {
		setOpaque(false);
		setBounds(0, 0, Constant.MAIN_PANEL_WIDTH, Constant.MAIN_PANEL_HEIGHT);
		setLayout(null);
		
		JButton btnExit = new JButton("");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Constant.IS_ON_GAMEMODE)
				UI.showGameModePanel();
				if(Constant.IS_ON_START)
				UI.showStartPanel();
			}
		});
		btnExit.setIcon(new ImageIcon(P_Info.class.getResource("/Images/small_grey_exit_button.png")));
		btnExit.setContentAreaFilled(false);
		btnExit.setBorder(null);
		btnExit.setBounds(645, 60, 45, 45);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/small_light_grey_exit_button.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/small_grey_exit_button.png")));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/small_pressed_light_grey_exit_button.png")));
				Music.playClick_P();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnExit.setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/small_light_grey_exit_button.png")));
				Music.playClick_R();
			}
		});
		add(btnExit);
		
		JLabel lblInfo = new JLabel("");
		lblInfo.setBounds(150, 50, 550, 550);
		lblInfo.setIcon(new ImageIcon(P_Info.class.getResource("/Images/panel_gameInfo.png")));
		add(lblInfo);
		
		JLabel lblBackGroundInfo = new JLabel("");
		lblBackGroundInfo.setBounds(0, 0, Constant.MAIN_PANEL_WIDTH,Constant.MAIN_PANEL_HEIGHT);
		lblBackGroundInfo.setIcon(new ImageIcon(P_Info.class.getResource("/Images/panel_gameInfo_background.png")));
		add(lblBackGroundInfo);
	}
}
