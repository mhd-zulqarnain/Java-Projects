import java.util.*;
import java.awt.*;
import javax.swing.*;

public class myPanel {
	JFrame fr;
	mPanl P;
	public myPanel() {

		init();
	}

	public void init() {
		fr= new JFrame();
		P= new mPanl();
		Container c=fr.getContentPane();
		c.setLayout(new BorderLayout());
		fr.add(P);
		fr.setVisible(true);
		fr.setSize(200,200);
		
	}

	
	
	private class mPanl extends JPanel {

		public void paintComponent(Graphics g) {

			super.paintComponent(g);

			Graphics2D grp = (Graphics2D)g;

			grp.drawRect(20, 20, 20, 20);
			grp.setColor(Color.blue);
			grp.fillOval(50, 50, 20,20);
			grp.drawString("test String",120,150);
		}
	}

	public static void main(String[] args) {
		myPanel f= new myPanel();
		
	}

}
