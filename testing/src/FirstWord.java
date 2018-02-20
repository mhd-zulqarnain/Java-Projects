
public class FirstWord {

	
	public static void main(String args[]){
		boolean start;
		String s1="java is a programming language";
		start=true;
		
		for(int i=0;i<s1.length();i++){
			if(start){
				System.out.println(s1.charAt(i));
			}
			if(s1.charAt(i)==' '){
				start=true;
			}
			else{
				start=false;
				
			}
				
		}
		
	}
	
}
