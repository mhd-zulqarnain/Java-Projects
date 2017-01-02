package VU;
import javax.swing.*;
public class PersonInfo {

	String name;
	String address;
	String number;
	
	public PersonInfo(String name,String address,String number) {
		this.name=name;
		this.address=address;
		this.number=number;
	}
	public void showInfo(){
		 JOptionPane.showMessageDialog(null,"The name is "+name+" \n Address: "+address+" \n Number: "+number);
	}
	
	public void showall(){
	
	System.out.println("The number is"+number+" Address: "+address+" number: "+number);
	}

}
