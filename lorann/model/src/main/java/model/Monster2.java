package model;

import model.IMonster2;
/**
 * 
 * @author piers
 *
 */
public class Monster2 extends Motion implements IMonster2 {
	private static final char SPRITE = 'X';
	
	/**
	 * 
	 */
	Monster2(){
		super(SPRITE);
		System.out.println("Cr�ation de l'objet Monster2");
	}
}
