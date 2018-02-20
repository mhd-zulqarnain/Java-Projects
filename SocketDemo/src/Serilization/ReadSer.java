package Serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ReadSer implements Serializable{

	String name,ph,ad;
	
	
	public void show(){
		System.out.println("Details are:"+name+" "+ph+" "+ad);
	}
	
	
	public static void main (String args[]){
		
		ArrayList<PersonDemo> arr=new ArrayList<PersonDemo>();
		PersonDemo p1;
		
 		try {
 			FileInputStream fl=new FileInputStream("file.dat");
 			ObjectInputStream in=new ObjectInputStream(fl);
 			
 			arr=(ArrayList)in.readObject();
 			
 		} catch (Exception e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
 		
 		for(int i=0;i<arr.size();i++){
 			p1=(PersonDemo)arr.get(i);
 			p1.show();
 		}
		
	}

}
