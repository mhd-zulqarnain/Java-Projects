package Serilization;
import java.io.*;
import java.net.*;
import java.util.*;


public class SerliaNetwClint {

	
	public static void main(String args[]){
		ArrayList<PersonDemo> arr=new ArrayList();
		PersonDemo P; 
		try {
			//File reading stuff
			FileInputStream ins= new FileInputStream("file.dat");
			ObjectInputStream obs=new ObjectInputStream(ins);
			arr=(ArrayList)obs.readObject();
			//File sending stuff to network
			for(int i=0;i<arr.size();i++){
				
			Socket s= new Socket("localhost",2222);
			OutputStream in=s.getOutputStream();
			ObjectOutputStream os=new ObjectOutputStream(in);
		
			
				P=(PersonDemo)arr.get(i);
				os.writeObject(P);
				s.close();	
			}
			
			//Response from server
			
		} catch (Exception e) {
			System.out.println("Connection error");
		}
	}
}
