
public interface Fly {
void flyBehavior();
}

class canfly implements Fly{
	public void flyBehavior(){
		System.out.println("Can fly");
	}
}


class cantfly implements Fly{
	public void flyBehavior(){
		System.out.println("Can't fly");
	}
}

