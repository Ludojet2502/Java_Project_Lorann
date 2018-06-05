package model;

import model.IMonster2;
/**
 * 
 * @author piers
 *
 *The class which create the object Monster2
 */
public class Monster2 extends Motion implements IMonster2 {
	private static final char SPRITE = 'X';
	
	/**
	 * The method which called the sprite
	 */
	Monster2(){
		super(SPRITE);
		System.out.println("Création de l'objet Monster2");
	}
}
