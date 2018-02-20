package Try;

public interface Subject {
	 public void register(Observers o);
		
	    public void unregister(Observers o);
	
	    public void notifyObserver();
}
