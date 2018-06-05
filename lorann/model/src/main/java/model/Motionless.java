package model;

import model.Element;

/**
 * 
 * @author piers
 *
 */
public abstract class Motionless {
	/**
	 * 
	 */
	private char sprite;
	
	/**
	 * 
	 * @param sprite
	 */
	public Motionless(char sprite){
		this.setSprite(sprite);
	}
	/**
	 * 
	 * @param sprite
	 */
    private void setSprite (char sprite) {
        this.sprite = sprite;
    }
}
