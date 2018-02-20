import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class sideBar4{

	public JFrame fr;
	keyTest K;
	int x=3;
	int y=5;
	public sideBar4(){
		init();
	}
	void init(){
		fr=new JFrame();
		K= new keyTest();
		Container c= fr.getContentPane();
		c.setLayout(new BorderLayout());
		fr.add(K);
		fr.setSize(200,200);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		keyHandler h= new keyHandler();
		fr.addKeyListener(h);
		
		
	}
	
	


	class keyHandler extends KeyAdapter{
		int y=5;
		public void keyPressed(KeyEvent e){
			
			if(e.getKeyCode()==KeyEvent.VK_UP){
				y=-5;
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN){
				y=+5;
			}
			if(fr.getHeight()-60==K.mY){
				y=-5;
			}
			if(K.mY==0){
				y=5;
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
			g2.fillRect(5,mY, 10, 20);
		}
	}
	
	public static void main(String args[]){
		sideBar4 n= new sideBar4();
	}
	



}
