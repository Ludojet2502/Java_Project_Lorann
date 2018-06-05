package model;


import model.IMonster1;
/**
 * 
 * @author piers
 *
 */
public class Monster1 extends Motion implements IMonster1 {
	private static final char SPRITE = 'W';
	
	/**
	 * 
	 */
	Monster1(){
		super(SPRITE);
		System.out.println("Création de l'objet Monster1");
	}
}
