package model;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import Motion.Lorann;
import Motion.MotionElementFactory;
import MotionLessElement.MotionlessElementFactory;

/**
 * 
 * @author piers
 *
 */
public class Level extends Observable  {
	/**
	 * 
	 */
	private static IElement[][] level = new Element[20][12];
	/**
	 * 
	 */
	MotionlessElementFactory motionlessElementFactory = new MotionlessElementFactory();
	/**
	 * 
	 */
	MotionElementFactory motionElementFactory = new MotionElementFactory();
	/**
	 * 
	 */
	Lorann lorann;
	
	/**
	 * 
	 * @param ListCases
	 */
	public void CreateMap(List<Case> ListCases) {
		for (Case cases : ListCases) {
			if (cases.getSprite() == 'B'||
					cases.getSprite() == 'A' || 
							cases.getSprite() == 'R' ||
									cases.getSprite() == 'H' || 
											cases.getSprite() == 'V' ||
													cases.getSprite() == 'P' || 
															cases.getSprite() == 'P') {
																	
				level[cases.getX()][cases.getY()] = motionlessElementFactory.createEnergyBall(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionlessElementFactory.createPurse(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionlessElementFactory.createOBone(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionlessElementFactory.createHBone(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionlessElementFactory.createVBone(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionlessElementFactory.createDoorClosed(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionlessElementFactory.createDoorOpened(cases.getSprite(), new Location(cases.getX(),cases.getY()));
			}
			else if (cases.getSprite() == 'P' ||
						cases.getSprite() == 'F' ||
							cases.getSprite() == 'K' ||
								cases.getSprite() == 'J'){
				level[cases.getX()][cases.getY()] = motionElementFactory.createLorann(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionElementFactory.createSpell(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionElementFactory.createMonster1(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionElementFactory.createMonster2(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionElementFactory.createMonster3(cases.getSprite(), new Location(cases.getX(),cases.getY()));
				level[cases.getX()][cases.getY()] = motionElementFactory.createMonster4(cases.getSprite(), new Location(cases.getX(),cases.getY()));
			}
		}
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public IElement getElementInTheMap( int x, int y) {
		return Level.level[x][y];
	}
	
	/**
	 * 
	 * @return
	 */
	public IElement[][] getLevel(){
		return Level.level;
	}
	
	/**
	 * 
	 * @param level
	 */
	public void setLevel(IElement[][] level) {
		Level.level = level;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public static char getIElement( int x, int y) {
		return Level.level[x][y].getSprite();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	public Level() {
		level = new IElement[20][12];
		
		for (int y = 0; y < 12; y++) {
			for (int x =0; x < 20; x++) {
				level[y][x] = null;
			}
		}
	}
	
	public IElement getOnLevel (int x,int y) {
		if ( x>=0 && x <20 && y>=0 && y < 12) {
			return level[y][x];
		}
		return new Element ('L');
	}
	
	public void setOnLevel (IElement element, int x, int y) {
		if (x>=0 && x<20 && y >=0 && y <12) {
			level[y][x] = element;
		}
	}
	
	@Override
	public void addObserver (Observer observer) {
		super.addObserver(observer);
	}*/

}
