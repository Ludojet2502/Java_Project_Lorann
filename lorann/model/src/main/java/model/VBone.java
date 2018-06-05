package model;

import model.IVBone;

/**
 * 
 * @author piers
 *
 */
public class VBone extends Bone implements IVBone{
	private static final char SPRITE = 'V';
	
	/**
	 * 
	 */
	VBone(){
		super(SPRITE);
		System.out.println("Création de l'objet VBone");
	}

}
