import java.io.*;
import java.net.*;
import javax.swing.*;

public class EchoClint {

	public static void main(String args[]) {

		try {
			
			Socket s = new Socket("localhost",2222);
			InputStream in = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String name;
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			name = JOptionPane.showInputDialog("Enter your name");
			
			pw.println(name);
			name=br.readLine();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
			
			JOptionPane.showMessageDialog(null,"Response from server "+name);
			s.close();
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Connection Error");
		}
	}

}
