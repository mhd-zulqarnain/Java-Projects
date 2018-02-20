	
public class Worker extends Thread {

	String j;
	public Worker(String j){
		this.j=j;
	}
	
	public void run(){
		for(int i=0;i<9;i++){
			System.out.println(j+i);
		}
	}
	
	public static void main(String args[]){
		Worker w1=new Worker("worker one ");
		Worker w2=new Worker("worker two ");
		Worker w3=new Worker("worker three ");
		
		Thread t1= new Thread(w1);
		Thread t2= new Thread(w2);
		Thread t3= new Thread(w3);
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
	
}
