
public class mobileFactory {

	mobileSpeci moblie=null;
	
	public mobileSpeci mafuacture(int type)
	{
		if(type==1)
			return new samsungMbl();
		if(type==2)
			return new BBMbl();
		return null;
	}
	
}
