
public interface shape {
   void draw();
}

class squre implements shape{

	public void draw() {
	
	System.out.println("Lets draw a squre");	
	}
	
}
class circle implements shape{
	public void draw(){
		System.out.println("lets draw a circle");
	}
}
class rectangle implements shape{
	public void draw(){
		System.out.println("lets draw a Rectangle");
	}
}
