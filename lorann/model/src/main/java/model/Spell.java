package model;

import model.ISpell;

/**
 * 
 * @author piers
 *
 */
public class Spell extends Motion implements ISpell{
	private static final char SPRITE = 'S';
	
	/**
	 * 
	 */
	Spell(){
		super(SPRITE);
		System.out.println("Cr�ation de l'objet Spell");
	}
}
