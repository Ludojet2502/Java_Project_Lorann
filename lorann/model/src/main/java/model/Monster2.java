package model;

import model.IMonster2;

public class Monster2 extends Motion implements IMonster2 {
	private static final char SPRITE = 'X';
	
	/**
	 * 
	 */
	Monster2(){
		super(SPRITE);
	}
}
