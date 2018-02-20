import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerDemo {

	/**
	 * @Inner class demo to use multiple classApater 
	 */
	JFrame fr;
	JLabel lable;
	
	public InnerDemo(){
	init();
	}
	public void init(){
		fr= new JFrame();
		lable= new JLabel();
		MouseHandler mh= new MouseHandler();
		windowHandler wh=new windowHandler();
		
		fr.addMouseMotionListener(mh);
		fr.addWindowListener(wh);
		
		Container c= fr.getContentPane();
		c.setLayout( new FlowLayout());
		fr.add(lable);
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		fr.setSize(200,200);
		
	
	}
	private class windowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			JOptionPane.showMessageDialog(null,"window close");
		}
	}
	
	private class MouseHandler extends MouseMotionAdapter{
		public void mouseMoved(MouseEvent e){
			int x=e.getX();
			int y=e.getY();
			lable.setText("Mouse moved ["+x+" "+y+"]");
			
		}
	}
	
	public static void main(String[] args) {
		
		InnerDemo de= new InnerDemo();
	}

}
