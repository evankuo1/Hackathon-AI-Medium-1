package gameEngine;

import java.util.List;

import editMe.Player;

public class EnemyView {
	
	Controller controller;
	EnemyInterface enemy;
	Player player;
	
	public EnemyView(Controller theController, EnemyInterface theEnemy, Player thePlayer) {	
		controller = theController;
		enemy = theEnemy;
		player = thePlayer;
	}
	
	
	public int getMyX() {
		return controller.getObjPos(enemy).get(0);
	}
	
	public int getMyY() {
		return controller.getObjPos(enemy).get(1);
	}
	
	public int getPlayerX() {
		return controller.getObjPos(player).get(0);
	}
	
	public int getPlayerY() {
		return controller.getObjPos(player).get(1);
	}
	
	public int getBoardWidth() {
		return controller.getBoardWidth();
	}
	
	public int getBoardHeight() {
		return controller.getBoardHeight();
	}
	
	public String getPosition(int x, int y) {
		
		Object theObj = controller.getPos(x, y);
		
		if (theObj == null) {
			return "empty";
		}
		
		else {
			return theObj.toString();
		}
	}
}
