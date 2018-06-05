package model;

import model.IEnergyBall;
import model.Location;

/**
 * 
 * @author piers
 *
 *The class which create the object EnergyBall
 */
public class EnergyBall extends Motionless implements IEnergyBall{
		public static char SPRITE = 'B';
		
		/**
		 * The method which called the sprite
		 */
		public EnergyBall(){
			super(SPRITE);
			System.out.println("Création de l'objet EnergyBall");
		}
	
}
