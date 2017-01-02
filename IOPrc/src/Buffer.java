import java.io.*;


public class Buffer {

	
	public static void main (String args[])
	
		throws IOException{
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters 'Q' to quit");
		 
		char c;
		do{
			c=(char)br.read();
		}while(c!='q');
			
		System.out.println("Terminated");
		}
	
}
