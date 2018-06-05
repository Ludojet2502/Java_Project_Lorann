package model;

import model.IMonster3;
/**
 * 
 * @author piers
 *
 */
public class Monster3 extends Motion implements IMonster3 {
	private static final char SPRITE = 'Y';
	
	/**
	 * 
	 */
	Monster3(){
		super(SPRITE);
		System.out.println("Création de l'objet Monster3");
	}
}
