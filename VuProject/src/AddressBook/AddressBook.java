package AddressBook;

import java.util.*;
import java.io.*;
public class AddressBook {

	/**
	 * @param args
	 */
	ArrayList person;
	AddressBook(){
		person =  new ArrayList();
	}
	
	void load(){
		try{
		FileReader fr= new FileReader("test.txt");
		BufferedReader br= new BufferedReader(fr);
		String[] token;
		String ph,nm,ad;
		String line=br.readLine();
		while(line!=" "){
			token=line.split(",");
			nm=token[0];
			ph=token[1];
			ad=token[2];
			
		PersonInfo p1=new PersonInfo(nm, ph, ad);
		person.add(p1);
		
		line=br.readLine();
				
		}
		
		}
		catch(IOException e){
		System.out.println("File not exisit "+e);
		}
	}
	

}
