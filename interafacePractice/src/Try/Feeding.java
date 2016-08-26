package Try;

public interface Feeding {

 String feeds();
}

class isHarbivor implements Feeding{
	public String feeds()
	{
	  	return "Eat plants";
	}
}

class isCarnivor implements Feeding{
	public String feeds()
	{
	  	return "Eat both plants and meat";
	}
	public void check(){
		System.out.println("checking statment ");
	}
	
}