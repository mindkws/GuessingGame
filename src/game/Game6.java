package game;

import forcedanlovegunchommind.YouWin;
import forcedanlovegunchommind.GameOver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game6 extends JFrame implements ActionListener {
	
	JButton b1 = new JButton("");
	JButton b2 = new JButton("");
	JButton b3 = new JButton("");
	JButton b4 = new JButton("");
	JButton b5 = new JButton("");
	JButton b6 = new JButton("");
	JButton b7 = new JButton("");
	JButton b8 = new JButton("");
	JButton b9 = new JButton("");
	JFrame frame = new JFrame();
	JFrame gameover = new JFrame();
	JLabel l2 = new JLabel("Time: ");
	JLabel l1 = new JLabel("Score: 5");
	
	Timer timer = new Timer(1000,this);
    Timer countdown;
    int seconds = 3;
	int score = 0;
	
	Game6(){
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JButton btn = new JButton("Exit");
		
		p1.setLayout(new GridLayout(3,3,15,15));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		
		p2.setLayout(new GridLayout(1,1));
		p2.add(btn);
		p2.add(l1);
		p2.add(l2);
		
		frame.setTitle("OddOneOut Game");
		frame.setLayout(new BorderLayout());
		frame.add(p1,BorderLayout.CENTER);
		frame.add(p2,BorderLayout.SOUTH);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b1.setFocusable(false);
		b2.addActionListener(this);
		b2.setFocusable(false);
		b3.addActionListener(this);
		b3.setFocusable(false);
		b4.addActionListener(this);
		b4.setFocusable(false);
		b5.addActionListener(this);
		b5.setFocusable(false);
		b6.addActionListener(this);
		b6.setFocusable(false);
		b7.addActionListener(this);
		b7.setFocusable(false);
		b8.addActionListener(this);
		b8.setFocusable(false);
		b9.addActionListener(this);
		b9.setFocusable(false);
		
		p1.setVisible(true);
		
		btn.addActionListener((ActionEvent e) -> {
		    System.exit(0);
		});	
		
		b1.setBackground(new Color(137,104,89));
		b2.setBackground(new Color(137,104,89));
		b3.setBackground(new Color(137,104,89));
		b4.setBackground(new Color(137,104,89));
		b5.setBackground(new Color(137,104,89));
		b6.setBackground(new Color(137,104,89));
		b7.setBackground(new Color(137,104,89));
		b8.setBackground(new Color(131,104,89));
		b9.setBackground(new Color(137,104,89));
		
		countdowntimer();
		countdown.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if(e.getSource()==b8) {
			YouWin uwin = new YouWin();
			countdown.stop();
		}
		else if(e.getSource()==b1) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}	
		else if(e.getSource()==b2) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}	
		else if(e.getSource()==b3) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}	
		else if(e.getSource()==b4) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}
		else if(e.getSource()==b5) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}
		else if(e.getSource()==b6) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}
		else if(e.getSource()==b7) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}
		else if(e.getSource()==b9) {
			frame.dispose();
			GameOver g_over = new GameOver();
			countdown.stop();
		}
	}
	
	public void countdowntimer() {
		countdown = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l2.setText("Time: "+seconds);
				seconds--;

				if(seconds==-2) {
					countdown.stop();
					repaint();
					GameOver g_over = new GameOver();
					frame.dispose();
				} 
			}
		});
	}
	
	public static void main(String[]args) {
		Game5 g5 = new Game5();
	}
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}