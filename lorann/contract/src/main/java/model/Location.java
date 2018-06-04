package model;

public class Location {

	int x;
	int y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Location(Location location){
		this.x = location.x;
		this.y = location.y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
