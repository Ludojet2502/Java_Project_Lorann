package MotionLessElement;

import model.Location;

/**
 * 
 * @author piers
 *
 */
public class MotionlessElementFactory {

    private static Motionless Motionless = null;
	private static EnergyBall ENERGYBALL = new EnergyBall();
    private static Purse PURSE = new Purse();
    private static HBone HBONE = new HBone();
    private static VBone VBONE = new VBone();
    private static OBone OBONE  = new OBone();
    private static DoorOpened DOOROPENED = new DoorOpened();
    private static DoorClosed DOORCLOSED = new DoorClosed();

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
    public Motionless createEnergyBall(char sprite, Location position) {
        switch(sprite) {
        case 'B' :
        	ENERGYBALL = new EnergyBall();
        }
		return Motionless;
    }

    /**
     * 
     * @return
     */
    public Motionless createPurse(char sprite, Location position) {
    	switch(sprite) {
        case 'A' :
        	PURSE = new Purse();
        }
		return Motionless;
    }

    /**
     * 
     * @return
     */
    public Motionless createOBone(char sprite, Location position) {
    	switch(sprite) {
        case 'R' :
        	OBONE = new OBone();
        }
		return Motionless;
    }

    /**
     * 
     * @return
     */
    public Motionless createHBone(char sprite, Location position) {
    	switch(sprite) {
        case 'H' :
        	HBONE = new HBone();
        }
		return Motionless;
    }

    /**
     * 
     * @return
     */
    public Motionless createVBone(char sprite, Location position) {
    	switch(sprite) {
        case 'V' :
        	VBONE = new VBone();
        }
		return Motionless;
    }

    /**
     * 
     * @return
     */
    public Motionless createDoorOpened(char sprite, Location position) {
    	switch(sprite) {
        case 'P' :
        	DOOROPENED = new DoorOpened();
        }
		return Motionless;
    }

    /**
     * 
     * @return
     */
    public Motionless createDoorClosed(char sprite, Location position) {
    	switch(sprite) {
        case 'P' :
        	DOORCLOSED = new DoorClosed();
        }
		return Motionless;
    }


}
