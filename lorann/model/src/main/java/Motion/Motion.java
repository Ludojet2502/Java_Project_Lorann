package Motion;

import model.Element;

public abstract class Motion extends Element{
    
    
	public Motion(char sprite) {
        super(sprite);
        
        
    }

    private boolean alive = true;
	private int getX;
	private int getY;

    public int getX() {
        return getX;
    }

    public void setX( int getX) {
    	this.getX = getX;
    }

    public int getY() {
        return getY;
    }

    public void setY(int getY) {
    	this.getY = getY;
    }

    public void moveRight() {
    	
    }

    public void moveUp() {
    	
    }

    public void moveDown() {

    }

    public void moveLeft() {

    }

    public void moveDiagRightUp() {

    }

    public void moveDiagRightDown() {

    }

    public void moveDiagLeftUp() {

    }

    public void moveDiagLeftDown() {

    }

    public void noMove() {

    }

    public boolean isAlive() {
        return alive;

    }


}