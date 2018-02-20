import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guiBall2 {
	JFrame fr;
	test P;
	keyTest K;
	int x=3;
	int y=5;
	public guiBall2(){
		init();
	}
	
	class handler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(fr.getWidth()-40==P.mX)
				x=-5;
			if(fr.getWidth()-40==P.mY)
				y=-3;
			if(P.mX==0)
				x=5;
			if(P.mY==0)
				y=3;
			P.mX+=x;
			P.mY+=y;
			
			P.repaint();
		}

	}
	void init(){
		fr=new JFrame();
		P= new test();
		K= new keyTest();
//		Container c= fr.getContentPane();
//		c.setLayout(new BorderLayout());
//		fr.add(P,BorderLayout.CENTER);
//		fr.add(K,BorderLayout.WEST);
		fr.add(P);
		fr.add(K);
		fr.setSize(300,300);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		handler h= new handler();
	      new Timer(30, new ActionListener(){
			
			 public void actionPerformed(ActionEvent e) {
				if(fr.getWidth()-30==P.mX)
					x=-5;
				if(fr.getWidth()-30==P.mY)
					y=-3;
				if(P.mX==0)
					x=5;
				if(P.mY==0)
					y=3;
				
				P.mX+=x;
				P.mY+=y;
				
				P.repaint();
			}
			 }).start();
		keyHandler h1= new keyHandler();
		fr.addKeyListener(h1);
		
	}
//---------------
	class keyHandler extends KeyAdapter{
		int y=10;
		public void keyPressed(KeyEvent e){
			
			if(e.getKeyCode()==KeyEvent.VK_UP){
				y=-10;
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN){
				y=+10;
			}
			if(fr.getHeight()-70==K.mY){
				y=-10;
			}
			if(K.mY==0){
				y=10;
			}
			K.mY+=y;
			K.repaint();
		}
	}
	class keyTest extends JPanel {
		int mY=10;
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2= (Graphics2D)g;
			
			g2.setColor(Color.BLUE);
			g2.fillRect(5,mY, 10, 40);
		}
	}
//	-------------------
	public static void main(String args[]){
		guiBall2 f= new guiBall2();
	}
	class test extends JPanel {
		int mX,mY;
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2= (Graphics2D)g;
			
			g2.setColor(Color.BLUE);
			g2.fillOval(mY,mX, 15, 15);
		}
	}
	



}
