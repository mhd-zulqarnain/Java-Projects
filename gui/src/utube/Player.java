package utube;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity {

	public Player(Game game){
		this.game=game;
		xPosition=300;
		yPosition=300;
		width=74;
		height=16;
	}
	
	public void render(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.fillRect((int)xPosition,(int)yPosition, width,height);
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

}
