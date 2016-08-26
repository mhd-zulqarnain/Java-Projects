
public interface QuackBehavior {

	public void quack();
}

class Quack implements QuackBehavior{
	public void quack(){
		System.out.println("Quack");
	}
}

class MuteQuack implements QuackBehavior{
	public	 void quack(){
		System.out.println("Silence");
	}
}

class Squack implements QuackBehavior{
	public void quack(){
		System.out.println("Squack");
	}
}