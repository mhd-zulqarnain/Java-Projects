package File;
import java.util.*;
import java.io.*;

public class File2 extends Entity implements Runnable{
	
	public File2(String fileName) throws FileNotFoundException {
		super(fileName);
	}

	public void run(){
		read();
	}

}
