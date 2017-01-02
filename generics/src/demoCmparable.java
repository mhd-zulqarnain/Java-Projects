
public class demoCmparable {

	/**
	 * Maximum and minimun number using comparable 
	 */
	public static void main(String[] args) {
		
		Integer[] ini={4,3,2,4,2,11,3,222};
		myClass<Integer> fin=new myClass<Integer>(ini);
		System.out.println("The maximum number is "+fin.Tmax());

		String[] ini1={"asd","aaa","dsf"};
		myClass<String> fstr=new myClass<String>(ini1);
		System.out.println("The maximum number is "+fstr.Tmax());
	}

}

interface test<T extends Comparable<T>>{
	T Tmax();
	T Tmin();
}

class myClass<T extends Comparable<T>> implements test{
	T[] num;

	myClass(T[] num1){
		num=num1;
	}
	public T Tmax() {
		T max=num[0];
		for(int i=1;i<num.length;i++){
			if(max.compareTo(num[i])<0){
				max=num[i];
				}
		}
		return max;
	}

	public T Tmin() {
		// TODO Auto-generated method stub
		return null;
	}
	
}