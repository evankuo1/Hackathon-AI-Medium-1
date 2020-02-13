package gameEngine;

public class NothingSpace implements TileObject {
	public String onCollision() {
		return "nothing";
	}
	
	public String toString () {
		return "nothing";
	}
}
