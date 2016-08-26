package animi;

public class Dog extends Animal {

	public Dog(){
		super();
		setSound("Brack");
		flyingType= new canFly();
		
	}
	
	public void digHole(){
		System.out.println("Dug a hole");
	}
	
	
}
