package model;

import model.IPurse;

/**
 * 
 * @author piers
 *
 */
public class Purse extends Motionless implements IPurse{
	private static final char SPRITE = 'A';
	
	/**
	 * 
	 */
	Purse(){
		super(SPRITE);
		System.out.println("Cr�ation de l'objet Purse");
	}

}
