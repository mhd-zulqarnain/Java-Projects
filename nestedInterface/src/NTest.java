
public class NTest implements B{

	
	
	
	public static void main(String[] args) {
		B test=new NTest();
		test.show();
		test.insert(12);
		 
	}

	public void show() {
		System.out.println("Function state");
		
	}

	public void insert(int a) {
		System.out.println("The value is "+a);
	}

}


interface C{
	void show();
}
interface B extends C{
	void insert(int a);
}