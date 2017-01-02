
public class Execute {

	public static void main(String args[]){
		InStack sStack= new StaticStack(12);
		InStack sDyn= new DynStack(12);
		for(int i=1;i<12;i++)
		{
			sStack.push(i);
		}
		for(int i=1;i<20;i++)sDyn.push(i);  //DYNAMICALLY INCREASE THE STACK SIZE
		for(int i=1;i<20;i++)
		{
			System.out.println(sDyn.pop());
		}	
	}
}
