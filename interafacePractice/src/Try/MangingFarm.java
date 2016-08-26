package Try;

public class MangingFarm {

	public static void main(String[] args) {
	
		pets kiti = new Goat();
		pets bimo = new Hen();
		System.out.println(((Goat)kiti).milking());
		pets[] pet= new pets[2];
		pet[1]=kiti;
		pet[0]=bimo;
		
		System.out.println(pet[1].whatToFeed());
		System.out.println(pet[0].whatToFeed());

		
	}


}

