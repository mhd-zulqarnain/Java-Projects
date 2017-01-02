import java.util.Random;

public interface sharedDocuments {
	int NO = 1;
	int YES = 2;
	int MAYBE = 3;
	int NEVER = 4;
}

class Question implements sharedDocuments {
	public int ask() {
		Random rand= new Random();
		int prob=(int)(90*rand.nextDouble());
		if(prob<30)
			return NO;

		if(prob<60)
			return YES;

		if(prob<75)
			return MAYBE;
		else
		return NEVER;
	}
}



