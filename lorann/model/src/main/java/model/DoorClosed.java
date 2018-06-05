package model;

import model.IDoorClosed;

public class DoorClosed extends Door implements IDoorClosed{
	private static final char SPRITE = 'P';
	
	/**
	 * 
	 */
	DoorClosed(){
		super(SPRITE);
	}
}
