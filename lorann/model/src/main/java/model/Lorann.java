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
		System.out.println("Cr�ation de l'objet Lorann");
	}
}
