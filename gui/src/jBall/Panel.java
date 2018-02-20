package jBall;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel implements ActionListener {
	JFrame fr;
	ball bl;
	int x,y;
	public Panel() {
		init();
	}

	private void init() {
		fr = new JFrame();
		bl = new ball();
		Component c = fr.getContentPane();
		c.setBackground(Color.blue);
		fr.setVisible(true);
		fr.add(bl);
		x=5;y=3;
		fr.setLocationRelativeTo(null);
		fr.setSize(400, 400);
		Timer t = new Timer(30, this);
		t.start();
	}

	class ball extends JPanel {
		public int x = 5, y = 3;

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2 = (Graphics2D) g;
			g2.fillOval(x, y, 20, 20);

		}

	}

	public void actionPerformed(ActionEvent e) {
		
		
		if (fr.getWidth()-40==bl.x) {
			x=-5;
		}
		if (fr.getHeight()-40==bl.y) {
			y=-3;
		}
		if(bl.x==0){
			x=5;
		}
		if(bl.y==0){
			y=3;
		}
		bl.x+=x;
		bl.y+=y;
		bl.repaint();
	}

	public static void main(String args[]) {
		Panel p = new Panel();
	}

}
