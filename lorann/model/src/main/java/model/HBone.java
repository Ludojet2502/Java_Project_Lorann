package model;

import model.IHBone;

/**
 * 
 * @author piers
 *
 *The class which create the object HBone
 */
public class HBone extends Bone implements IHBone{
	private static final char SPRITE = 'H';
	
	/**
	 * The method which called the sprite
	 */
	HBone(){
		super(SPRITE);
		System.out.println("Création de l'objet HBone");
	}

}
