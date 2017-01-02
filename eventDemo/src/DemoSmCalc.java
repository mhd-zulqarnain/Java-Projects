import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class DemoSmCalc implements ActionListener{
	JButton bPlus,bMul;
	JFrame fr;
	JTextField t1,t2,ans;
	JLabel first,second,answer;
	/**
	 * @param args
	 */
	public DemoSmCalc(){
		init();
	}
	public void init(){
		fr= new JFrame();
		bPlus= new JButton("+");
		bMul= new JButton("*");
		first = new JLabel("First number");
		second= new JLabel("2nd number");
		answer = new JLabel("Answer");
		
		t1= new JTextField(15);
		t2=new JTextField(15);
		ans= new JTextField(15);
		
		
		bPlus.setPreferredSize(new Dimension(70,25));
		bMul.setPreferredSize(new Dimension(70,25));
		bPlus.addActionListener(this);
		bMul.addActionListener(this);
		
		
		Container c=fr.getContentPane();
		c.setLayout(new FlowLayout());
		

		fr.add(first);
		fr.add(t1);
		fr.add(second);
		fr.add(t2);
		fr.add(bMul);
		fr.add(bPlus);
		fr.add(answer);
		fr.add(ans);
		
		fr.setSize(200,300);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		int num1,num2,res=0;
		num1=Integer.parseInt(t1.getText());
		num2=Integer.parseInt(t2.getText());
		
		if(e.getSource()==bPlus){
			res=num1+num2;
		}
		else if(e.getSource()==bMul){
			res=num1*num2;
		}
		
		ans.setText(res+"");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSmCalc d1= new DemoSmCalc();
			
	}
	

}
