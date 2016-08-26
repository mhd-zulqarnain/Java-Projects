

public class GrabStocks{
public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);
         stockGrabber.setIBMPrice(197.00);
         stockGrabber.setAAPLPrice(123.00);
         stockGrabber.setGOOGPrice(197.00);
         
         
        
    }

}
