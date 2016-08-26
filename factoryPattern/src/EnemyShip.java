import java.util.Scanner;


public class EnemyShip {

	private double speed;
	private String name;
	
	public String getName(){
		return name;
	}
	public void setName(String newName)
	{
		name=newName;
	}

	public double getSpeed(){
		return speed;
	}
	public void setSpeed(double newSpeed)
	{
		speed=newSpeed;
	}
	
	public void followHeroShip(){
			System.out.println(getName()+"is the following hero");
		}
	public void DisplayEnemyShip(){
		System.out.println(getName()+"is on the screen");
	}
	public void enemyShipShoots()
	{
		System.out.println(getName()+"Did damage of "+getSpeed());
	}
	
}

class UFOEnemyShip extends EnemyShip{
	
	public UFOEnemyShip() {
	setName("UFO enemy Ship");
	setSpeed(21.2);
	}
	
}
class RocketEnemyShip extends EnemyShip{
	
	public RocketEnemyShip() {
	setName("Rocket enemy Ship");
	setSpeed(12.2);
	}
	
}


class Demo{
	
	public static void main (String args[])
	{
	EnemyShip Enemy=null;
	EnemyFactory ships= new EnemyFactory();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the type of ship?(U/ R /B)");
	if(input.hasNextLine())
	{
		String name=input.nextLine();
		Enemy=ships.constructShip(name);
		if(Enemy!=null)
		{
			doStuff(Enemy);
		}
		else
			System.out.println("Enter valid option");
	}
  }
	
	public static void doStuff(EnemyShip newE){
		newE.DisplayEnemyShip();
		newE.enemyShipShoots();
	}
}

class EnemyFactory{
	
	public EnemyShip constructShip(String name){
    
		if(name.equals("R"))
		return new RocketEnemyShip();
		if(name.equals("U"))
			return new UFOEnemyShip();
		else 
			return null;
		
	}
}