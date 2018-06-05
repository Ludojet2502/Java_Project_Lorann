package model;

import model.IHBone;

/**
 * 
 * @author piers
 *
 */
public class HBone extends Bone implements IHBone{
	private static final char SPRITE = 'H';
	
	/**
	 * 
	 */
	HBone(){
		super(SPRITE);
	}

}
