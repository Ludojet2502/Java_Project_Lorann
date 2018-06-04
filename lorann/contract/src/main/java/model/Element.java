package model;

public class Element {

	char sprite;
	static Location position;
	
	public Element( char sprite, Location position) {
		this.sprite = sprite;
		Element.position = position;
	}
	
	public char getSprite() {
		return this.sprite;
	}
	
	public  int getX() {
		return Element.position.getX();
	}
	
	public int getY() {
		return Element.position.getY();
	}
	
	public  void setX(int x) {
		Element.position.x = x;
	}
	
	public Location getPosition() {
		return position;
	}

	public void setY(int y) {
		Element.position.y = y;
	}
	
	public void setPosition(Location position) {
		Element.position = position;
	}
}
