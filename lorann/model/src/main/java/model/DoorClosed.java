package model;

import model.IDoorClosed;

/**
 * 
 * @author piers
 *
 *The class which create the object DoorClosed
 */
public class DoorClosed extends Door implements IDoorClosed{
	private static final char SPRITE = 'P';
	
	/**
	 * The method which called the sprite
	 */
	DoorClosed(){
		super(SPRITE);
		System.out.println("Création de l'objet DoorClosed");
	}
}
