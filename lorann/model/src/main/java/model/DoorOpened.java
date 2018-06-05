package model;

import model.IDoorOpened;

/**
 * 
 * @author piers
 *
 *The class wich create the object DoorOpened
 */
public class DoorOpened extends Door implements IDoorOpened{
	private static final char SPRITE = ' ';
	
	/**
	 * The method which called the sprite
	 */
	DoorOpened(){
		super(SPRITE);
		System.out.println("Création de l'objet DoorOpened");
	}
}
