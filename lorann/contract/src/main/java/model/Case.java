package model;

/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Case {

    /** The id. */
    private final int id;

    /** The ID_map. */
    private int    id_map;
    
    /** The X. */
    private int    X;
    
    /** The Y. */
    private int    Y;
    
    /** The sprite. */
    private char    sprite;

    /**
     * Instantiates a new case.
     *
     * @param id
     *            the id
     *
     * @param id_map
     * 			  the id of map
     * 
     *  @param X
     *  			the X of the sprite 
     *  
     *  @param Y 
     *  			the Y of the sprite 
     *  
     *  @param sprite 
     *  			the sprite of the sprite
     */
    public Case(final int id, final int id_map, final int X, final int Y, final char sprite) {
        super();
        this.id = id;
        this.id_map = id_map;
        this.X = X;
        this.Y = Y;
        this.sprite = sprite;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the id of the map.
     *
     * @return the Id_map
     */
    public int getId_map() {
        return this.id_map;
    }
    /**
     * Gets the X of the sprite 
     * 
     * @return the X
     */

    public int getX() {
        return this.X;
    }
    
    /**
     * Gets the Y of the sprite 
     * 
     * @return the Y
     */
    public int getY() {
        return this.Y;
    }
    
    /**
     * Gets the Sprite of the sprite
     * 
     * @return the sprite
     */
    public char getSprite() {
        return this.sprite;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getId() + " : " + this.getId_map() + " : " + this.getX() + " : " + this.getY() + " : " + this.getSprite();
    }
}
