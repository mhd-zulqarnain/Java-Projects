
public class test1 {

	public static void main(String args[]){
		Thread t=Thread.currentThread();
		System.out.println("current thread"+t);
		t.setName("my thread");
		System.out.println("After rename "+t);
		
	}
	
	
}
