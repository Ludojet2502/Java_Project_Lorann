package model;

import model.IOBone;

/**
 * 
 * @author piers
 *
 */
public class OBone extends Bone implements IOBone {
	private static final char SPRITE = 'R';
	
	/**
	 * 
	 */
	OBone(){
		super(SPRITE);
		System.out.println("Cr�ation de l'objet OBone");
	}

}
