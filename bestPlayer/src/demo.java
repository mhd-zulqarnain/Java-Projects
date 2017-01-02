import java.util.ArrayList;


public class demo {

	public static void main (String args[])
	{
		ArrayList<game> player=new ArrayList<game>();
		for(int i=0;i<5;i++)
		{
			player.add(new game("player"+i,i+34));
		}
		ArrayList<game> winner=new ArrayList<game>();
		winner.add(Winners(player));
		System.out.println(winner.get(0).name);
	}



	static game Winners(ArrayList<game> gamers){
		
		game best=gamers.get(0);
		for(game player:gamers)
		{
			if(player.getPoints()>best.getPoints()){
				best=player;
			}
		}
		return best; 
	
	}
}
class game{
	
	public int points;
	public String name;
	game(String name,int point){
		this.name=name;
		this.points=point;
	}
	
	game(){
	}
	
	public int getPoints(){
	return points;
	}
}