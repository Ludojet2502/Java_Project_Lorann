package Motion;

public abstract class MotionElementFactory {
    private static final Lorann LORANN = new Lorann();
    private static final Spell SPELL = new Spell();
    private static final Monster MONSTER = new Monster();

    private static Motion[] motionElement = {
            LORANN,
            SPELL,
            MONSTER,
    };

    public Motion createLorann() {
        return LORANN;
    }

    public Motion createSpell() {
        return SPELL;
    }

    public Motion createMonstet() {
        return MONSTER;
    }


}
