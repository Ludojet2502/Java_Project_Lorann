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
		System.out.println("Cr�ation de l'objet VBone");
	}

}
