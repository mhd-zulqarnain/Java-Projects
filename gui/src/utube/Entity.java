package utube;

import java.awt.Graphics;

public abstract class Entity {

	Game game;
	float xPosition,yPosition;
	int width,height;
	public abstract void render(Graphics g);
	public abstract void update();
}
