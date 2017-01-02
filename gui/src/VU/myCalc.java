package VU;
import javax.swing.*;
import java.awt.*;

public class myCalc {

	/**
	 * @Calaculator layout
	 */
	public myCalc(){
		init();
	}
	
	public void init (){
		JFrame calFrame;
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
		JButton bPlus,bClear,bMul,bPoint,bEqual,bMinus;
		JTextField cLable,cAns;
		JPanel pButton;
		
		
		calFrame= new JFrame();
		
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("4");
		b5= new JButton("5");
		b6= new JButton("6");
		b7= new JButton("7");
		b9= new JButton("9");
		b0= new JButton("0");
		b8= new JButton("8");
		
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMul = new JButton("*");
		bPoint = new JButton(".");
		bEqual = new JButton("=");
		bClear = new JButton("C");

		cLable= new JTextField("My Calculator");
		cAns= new JTextField();
		
		pButton= new JPanel(new GridLayout(4,4));
		pButton.add(b1);
		pButton.add(b2);
		pButton.add(b3);
		pButton.add(bClear);
		pButton.add(b4);
		pButton.add(b5);
		pButton.add(b6);
		pButton.add(bMul);
		pButton.add(b7);
		pButton.add(b8);
		pButton.add(b9);
		pButton.add(bMinus);
		pButton.add(b0);
		pButton.add(bPoint);
		pButton.add(bPlus);
		pButton.add(bEqual);
		
		Container c= calFrame.getContentPane();
		
		c.setLayout( new BorderLayout());
		
		c.add(cAns,BorderLayout.NORTH);
		c.add(pButton,BorderLayout.CENTER);
		c.add(cLable,BorderLayout.SOUTH);
		
		calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calFrame.setSize(400,400);
		calFrame.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myCalc n1= new myCalc();

	}

}
