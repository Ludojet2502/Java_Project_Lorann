package MotionLessElement;

public abstract class MotionlessElementFactory {

    private static final EnergyBall ENERGYBALL = new EnergyBall();
    private static final Purse PURSE = new Purse();
    private static final HBone HBONE = new HBone();
    private static final VBone VBONE = new VBone();
    private static final OBone OBONE  = new OBone();
    private static final DoorOpened DOOROPENED = new DoorOpened();
    private static final DoorClosed DOORCLOSED = new DoorClosed();


    private static Motionless[] motionlessElement = {
            ENERGYBALL,
            PURSE,
            VBONE,
            HBONE,
            OBONE,
            DOOROPENED,
            DOORCLOSED,
    };

    public Motionless createEnergyBall() {
        return ENERGYBALL;
    }

    public Motionless createPurse() {
        return PURSE;
    }

    public Motionless createOBone() {
        return OBONE;
    }

    public Motionless createHBone() {
        return HBONE;
    }

    public Motionless createVBone() {
        return VBONE;
    }

    public Motionless DoorOpened() {
        return DOOROPENED;
    }

    public Motionless DoorClosed() {
        return DOORCLOSED;
    }


}
