class Answer implements sharedDocuments{
	
	public static void answer(int result)
	{
		switch(result)
		{
		case NO:
			System.out.println("NO");
		break;
		case YES:
			System.out.println("YES");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case NEVER:
			System.out.println("Never");
			break;
		
		}
		
	}
	
	public static void main(String args[])
	{
		Question d1= new Question();
		answer(d1.ask());answer(d1.ask());answer(d1.ask());
	}
}