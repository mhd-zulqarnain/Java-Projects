import java.net.*;
public class InetAddressTest {

	public static void main (String args[]) throws UnknownHostException, MalformedURLException{
	 InetAddress ina=InetAddress.getLocalHost();
	 System.out.println(ina);
	 InetAddress ins=InetAddress.getByName("mhprofessional.com");
	 System.out.println(ins);
	 URL hp = new URL("http://www.osborne.com/downloads");
	 System.out.println("Protocol: " + hp.getProtocol());
	 System.out.println("Port: " + hp.getPort());
	 System.out.println("Host: " + hp.getHost());
	 System.out.println("File: " + hp.getFile());
	 System.out.println("Ext:" + hp.toExternalForm());
	}
}
