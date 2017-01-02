public class aliveTest implements Runnable {
	private String name;
	Thread t;

	aliveTest(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("Thread created:"+t);
		t.start();
	}

	public void run() {

		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(name+":"+i);
				t.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Intrupted: " + e);
		}
	}
	
	
	public static void main(String args[])
	{
		aliveTest t1= new aliveTest("one");
		aliveTest t2= new aliveTest("Two");
		aliveTest t3= new aliveTest("three");
		try {
			
				Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			System.out.println("Intrupted: " + e);
		}
		System.out.println("Main thread Exists");

		System.out.println("T1 is alive "+t1.t.isAlive());
	}
	
}
