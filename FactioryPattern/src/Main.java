import Ships.AbstractShip;
import Ships.EnemyShip;
import Ships.RocketEnemyShip;
import Ships.UFOEnemyShip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the Choice: u / R");

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        AbstractShip ship = null;

        switch (choice){
            case "u":
            case "U":
                ship = new UFOEnemyShip();
                break;
            case "R":
            case "r":
                ship = new RocketEnemyShip();
                break;

        }

        if(ship!=null){
            System.out.println(ship);
        }
    }


}
