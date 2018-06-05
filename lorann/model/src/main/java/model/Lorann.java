package model;

import model.ILorann;

public class Lorann extends Motion implements ILorann {
	private static final char SPRITE = 'L';
	
	/**
	 * 
	 */
	Lorann(){
		super(SPRITE);
	}
}
