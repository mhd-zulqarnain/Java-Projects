
public class herDemo {

	/**
	 * generic class hierarchy demo
	 */
	public static void main(String[] args) {
		
		Glas2<String,Integer> ne=new Glas2<String,Integer>("sd",4);
		
		ne.getValue1();
	}

}

class Glas1<T>{
	
	T ob;
	Glas1(T fr){
		ob=fr;
	}
	public void getValue1(){
		
		System.out.println(ob);
		}
}

class Glas2<T,V> extends Glas1<T>{
	V ob;
	Glas2(T fr,V gr) {
		super(fr);
		ob=gr;
	}
	
	public void getValue(){
	
	System.out.println(ob);
	}
	
}
