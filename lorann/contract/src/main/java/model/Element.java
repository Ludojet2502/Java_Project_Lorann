package model;

public class Element {

	/** the sprite. */
	char sprite;
	
	/** The position. */
	static Location position;
	
	/**
	 * Instantiates a new Element
	 * 
	 * @param sprite
	 * @param position
	 */
	public Element( char sprite, Location position) {
		this.sprite = sprite;
		Element.position = position;
	}
	
	/**
	 * Gets the sprite 
	 * 
	 * @return the sprite
	 */
	public char getSprite() {
		return this.sprite;
	}
	
	/**
	 * Gets the X
	 * 
	 * @return the getX
	 */
	public  int getX() {
		return Element.position.getX();
	}
	
	/**
	 * Gets the Y
	 * 
	 * @return the getY
	 */
	public int getY() {
		return Element.position.getY();
	}
	
	/**
	 * Sets the X
	 * 
	 * @param the x
	 */
	public  void setX(int x) {
		Element.position.x = x;
	}
	
	/**
	 * the position
	 * 
	 * @return the position
	 */
	public Location getPosition() {
		return position;
	}

	/**
	 * Sets the Y
	 * 
	 * @param the y
	 */
	public void setY(int y) {
		Element.position.y = y;
	}
	
	/**
	 * Sets the position
	 * 
	 * @param position
	 */
	public void setPosition(Location position) {
		Element.position = position;
	}
}
