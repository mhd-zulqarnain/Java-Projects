/*public class newThread implements Runnable {
	Thread t;

	public newThread() {
		t = new Thread(this, "Demo threadd");
		System.out.println("Child thread " + t);
		t.start();
	}

	public void run() {
		for (int i = 5; i > 0; i--) {
			try {
				System.out.println("Child thread: " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Child interupted");
			}
		}

		System.out.println("child thread terminted");
	}

	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		t.setName("myMain");
		new newThread();
		for (int j = 0; j < 5; j++) {
			try {
				System.out.println("main Thread:" + j);
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Main Interupted");
			}
		}
		System.out.println(t.getName() + " thread terminted");
	}

}
*/