import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guiRecMov1 {

	
	recTest R;
	JFrame jr;
	private class recTest extends JPanel{ //1st Step make drawing using Jpanel features
		public int xy=20,xm=20;
		public void paintComponent(Graphics g){
			super.paintComponent(g);//clear previous paint
			
			Graphics2D g2=(Graphics2D)g;
			g2.setColor(Color.blue);
			g2.fillRect(xm,xy,20,20);
		}	
	}
	private class Handler extends MouseMotionAdapter { //2nd handler def
		
		public void mouseDragged(MouseEvent e){
			R.xm=e.getX();
			R.xy=e.getY();
			R.repaint();   //repaint at new location
		}
	}
	
	public guiRecMov1(){
		init();
	}
	
	private void init(){
		jr= new JFrame();
		R= new recTest();
		Container c= jr.getContentPane();
		c.setLayout(new BorderLayout());
		jr.add(R);
		jr.setSize(400,400);
		jr.setVisible(true);
		Handler h=new Handler();
		R.addMouseMotionListener(h);
		
	}
	public static void main(String[] args) {
		guiRecMov1 t= new guiRecMov1();

	}

}
