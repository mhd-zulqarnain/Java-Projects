
public class wildcard {

	/**
	 * Wild card demo
	 */
	public static void main(String[] args) {
		Integer[] in={3,3,2,2,1};
		Float[] flt={4.3f,2.1f};
		 stats<Integer> ob1=new stats<Integer>(in);
		 stats<Float> ob2=new stats<Float>(flt);
		 
		 System.out.println(ob1.average());
		 ob2.compare(ob1);
		 
	}

}

class stats<T extends Number>{
	
	T[] arr;
	stats(T[] o){
		arr=o;
	}
	
	
   double average(){
	   double sum=0;
	   
	   for(T ar:arr){
		   sum=sum+ar.doubleValue();
	   }
	   return sum;
   }
   void compare(stats<?> ob){
	   System.out.println(ob.average());
	   System.out.println(average());
	   
   }
}
