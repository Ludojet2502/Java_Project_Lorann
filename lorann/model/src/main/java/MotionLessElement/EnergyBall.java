package MotionLessElement;

import model.IEnergyBall;
import model.Location;

public class EnergyBall extends Motionless implements IEnergyBall{
		static char SPRITE = 'B';
		
		/**
		 * 
		 */
		EnergyBall(){
			super(SPRITE);
			System.out.println("Création de l'objet EnergyBall");
		}
	
}
