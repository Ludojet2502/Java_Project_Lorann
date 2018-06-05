package model;

import model.IEnergyBall;
import model.Location;

public class EnergyBall extends Motionless implements IEnergyBall{
		public static char SPRITE = 'B';
		
		/**
		 * 
		 */
		public EnergyBall(){
			super(SPRITE);
			System.out.println("Création de l'objet EnergyBall");
		}
	
}
