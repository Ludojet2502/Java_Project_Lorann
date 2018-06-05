package model;


import model.IMonster1;
/**
 * 
 * @author piers
 *The class wihch create the object Monster1
 *
 */
public class Monster1 extends Motion implements IMonster1 {
	private static final char SPRITE = 'W';
	
	/**
	 * The method which called the sprite
	 */
	Monster1(){
		super(SPRITE);
		System.out.println("Création de l'objet Monster1");
	}
}
