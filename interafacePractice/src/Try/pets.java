package Try;

public class pets {

	public Feeding feedType;
	private String name;
	private int number;
	
	
	public void setName( String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setNumber( int number){
		this.number=number;
	}
	public int getNumber(){
		return number;
	}
	
	public String whatToFeed()
	{
		return feedType.feeds();
	}
	public void changeFeed(Feeding feedType)
	{
		this.feedType=feedType;
	}
	
}
