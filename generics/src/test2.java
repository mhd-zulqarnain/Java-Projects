
public class test2 {

	/**
	 * Generic method test
	 */
	
	public static<E> void print(E[] arr){
		System.out.println("class type"+arr[0].getClass());
		for(E num:arr){
			System.out.println("value "+num);
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		Integer arr[]={3,3,3,3};
		print(arr);
		String arrs[]={"a","c","d","g"};
		print(arrs);


	}

}
