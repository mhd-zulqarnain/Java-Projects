import java.io.*;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SocClint {

	public static void main(String args[]) throws Exception{
		
		Socket s= new Socket("localhost",222);
		String name;
		name=JOptionPane.showInputDialog(null,"");
		
		OutputStream out=s.getOutputStream();
	
		
		
	}
}
