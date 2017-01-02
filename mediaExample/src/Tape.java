
public class Tape extends Control {
	public Player Rec;
	public Tape(){
		device= new TapePlayer();
		Rec= new TapePlayer();
	}
	
}
