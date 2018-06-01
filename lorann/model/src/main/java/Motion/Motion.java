package Motion;

import model.Element;

public abstract class Motion extends Element{
    public Motion(char sprite) {
        super(sprite);
        // TODO Auto-generated constructor stub
    }

    private boolean alive = true;

    public int getX() {
        return this.getX();
    }

    public void setX( int x) {

    }

    public int getY() {
        return this.getY();
    }

    public void setY() {

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