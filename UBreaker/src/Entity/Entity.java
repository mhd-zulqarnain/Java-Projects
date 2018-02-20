package Entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import Core.Game;

public abstract class Entity {
	Rectangle entityColider;
	Game game;
	float xPosition,yPosition;
	int height,width;
	
	int baseMovement;
	int xMove,yMove;
	
	
	public abstract void render(Graphics g);
	public abstract void update();
	
}
