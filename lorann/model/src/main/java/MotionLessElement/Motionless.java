package MotionLessElement;

import model.Element;

/**
 * 
 * @author piers
 *
 */
public abstract class Motionless {
	private char sprite;
	public Motionless(char sprite){
		this.setSprite(sprite);
	}
    private void setSprite (char sprite) {
        this.sprite = sprite;
    }
}
