package model;

import model.IDoorOpened;

public class DoorOpened extends Door implements IDoorOpened{
	private static final char SPRITE = ' ';
	
	/**
	 * 
	 */
	DoorOpened(){
		super(SPRITE);
	}
}
