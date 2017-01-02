import java.util.ArrayList;


public class StockGrabber implements Subject{

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double gooPrice;
	private double applPrice;
	
	
	public StockGrabber (){
		observers=new ArrayList<Observer>();
		
	}
	
	public void registor(Observer o) {
		observers.add(o);
		
	}

	public void unRegistor(Observer o) {
	int index=observers.indexOf(o);
	System.out.println("User remove of id:"+index);
	observers.remove(index);
		
	}

	public void notifyObserver() {
		
		for(Observer obs:observers)
		{
			obs.update(ibmPrice, applPrice, gooPrice);
		}
	}
	

}
