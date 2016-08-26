
public class animal {

	private String name;
	private String sound;
	private int weight;
	
	public void setName(String newName){newName=name;}
	public String getName(){return name;}
	
	public void setWeight(int newWeight){
		
		if(newWeight>0)
		weight=newWeight;
		else
			System.out.println("Weight must be greater than zero");
		}
	
	public int getWeight(){return weight;}
	
	
	public void setSound(String newSound){newSound=sound;}
	public String getSound(){return sound;}
	
}
