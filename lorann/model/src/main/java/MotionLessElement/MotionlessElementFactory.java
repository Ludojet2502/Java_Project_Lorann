package MotionLessElement;
/**
 * 
 * @author piers
 *
 */
public abstract class MotionlessElementFactory {

    private static final EnergyBall ENERGYBALL = new EnergyBall();
    private static final Purse PURSE = new Purse();
    private static final HBone HBONE = new HBone();
    private static final VBone VBONE = new VBone();
    private static final OBone OBONE  = new OBone();
    private static final DoorOpened DOOROPENED = new DoorOpened();
    private static final DoorClosed DOORCLOSED = new DoorClosed();

    /**
     * 
     */
    private static Motionless[] motionlessElement = {
            ENERGYBALL,
            PURSE,
            VBONE,
            HBONE,
            OBONE,
            DOOROPENED,
            DOORCLOSED,
    };

    /**
     * 
     * @return
     */
    public Motionless createEnergyBall() {
        return ENERGYBALL;
    }

    /**
     * 
     * @return
     */
    public Motionless createPurse() {
        return PURSE;
    }

    /**
     * 
     * @return
     */
    public Motionless createOBone() {
        return OBONE;
    }

    /**
     * 
     * @return
     */
    public Motionless createHBone() {
        return HBONE;
    }

    /**
     * 
     * @return
     */
    public Motionless createVBone() {
        return VBONE;
    }

    /**
     * 
     * @return
     */
    public Motionless DoorOpened() {
        return DOOROPENED;
    }

    /**
     * 
     * @return
     */
    public Motionless DoorClosed() {
        return DOORCLOSED;
    }


}
