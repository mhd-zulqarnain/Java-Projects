package VU;
import java.awt.*;

import javax.swing.*;


public class Test1 {

	/**
	 * @param args
	 */
	
	public Test1(){
	init();
	}
	
	
	public void init (){
		JFrame myFrame = new JFrame();
		Container c=myFrame.getContentPane();
		
		//layout
		c.setLayout(new FlowLayout());
		
		JTextField jf= new JTextField(10);
		JButton jb= new JButton("New Button");
		
		c.add(jf);
		c.add(jb);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(200,200);
		myFrame.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t1= new Test1();

	}

}
