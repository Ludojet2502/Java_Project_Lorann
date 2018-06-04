package Motion;

public abstract class MotionElementFactory {
    private static final Lorann LORANN = new Lorann();
    private static final Spell SPELL = new Spell();
    private static final Monster1 MONSTER1 = new Monster1();
    private static final Monster2 MONSTER2 = new Monster2();
    private static final Monster3 MONSTER3 = new Monster3();
    private static final Monster4 MONSTER4 = new Monster4();
    
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
    public Motion createLorann() {
        return LORANN;
    }

    /**
     * 
     * @return
     */
    public Motion createSpell() {
        return SPELL;
    }

    /**
     * 
     * @return
     */
    public Motion createMonster1() {
        return MONSTER1;
    }

    /**
     * 
     * @return
     */
    public Motion createMonster2() {
        return MONSTER2;
    }

    /**
     * 
     * @return
     */
    public Motion createMonster3() {
        return MONSTER3;
    }
    
    /**
     * 
     * @return
     */
    public Motion createMonster4() {
        return MONSTER4;
    }
}
