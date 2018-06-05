package model;

import model.ILorann;
/**
 * 
 * @author piers
 *
 */
public class Lorann extends Motion implements ILorann {
	private static final char SPRITE = 'L';
	
	/**
	 * 
	 */
	Lorann(){
		super(SPRITE);
		System.out.println("Création de l'objet Lorann");
	}
}
