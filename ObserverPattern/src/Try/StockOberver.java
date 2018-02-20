package Try;

public class StockOberver implements Observers {
	private double appl;
	private double goog;
	
	private static int track=0;
	private Subject stockG;
	public StockOberver(Subject st){
		this.stockG=st;
		st.register(this);
		track++;
		System.out.println("Registered "+track);	
		
	}
	public void update(double goog, double appl) {
		System.out.println( "Google "+goog+"\nApple "+appl);
	}
}
