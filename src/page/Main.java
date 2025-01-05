package forcedanlovegunchommind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import game.Game1;

public class Main extends JFrame implements ActionListener {
	public static void main(String[]args) {
		Main main = new Main();
	}
	JLabel lb = new JLabel("ODD ONE OUT!");
	JButton pbtn = new JButton("Play");
	JButton ebtn = new JButton("Exit");
	
	Main(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setTitle("OddOneOut Game");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		Font myFont1 = new Font("Serif", Font.BOLD, 24);
	    lb.setFont(myFont1);
		
		lb.setBounds(110,40,350,50);
		pbtn.setBounds(140,110,100,50);
		ebtn.setBounds(140,200,100,50);
		pbtn.setFocusable(false);
		ebtn.setFocusable(false);
		
		pbtn.addActionListener(this);
		ebtn.addActionListener(this);
		
		this.add(lb);
		this.add(pbtn);
		this.add(ebtn);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
		
		if(e.getSource()==pbtn) {
			Game1 g1 = new Game1();
		if (e.getSource()==ebtn) {
			 System.exit(0);
		}
		}
	}
}

	
