package forcedanlovegunchommind;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel{
	
	protected void paintComponent(Graphics g) {
		g.drawString("YOU WIN",168, 29);
		g.setColor(new Color(255,205,42));
		g.fillOval(119, 40, 150, 150);
		g.setColor(Color.BLACK);
		g.fillOval(155, 85, 20, 20);
		g.setColor(Color.BLACK);
		g.fillOval(210, 85, 20, 20);
		g.setColor(Color.WHITE);
		g.fillArc(144, 85, 100,80, 180, 180);}

}
