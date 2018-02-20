
package Serilization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class PersonDemo implements Serializable {

	String name,ph,ad;
	public PersonDemo(String nm,String ph,String ad){
		name=nm;
		this.ph=ph;
		this.ad=ad;
	}
	
	public void show(){
		System.out.println("Details are:"+name+" "+ph+" "+ad);
	}
	
	
	public static void main (String args[]){
		PersonDemo d1= new PersonDemo("ali", "433", "gulshan");
		PersonDemo d2= new PersonDemo("akram", "433", "gulshan");
		PersonDemo d3= new PersonDemo("ally", "433", "gulshan");
		
		ArrayList<PersonDemo> arr=new ArrayList<PersonDemo>();
		
		arr.add(d1);
		arr.add(d2);
		arr.add(d3);
		
 		try {
			FileOutputStream fs=new FileOutputStream("file.dat");
			ObjectOutputStream out=new ObjectOutputStream(fs);
			out.writeObject(arr);
		} catch (Exception e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
	}
}
