package model;

import model.IMonster4;

/**
 * 
 * @author piers
 *
 */
public class Monster4 extends Motion implements IMonster4 {
	private static final char SPRITE = 'Z';
	
	/**
	 * 
	 */
	Monster4(){
		super(SPRITE);
		System.out.println("Cr�ation de l'objet Monster4");
	}
}
