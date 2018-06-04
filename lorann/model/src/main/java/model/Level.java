package model;

import java.util.Observable;
import java.util.Observer;


public class Level extends Observable implements ILevel  {
	
	private IElement[][] level;
	
	public Level() {
		level = new IElement[12][20];
		
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
		return new Element ("../sprite/empty.png");
	}
	
	public void setOnLevel (IElement element, int x, int y) {
		if (x>=0 && x<20 && y >=0 && y <12) {
			level[y][x] = element;
		}
	}
	
	@Override
	public void addObserver (Observer observer) {
		super.addObserver(observer);
	}

}
