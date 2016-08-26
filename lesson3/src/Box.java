abstract class Box {
	public abstract void begin();
	public void show(){System.out.println("Shows from box");}
}

class A extends Box{
	
	public  void begin()
	{
		System.out.println("A class begin");
	}
	public void show()
	{
		System.out.println("Shows from A");
	}
}

class  B extends Box{
	
	public  void begin()
	{
		System.out.println("A class begin");
	}
	public void show(){System.out.println("Shows from B");}
}
class  C extends B{
	public void show(){System.out.println("Shows from C");}
}

class demo{
	
	public static void main(String args[])
	{
	
		A a= new A();
		Box n1;
		n1=a;
		n1.begin();
				
	}
}

