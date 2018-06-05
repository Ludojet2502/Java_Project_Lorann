package model;

public class Element implements IElement{

    protected char sprite;

    /**
     * 
     * @param sprite
     */
    public Element(char sprite) {
		this.setSprite(sprite);
	}

    /**
     * 
     */
	public char getSprite() {
        return this.sprite;
    }

	/**
	 * 
	 * @param sprite
	 */
    private void setSprite (char sprite) {
        this.sprite = sprite;
    }
    
    

   

}
