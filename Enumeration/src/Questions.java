import java.util.Random;


public class Questions {

	static void answer(Answer result){
		switch(result){
		case YES:
			System.out.println("Yes");
		break;
		case No:
			System.out.println("no");
		break;
		case MayBe:
			System.out.println("Maybe");
		break;
		
		}
	}
	
	Answer ask(){
		Random rand=new Random();
		int prob=(int)(100*rand.nextDouble());
		
		if(prob>90){
			return Answer.YES;
		}
		else if(prob>60){
			return Answer.MayBe;
		}
		else
			return Answer.No;
	}
	
	public static void main(String args[]){
		Questions a = new Questions();
		answer(a.ask());
		answer(a.ask());
		answer(a.ask());
	}
	
}


enum Answer{
	YES,No,MayBe;
}