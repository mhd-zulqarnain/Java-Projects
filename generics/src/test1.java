
public class test1 {


	
	public static void main(String[] args) {
		gene<String> in=  new gene<String>("asd");
		in.showType();
		System.out.println("value "+in.getJob());
		
		gene<Integer> st= new gene<Integer>(55);
		st.showType();
		System.out.println("value "+st.getJob());
	}

}
class gene<T>{
	T ob;
	gene(T o){
		ob=o;
	}
	T getJob(){
		return ob;
	}
	
	void showType(){
		System.out.println("Type of T is "+ob.getClass().getName());
	}
}
