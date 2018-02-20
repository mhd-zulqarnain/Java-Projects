
public class MyClass {

	public static void main (String args[])
	{
		Thread t1= new Thread(new Runnable() {
			
			public void run() {
				for (int i=0;i<9;i++)
				System.out.println("value:"+i);
			}
			});
		t1.start();
	}
}
