package animi;

public class Animal {
     
    private String name;
   
    private int weight;
    private String favFood;
    private double speed;
    private String sound;
    public  flys flyingType;

	public void setName(String newName){name=newName;}
	public String getName(){
	return name;
	}

	public void setSound(String newSound){sound=newSound;}
	public String getSound(){
	return sound;
	}
	
	public void setWeight(int newWeight){
		if(weight>0)
			newWeight=weight;
		else
			System.out.println("Enter the valid weight");
		}
	public void getWeight(){
	System.out.println("weight is "+weight);
	}
	
	public String tryToFly()
	{
		
		return flyingType.fly();
	}
	
	public void setFLyingAblity(flys flyingType)
	{
		this.flyingType=flyingType;
	}
}

