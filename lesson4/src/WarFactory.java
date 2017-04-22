
public class WarFactory {

	public static void main (String args[])
	{
		orderArms n1=null;
		
		n1= new lightArms();
		
		dostuff(n1);
	}
	
	public static void dostuff( orderArms n1)
	{
		n1.armsStatus();
	}
}
