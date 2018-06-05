package model;

import model.Location;
/**
 * 
 * @author piers
 *
 */
public class MotionElementFactory {
	/**
	 * 
	 */
    private static Lorann LORANN = new Lorann();
    /**
     * 
     */
    private static Spell SPELL = new Spell();
    /**
     * 
     */
    private static Monster1 MONSTER1 = new Monster1();
    /**
     * 
     */
    private static Monster2 MONSTER2 = new Monster2();
    
    /**
     * 
     */
    private static Monster3 MONSTER3 = new Monster3();
    
    /**
     * 
     */
    private static Monster4 MONSTER4 = new Monster4();
    
    
    /**
     * 
     */
	private static Motion Motion = null;
    
    /**
     * 
     */
    private static Motion[] motionElement = {
            LORANN,
            SPELL,
            MONSTER1,
            MONSTER2,
            MONSTER3,
            MONSTER4,
    };

    /**
     * 
     * @return
     */
    public Motion createLorann(char sprite, Location position) {
    	switch(sprite) {
        case 'L' :
        	LORANN = new Lorann();
        }
		return Motion;
    }

    /**
     * 
     * @return
     */
    public Motion createSpell(char sprite, Location position) {
    	switch(sprite) {
        case 'S' :
        	SPELL = new Spell();
        }
		return Motion;
    }

    /**
     * 
     * @return
     */
    public Motion createMonster1(char sprite, Location position) {
    	switch(sprite) {
        case 'W' :
        	MONSTER1 = new Monster1();
        }
		return Motion;
    }

    /**
     * 
     * @return
     */
    public Motion createMonster2(char sprite, Location position) {
    	switch(sprite) {
        case 'X' :
        	MONSTER2 = new Monster2();
        }
		return Motion;
    }

    /**
     * 
     * @return
     */
    public Motion createMonster3(char sprite, Location position) {
    	switch(sprite) {
        case 'Y' :
        	MONSTER3 = new Monster3();
        }
		return Motion;    
	}
    
    /**
     * 
     * @return
     */
    public Motion createMonster4(char sprite, Location position) {
    	switch(sprite) {
        case 'Z' :
        	MONSTER4 = new Monster4();
        }
		return Motion; 
    }
}
