import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class SerlizDemo implements Serializable{
	public String name,roll;
	
	
	public SerlizDemo(String nm,String rol){
		this.name=nm;
		this.roll=rol;
	}

	
	public void show (){
		System.out.println("Name "+name+" Roll "+roll);
	}
	
	public static void main(String args[]){
		SerlizDemo s1=new SerlizDemo("tes1", "3");
		ArrayList<SerlizDemo> arr=new ArrayList<SerlizDemo>();
		arr.add(s1);
		try{
		FileOutputStream in= new FileOutputStream("file.dat");
		ObjectOutputStream os=new ObjectOutputStream(in);
		os.writeObject(arr);
		
		}catch(Exception e)
		{
			System.out.println("Error "+e);
		}
		
		
	}
}
