package Ssaver;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;

public class Generator extends JApplet implements ActionListener {
	int r, g, b;
	Font f;
	Timer t;
	JFrame fr;
	int count;

	public Generator() {
		init();
		count = 0;
		setBackground(Color.white);
	}

	public void init() {
		/*fr = new JFrame();
		fr.setSize(400, 400);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);*/
		t = new Timer(1000, this);
		t.start();
	}

	public Color cSelect() {

		r = (int) (Math.random() * 255);
		g = (int) (Math.random() * 255);
		b = (int) (Math.random() * 255);

		Color n = new Color(r, g, b);
		return n;

	}

	public Font fSelect() {
		int op = (int) (Math.random() * 4) + 1;
		switch (op) {
		case 1:
			f = new Font("Serif", Font.ITALIC, 30);
			break;
		case 2:
			f = new Font("SansSerif", Font.BOLD, 17);
			break;
		case 3:
			f = new Font("Dialog", Font.PLAIN, 12);
			break;
		case 4:
			f = new Font("Monospaced", Font.PLAIN, 22);
			break;

		}
		return f;
	}

	public void paint(Graphics g) {
		
		count++;
		Graphics2D g2 = (Graphics2D) g;
		if(count==10){
			g2.clearRect(0, 0, 1400,700);count=0;
		}
		for (int i = 0; i <= 40; i++) {
			g2.setColor(cSelect());
			g2.setFont(fSelect());
			drawJava(g2);
		}
		
		
	}

	public void drawJava( Graphics g) {
		int x= (int)(Math.random()*1400);
		int y= (int)(Math.random()*700);
		
		g.drawString("java", x, y);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();

	}
}
