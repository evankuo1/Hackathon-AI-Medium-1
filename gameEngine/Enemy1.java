package gameEngine;

import editMe.Player;
import javafx.scene.paint.Color;

public class Enemy1 implements BoardObject, EnemyInterface {
	
	Color color;
	String shape;
	EnemyView info;
	
	// Put enemy "memory" here
	Direction currDir;

	public Enemy1() {
		color = Color.rgb(153, 0, 153);
		shape = "circle";
		currDir = new Stay();
	}
	
	
	public void initializeEnemyView(Controller controller, Player player) {
		info = new EnemyView(controller, this, player);
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(int r, int g, int b) {
		color = Color.rgb(r, g, b);
	}
	
	public String getShape() {
		return shape;
	}
	
	public Direction move() {
		currDir = new Stay();
		return currDir;
	}
	
	public String onCollision() {
		return "enemy";
	}
	
	public String toString() {
		return "enemy";
	}
}