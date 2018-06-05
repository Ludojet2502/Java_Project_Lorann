package model;

import model.IMonster3;
/**
 * 
 * @author piers
 *
 *The class which create the object Monster3
 */
public class Monster3 extends Motion implements IMonster3 {
	private static final char SPRITE = 'Y';
	
	/**
	 * The method which called the sprite
	 */
	Monster3(){
		super(SPRITE);
		System.out.println("Création de l'objet Monster3");
	}
}
