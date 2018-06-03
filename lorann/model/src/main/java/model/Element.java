package model;

public class Element implements IElement{

    private char sprite;

    public Element(char sprite) {
		this.setSprite(sprite);
	}


	public char getSprite() {
        return this.sprite;
    }


    private void setSprite (char sprite) {
        this.sprite=sprite;
    }
    
    

   

}
