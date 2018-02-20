package cricket;

public class Fans implements Subscriber{

	String news;
	private Player p;
	private static int id=0;
	public Fans(Player p){
		this.p=p;
		id++;
		p.subscribe(this);
	}
	public void update(String news) {
		System.out.println("\nSubsciber Id:"+id+"\n"+"News:"+news);
	}

}
