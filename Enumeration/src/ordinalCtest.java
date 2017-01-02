
public class ordinalCtest {
	enum Apple{
		Jonathan, GoldenDel, RedDel, Winesap, Cortland
	}

public static void main(String args[]){
	Apple a1,ap1,ap2;
	/*for(Apple a : Apple.values()){
		System.out.println(a + " " + a.ordinal());
	}*/
	a1=Apple.RedDel;
	ap1=Apple.Winesap;
	ap2=Apple.Cortland;
	
	if(ap1.compareTo(ap2)>0){
		System.out.println("got you");
	}

}

}
