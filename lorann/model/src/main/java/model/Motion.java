package model;

import model.Element;

public abstract class Motion {
	
	private char sprite;
    
    /**
     * 
     * @param sprite
     */
	public Motion(char sprite) {
        this.setSprite(sprite);
    }
	
	private void setSprite (char sprite) {
		this.sprite= sprite;
	}
	
	/**
	 * Boolean which set alive in "true"
	 */
    private boolean alive = true;
    /**
     * 
     */
	private int getX;
	/**
	 * 
	 */
	private int getY;
	
	/**
	 * 
	 * @return
	 */
    public int getX() {
        return getX;
    }
    
    /**
     * 
     * @param getX
     */
    public void setX( int getX) {
    	this.getX = getX;
    }
    
    
    /**
     * 
     * @return
     */
    public int getY() {
        return getY;
    }

    /**
     * 
     * @param getY
     */
    public void setY(int getY) {
    	this.getY = getY;
    }

    /**
     * 
     */
    public void moveRight() {
    	
    }

    /**
     * 
     */
    public void moveUp() {
    	
    }

    /**
     * 
     */
    public void moveDown() {

    }

    /**
     * 
     */
    public void moveLeft() {

    }

    /**
     * 
     */
    public void moveDiagRightUp() {

    }

    /**
     * 
     */
    public void moveDiagRightDown() {

    }

    /**
     * 
     */
    public void moveDiagLeftUp() {

    }

    /**
     * 
     */
    public void moveDiagLeftDown() {

    }

    /**
     * 
     */
    public void noMove() {

    }

    /**
     * 
     * @return
     */
    public boolean isAlive() {
        return alive;

    }


}
