

public class User implements Observer{

	private boolean inStock;
	private static int OBSid=0;
	private int  ObserverID;
	
	private Observable Observe;
	
	public User(Observable Observable)
	{
		this.Observe=Observable;
		this.ObserverID=OBSid++;
		System.out.println("New user added Subscribe ID :"+ObserverID);
		Observable.addObserver(this);
		
			
	}
	public User(){}
	public void subscribe(User Obs){
		
	}
	
//	public void subscribe(Observable Obs)
//	{
//		this.Observe=Obs;
//		this.ObserverID=OBSid++;
//		System.out.println("New user added Subscribe ID :"+ObserverID);
//		Obs.addObserver(this);
//	}
	
	public void update(boolean inStock) {
		System.out.println("Update for ID:"+ObserverID);
		if(inStock==true)
		System.out.println("Dress is in stock");
		else
		System.out.println("Not now Comming soon");
				
	} 

	public void unsubscribe(){
		
	}
}
