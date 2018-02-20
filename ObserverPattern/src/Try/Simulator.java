package Try;

public class Simulator {

	public static void main(String args[]){
		StockGrabber st=new StockGrabber();
		StockOberver s2=new StockOberver(st);
		StockOberver s3=new StockOberver(st);
		

		st.setApplPrice(233.3);
		
	}
}
