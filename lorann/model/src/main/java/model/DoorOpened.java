package model;

import model.IDoorOpened;

/**
 * 
 * @author piers
 *
 */
public class DoorOpened extends Door implements IDoorOpened{
	private static final char SPRITE = ' ';
	
	/**
	 * 
	 */
	DoorOpened(){
		super(SPRITE);
		System.out.println("Création de l'objet DoorOpened");
	}
}
