package model;

import model.IPurse;

/**
 * 
 * @author piers
 *
 *The class which create the object Purse
 */
public class Purse extends Motionless implements IPurse{
	private static final char SPRITE = 'A';
	
	/**
	 * The method which called the sprite
	 */
	Purse(){
		super(SPRITE);
		System.out.println("Création de l'objet Purse");
	}

}
