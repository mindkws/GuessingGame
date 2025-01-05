package forcedanlovegunchommind;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameOver extends JFrame implements ActionListener {
	public static void main(String[]args) {
		GameOver g_over = new GameOver();
	}	
	JLabel lb = new JLabel("GAME OVER");
	JButton reset = new JButton();
	
	public GameOver(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setVisible(true);
		this.add(reset);
		this.add(lb);
		
		Font myFont1 = new Font("Serif", Font.BOLD, 24);
	    lb.setFont(myFont1);
		lb.setBounds(67,25,250,50);
		reset.setBounds(105,83,80,38);
		reset.setText("Restart");
		reset.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == reset) {
			Main main = new Main();
			this.dispose();
		  }
		}
	}
