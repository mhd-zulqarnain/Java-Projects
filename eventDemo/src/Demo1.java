import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;

public class Demo1 implements ActionListener{    ///1st step for event handling implement desired interface
	JFrame jr;
	JButton btn; //event generator
	
	public Demo1(){
		init();
	}
	public void init (){
		
		jr = new JFrame();
		btn= new JButton("Hello");
		btn.addActionListener(this);     //3rd step to Registor event handler r link event generator to event handler
		
		Container c= jr.getContentPane();
		
		c.setLayout(new FlowLayout());
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.add(btn);
		jr.setSize(400,100);
		jr.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {  //2nd step define the implemeted method for event
		JOptionPane.showMessageDialog(null,"hello button click");
		
	}
	
	public static void main(String[] args) {
		
		Demo1 d1= new Demo1();
	}
	

}
