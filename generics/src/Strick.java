
public class Strick {

	/**
	 * Bound generics
	 */
	public static void main(String[] args) {
		Integer[] arr={4,3,2,4,3,3};
		number<Integer> in=new number<Integer>(arr);
		in.average();
		

	}

}
class number<T extends Number>{
	
	T[] arr;
	
	number(T[] gr){
		arr=gr;
	}
	
	void average(){
		double arg=0;
		for(T d:arr){
			arg=arg+d.doubleValue();
		}
		System.out.println("the average is "+arg/arr.length);
	}
}
