
public class orderArms {
	
	private String Range;
	private double speed;
	
	public void setRange(String newRange){
		
		this.Range=newRange;
	}
	
	public String getRange(){
		return Range;
	}

	public void setSpeed(double newSpeed){
		
		this.speed=newSpeed;
	}
	
	public double getSpeed(){
		return speed;
	}
	
public void armsStatus()
{
	System.out.println("The arm range is: "+getRange()+"\n The speed is: "+getSpeed());
	}
}
