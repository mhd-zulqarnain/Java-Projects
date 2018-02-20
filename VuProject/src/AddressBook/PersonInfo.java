package AddressBook;

import javax.swing.JOptionPane;

public class PersonInfo {

	/**
	 * @param args
	 */
	String nm,ph,ad;
	public PersonInfo(String nm,String ph,String ad){
	this.nm=nm;
	this.ph=ph;
	this.ad=ad;
	}
	public void showInfo(String name){
		
		JOptionPane.showMessageDialog(null,"Name is "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
