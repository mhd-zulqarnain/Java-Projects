
public class GenMethD {

	/**
	 * @param args
	 */
	
	static <T,V extends T> boolean isIn(T x,V[] y){
		for(int i=0;i<y.length;i++){
		 if(x.equals(y[i])) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Integer[] a={3,2,2,1,6};
		
		if(isIn(7,a)){
			System.out.println("found");
		}else
			System.out.println("Not found");

		String[] str={"one","two","three"};
		if(isIn("th",str)){
			System.out.println("found");
		}else
		System.out.println("not found");
	}

}

