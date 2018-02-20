package Try;

import java.util.*;

public class StockGrabber implements Subject{
	private double goog;
	private double appl;	
	ArrayList<Observers> observers;
	
	public StockGrabber() {
		observers=new ArrayList<Observers>();
	}
	
	public void notifyObserver(){
	
	for(Observers ob: observers){
		System.out.println(observers.indexOf(ob)+1);
		ob.update(goog, appl);
	}
	
	}
	
	public void register(Observers O){
		observers.add(O);
	}

	public void unregister(Observers o) {
		int id=observers.indexOf(o);
		System.out.println(id+" Remove");
		observers.remove(id);
	}
	public void setApplPrice(double appP){
		appl=appP;
		notifyObserver();
	}
	public void setGoogPrice(double gooP){
		appl=gooP;
		notifyObserver();
	}
}
