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
		System.out.println("Cr�ation de l'objet DoorOpened");
	}
}
