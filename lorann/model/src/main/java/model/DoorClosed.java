package model;

import model.IDoorClosed;

/**
 * 
 * @author piers
 *
 */
public class DoorClosed extends Door implements IDoorClosed{
	private static final char SPRITE = 'P';
	
	/**
	 * 
	 */
	DoorClosed(){
		super(SPRITE);
		System.out.println("Cr�ation de l'objet DoorClosed");
	}
}
