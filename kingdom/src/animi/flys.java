package animi;

public interface flys {
 String fly();
}

class canFly implements flys{

	public String fly() {
		return "Can fly";
	}}

class CantFly implements flys{
	
	public String fly()
	{
		return "can't Fly";
	}
	
}
