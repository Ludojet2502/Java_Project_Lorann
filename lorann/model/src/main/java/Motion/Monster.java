package Motion;

import model.IMonster;

public class Monster extends Motion implements IMonster {
	private static final char SPRITE = 'W';
	
	Monster(){
		super(SPRITE);
	}
}
