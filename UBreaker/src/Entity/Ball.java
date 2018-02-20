package Entity;

import java.awt.*;

import Core.Game;

public class Ball extends Entity {

	public Ball(Game game) {
		this.game = game;
		xPosition = 250;
		yPosition = 425;
		width = 16;
		height = 16;
		baseMovement = 3;
		xMove = baseMovement;
		yMove = baseMovement;
		entityColider = new Rectangle((int) xPosition, (int) yPosition, width,
				height);

	}

	public void render(Graphics g) {
		g.fillOval((int) xPosition, (int) yPosition, width, height);

	}

	public void update() {
		xPosition += xMove;
		yPosition += yMove;
		
		if (entityColider.intersects(game.player.entityColider)) {
			yMove = -baseMovement;
		}
		
		if (yPosition + height >= game.canvas.getHeight()) {
			yMove = -baseMovement;
		}
		if (xPosition + width >= game.canvas.getWidth()) {
			xMove = -baseMovement;
		}
		if (xPosition <= 0) {
			xMove= -baseMovement;
		}
		if (yPosition <= 0) {
			yMove= -baseMovement;
		}
		if (xPosition == 0) {
			xMove= +baseMovement;
		}
		if (yPosition == 0) {
			yMove= +baseMovement;
		}
		entityColider.setLocation((int) xPosition, (int) yPosition);

	}

}
