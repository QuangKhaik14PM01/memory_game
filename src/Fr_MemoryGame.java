import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Fr_MemoryGame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static JPanel MainPanel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fr_MemoryGame frame = new Fr_MemoryGame();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Fr_MemoryGame() {
		setTitle("Memory Card Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, Constant.MAIN_FRAME_WIDTH, Constant.MAIN_FRAME_HEIGHT);
		
		//Init Sound and Music
		Music.getBackGroundMusic("Music/background_2_sound.wav");
		
		//MainPanel
		MainPanel = new JPanel();
		MainPanel.setOpaque(false);
		MainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPanel);
		MainPanel.setLayout(null);
		
		//IntroducePanel
		P_Start p = new P_Start();
		MainPanel.removeAll();
		MainPanel.add(p);
		p.setLayout(null);
		MainPanel.repaint();
		
		
		
		
	}
	
	
	
	
}
