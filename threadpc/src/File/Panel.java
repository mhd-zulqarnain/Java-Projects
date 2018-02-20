package File;

import java.io.FileNotFoundException;

public class Panel {

	public static void main(String args[]) throws FileNotFoundException 
	{
		File1 f1=new File1("test1.txt");
		File1 f2=new File1("test2.txt");
		
		Thread t1= new Thread(f1);
		Thread t2= new Thread(f2);
		
		t1.start();
		t2.start();
	}
}
