package File;

import java.io.*;
public class File1 extends Entity implements Runnable {
	
	public File1(String fileName) throws FileNotFoundException {
		super(fileName);
	}

	public void run(){
		read();
	}


}
