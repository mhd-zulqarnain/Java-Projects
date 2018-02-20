import java.io.*;
import java.util.*;
public class ReadSerlizObject {

	public static void main(String args[]){
		ArrayList<SerlizDemo> arS=new ArrayList<SerlizDemo>();
		SerlizDemo d1;
		try{
		
		FileInputStream in= new FileInputStream("file.dat");
		ObjectInputStream rd=new ObjectInputStream(in);
		arS=(ArrayList)rd.readObject();
		for(int i=0;i<arS.size();i++){
			d1=(SerlizDemo)arS.get(i);
			d1.show();
		}
		
		}catch(Exception e){
			System.out.println("error "+e);
		}
		
		
	}
}
