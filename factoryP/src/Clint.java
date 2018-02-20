import java.util.*;
public class Clint {

	public static void main(String[] args){
		MobileType mbl;
		Buy shop= new Buy();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the mobile type \n 1.Samsung \n 2.BlackBerry \n");
		if(in.hasNextInt()){
			String name=in.nextLine();
			mbl=shop.buy(name);
			if(mbl!=null){
				showDetail(mbl);
			}else
				System.out.println("Invalid name ");
		}
	}
	public static void showDetail(MobileType t){
		System.out.println("Mobile name is "+t.getName());
		System.out.println("The Price id "+t.getPrice());
	}
}
