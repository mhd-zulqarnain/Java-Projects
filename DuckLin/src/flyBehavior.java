
public interface flyBehavior {

	public void fly();
	
}

 class canfly implements flyBehavior{
	  
	 public void fly()
	 {
		 System.out.println("can fly");
	 }
}
 class cantFly implements flyBehavior{
	 
	 public void fly()
	 {
		 System.out.println("can't fly");
	 }
 }
 class flyRocketPowered implements flyBehavior
 {
	 public void fly(){
		 System.out.println("Can fly with rocket speed");
	 }
 }