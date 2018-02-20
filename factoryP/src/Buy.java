
public class Buy {
	
	private MobileType p1=null;
	
	public MobileType buy(String name){
		if(name.equals("s")){
			return new Smbl();
		}
		else if(name.equals("q")){
			return new Qmbl();
		}
		else
			return p1;
	}

}
