import java.io.*;

public class LineBuffer {

	public static void main(String args[])
	throws IOException
	{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter senteence quit to exit");
		String str[]= new String[100];
		for(int i=0;i<10;i++){
		str[i]=br.readLine();
		if(str[i].equals("stop"))break;
		}
		for(int j=0;j<10;j++){
			if(str[j].equals("stop"))break;
			System.out.println(str[j]);
		}
		System.out.println("Terminated");
	}
}
