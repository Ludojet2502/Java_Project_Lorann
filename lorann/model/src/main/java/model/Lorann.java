package model;

import model.ILorann;
/**
 * 
 * @author piers
 *
 *The class wich create the object Lorann
 */
public class Lorann extends Motion implements ILorann {
	private static final char SPRITE = 'L';
	
	/**
	 * The method which called the sprite
	 */
	Lorann(){
		super(SPRITE);
		System.out.println("Création de l'objet Lorann");
	}
}
