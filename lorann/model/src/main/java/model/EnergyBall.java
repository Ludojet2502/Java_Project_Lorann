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
			System.out.println("Cr�ation de l'objet EnergyBall");
		}
	
}
