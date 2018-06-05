package model;

import model.ISpell;

/**
 * 
 * @author piers
 *
 *The class which create the object Spell
 */
public class Spell extends Motion implements ISpell{
	private static final char SPRITE = 'S';
	
	/**
	 * The method which called the sprite
	 */
	Spell(){
		super(SPRITE);
		System.out.println("Création de l'objet Spell");
	}
}
