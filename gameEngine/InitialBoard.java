package gameEngine;

import java.util.ArrayList;
import java.util.List;

import editMe.Player;


public class InitialBoard {
	
	int width;
	int height;
	List<ArrayList> objList = new ArrayList<ArrayList>();
	
	public InitialBoard() {
		
		width = 3;
		height = 5;

		BoardObject player = new Player();
		createObject(0, 0, player);
		
		Food food = new Food();
		createObject(2, 4, food);
		
		Enemy enemy = new Enemy();
		createObject(2, 2, enemy);
		
		NothingSpace nothingX1Y0 = new NothingSpace();
		createObject(1, 0, nothingX1Y0);
		
		NothingSpace nothingX2Y0 = new NothingSpace();
		createObject(2, 0, nothingX2Y0);
		
		NothingSpace nothingX1Y1 = new NothingSpace();
		createObject(1, 1, nothingX1Y1);
		
		NothingSpace nothingX2Y1 = new NothingSpace();
		createObject(2, 1, nothingX2Y1);
	}
	
	void createObject(int x, int y, Object obj) {
		ArrayList list = new ArrayList();
		list.add(x);
		list.add(y);
		list.add(obj);
		objList.add(list);
	}
	
	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}
	
	List<ArrayList> getObjList() {
		return objList;
	}
}
