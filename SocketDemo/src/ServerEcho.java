import java.io.*;
import java.net.*;

public class ServerEcho {

	public static void main(String argsp[]){
		String name,msg;
		try{
		ServerSocket ss= new ServerSocket(2222);
		System.out.println("Server started.......");
		
		while(true){
			Socket s=ss.accept();
			System.out.println("Connection request recived "+s.getPort());
			
			InputStream is= s.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			
			BufferedReader br= new BufferedReader(isr);
			
			name=br.readLine();
			msg="Hello "+name +" \n Thank you for connecting to " +ss.getLocalSocketAddress();
			
			OutputStream ir= s.getOutputStream();
			PrintWriter pw= new PrintWriter(ir,true);
			
			pw.println(msg);
				
			
			
		}
			
		}catch(Exception e)
		{
			System.out.println("Server Conection "+e);
		}
		
		
		
	}
	
}
