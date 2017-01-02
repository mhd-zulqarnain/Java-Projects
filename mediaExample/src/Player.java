
public interface Player {
void play();
void stop();
void pause();
void reverse();
}

class DVDPlayer implements Player{
	public void play(){
		System.out.println("Dvd start playing");
	}
	public void stop(){
		System.out.println("Dvd stoped");
	}
	public void pause(){
		System.out.println("Dvd paused");
	}
	public void reverse(){
		System.out.println("Dvd reverse");
	}
}
class TapePlayer implements Record {
	public void play(){
		System.out.println("tape start playing");
	}
	public void stop(){
		System.out.println("tape stoped");
	}
	public void pause(){
		System.out.println("tape paused");
	}
	public void reverse(){
		System.out.println("tape reverse");
	}
	public void record(){
		System.out.println("tape reverse"); //-----from record interface
	}
}
