import java.io.*;
import java.nio.charset.Charset;
public class FileDemo {

	public static void main(String[] args) {
		
		String name="name";
		try{
		FileOutputStream out=new FileOutputStream("file.txt");
		out.write(name.getBytes(Charset.forName("UTF-8")));
		
		out.close();
		FileInputStream in= new FileInputStream("file.txt");
		
		
		}catch(Exception e){
			
		}
		
		
		
	}
}
