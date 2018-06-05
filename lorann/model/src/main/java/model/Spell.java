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
		System.out.println("Création de l'objet Spell");
	}
}
