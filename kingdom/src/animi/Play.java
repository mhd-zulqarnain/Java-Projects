package animi;

public class Play {

	public static void main(String args[])
	{
		Dog jacky = new Dog();
		System.out.println(jacky.getSound());
		jacky.setFLyingAblity(new CantFly());
		System.out.println(jacky.tryToFly());
	}
}
