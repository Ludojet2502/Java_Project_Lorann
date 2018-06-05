package model;


import model.IMonster1;

public class Monster1 extends Motion implements IMonster1 {
	private static final char SPRITE = 'W';
	
	/**
	 * 
	 */
	Monster1(){
		super(SPRITE);
	}
}
