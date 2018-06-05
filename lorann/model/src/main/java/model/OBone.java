package model;

import model.IOBone;

/**
 * 
 * @author piers
 *
 *The class which create the object OBone
 */
public class OBone extends Bone implements IOBone {
	private static final char SPRITE = 'R';
	
	/**
	 * The method which called the sprite
	 */
	OBone(){
		super(SPRITE);
		System.out.println("Création de l'objet OBone");
	}

}
