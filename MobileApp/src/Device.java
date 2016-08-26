
public class Device {

	public static void main(String args[])

	{
		mailController mail= new mailController();
		userMail user1= new userMail(mail);
		
		mail.receiveGmail("hey gppg");
		mail.receiveYmail("yahoo");
		
	}
	
}
