import java.util.Random;
public class enumAns{

public static void main(String args[])
 {
	Question q1= new Question();
	askMe(q1.ask());
		
 }

private static void askMe(Answer result) {
	 switch(result)
	 {
	 case yes:
	  System.out.println("YES");
	   break;
	 case no:
	  System.out.println("NO");
	   break;
	 case maybe:
	  System.out.println("MAYBE");
	   break;
	}// TODO Auto-generated method stub
	
}
	

}

class Question{

Random rand=new Random();
public Answer ask(){
int prob=(int)(100*rand.nextDouble());

if(prob>211)
return Answer.maybe;

else if(prob>58)
return Answer.yes;

else if(prob<21)
return Answer.no;

else
return Answer.never;
}

}

class asking{

public static void askMe(Answer result)
{
 switch(result)
 {
 case yes:
  System.out.println("YES");
   break;
 case no:
  System.out.println("NO");
   break;
 case maybe:
  System.out.println("MAYBE");
   break;
}

}
}



enum Answer{
maybe,never,yes,no;

}