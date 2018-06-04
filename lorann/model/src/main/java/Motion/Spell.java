package Motion;

import model.ISpell;

public class Spell extends Motion implements ISpell{
	private static final char SPRITE = 'S';
	
	/**
	 * 
	 */
	Spell(){
		super(SPRITE);
	}
}
