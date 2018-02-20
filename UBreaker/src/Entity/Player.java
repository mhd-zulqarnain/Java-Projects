package Entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Core.Game;

public class Player extends Entity{
	
	
	public Player(Game game){
		this.game=game;
		xPosition=500;
		yPosition=525;
		width=104;
		height=16;
		baseMovement=3;

		entityColider= new Rectangle((int) xPosition, (int) yPosition, width, height);
	}
	
	public void render(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect((int)xPosition,(int)yPosition, width,height);
	}
	public void update() {
		if(game.keys.left){
			xPosition-=baseMovement;
		}
		if(game.keys.right){
			xPosition+=baseMovement;

		}

		entityColider.setLocation((int) xPosition, (int) yPosition);
	}


}
