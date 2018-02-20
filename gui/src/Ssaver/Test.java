package Ssaver;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
public class Test extends JApplet implements ActionListener{
	public static int x=1400,y=700;
	Color c;
	Font f;
	int counter;
	
	public Test(){
		
		init();
		
	}
	public void init(){
		setBackground(Color.white);
		counter=0;
		Timer t= new Timer(1000,this);
		t.start();
	}
	
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		counter++;
		if(counter==10){
			g2.clearRect(0, 0, x,y);
			counter=0;
		}
		for(int i=0;i<=40;i++){
			
			g2.setColor(cColor());
			g2.setFont(cFont());
			
			drawText(g2);
		}
	}
	
	public void drawText(Graphics g){
		int xx=(int)(Math.random()*x);
		int yy=(int)(Math.random()*y);
		
		g.drawString("java", xx, yy);
	}
	public Color cColor(){
		int r,g,b;
		r= (int)(Math.random()*255);
		g= (int)(Math.random()*255);
		b= (int)(Math.random()*255);
		c=new Color(r,g,b);
		
		return c;
	}
	
	public Font cFont(){
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
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}

	public static void main(String args[]){
		Test t1= new Test();
	}
	
}
