package Serilization;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class SerlizServeer {

	public static void main(String args[]) 
	{
		PersonDemo P;
		ArrayList<PersonDemo> arr= new ArrayList<PersonDemo>();
		try {
			ServerSocket ss=new ServerSocket(2222);
			
			while(true){
				System.out.println("Waiting....");
				Socket s=ss.accept();
				System.out.println("Connection received");
				
				InputStream is= s.getInputStream();
				ObjectInputStream ins=new ObjectInputStream(is);
				
				System.out.println("Getting data");
				P=(PersonDemo)ins.readObject();
				P.show();
				s.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
