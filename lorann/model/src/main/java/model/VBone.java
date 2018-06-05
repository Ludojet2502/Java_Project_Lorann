package model;

import model.IVBone;

/**
 * 
 * @author piers
 *
 *The class which create the object VBone
 */
public class VBone extends Bone implements IVBone{
	private static final char SPRITE = 'V';
	
	/**
	 * The method which called the sprite
	 */
	VBone(){
		super(SPRITE);
		System.out.println("Création de l'objet VBone");
	}

}
