package forcedanlovegunchommind;
import javax.swing.*;
import java.awt.*;

public class YouWin extends JPanel {
			
	public YouWin(){
		JFrame f = new JFrame();
		JLabel lb_win = new JLabel("YOU WIN");
		Paint p = new Paint();
	
		f.add(p);
		f.setTitle("YOU WIN !!!!");
	    f.setSize(400,270);
		f.setVisible(true);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		YouWin uwin = new YouWin();
	}
}