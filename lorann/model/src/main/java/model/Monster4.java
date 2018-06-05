package model;

import model.IMonster4;

/**
 * 
 * @author piers
 *
 *The class which create the object Monster4
 */
public class Monster4 extends Motion implements IMonster4 {
	private static final char SPRITE = 'Z';
	
	/**
	 * The method which called the sprite
	 */
	Monster4(){
		super(SPRITE);
		System.out.println("Création de l'objet Monster4");
	}
}
