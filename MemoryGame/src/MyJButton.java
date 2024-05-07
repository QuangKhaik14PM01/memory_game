import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyJButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	public void cardBack()
	{
		ImageIcon image = new ImageIcon(P_PlayWindow.class.getResource("/Images/cardBack.png"));
		setIcon(image);
	}
	public void lightcardBack()
	{
		ImageIcon image = new ImageIcon(P_PlayWindow.class.getResource("/Images/light_cardBack.png"));
		setIcon(image);
	}
	public void setImage()
	{
		switch(index)
		{
		case 1:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_1.png")));
			break;
		case 2:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_2.png")));
			break;
		case 3:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_3.png")));
			break;
		case 4:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_4.png")));
			break;
		case 5:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_5.png")));
			break;
		case 6:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_6.png")));
			break;
		case 7:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_7.png")));
			break;
		case 8:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_8.png")));
			break;
		case 9:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_9.png")));
			break;
		case 10:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_10.png")));
			break;
		case 11:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_11.png")));
			break;
		case 12:
			setIcon(new ImageIcon(P_PlayWindow.class.getResource("/Images/card_12.png")));
			break;
		}
		
	}
	
	
}
