package controller;

import java.sql.SQLException;
import java.util.List;

import model.Case;
import model.Example;
import model.IDoorClosed;
import model.IDoorOpened;
import model.IEnergyBall;
import model.IHBone;
import model.ILorann;
import model.IModel;
import model.IMonster1;
import model.IMonster2;
import model.IMonster3;
import model.IMonster4;
import model.IOBone;
import model.IPurse;
import model.ISpell;
import model.IVBone;



public class Impact implements IModel, ILorann, IMonster1, IMonster2, IMonster3, IMonster4, ISpell, IHBone, IVBone, IOBone, IEnergyBall, IPurse, IDoorClosed, IDoorOpened{
	 	public void checkImpact( ILorann lorann, IMonster1 monster) {

        }
	 	
	 	public void checkImpact( ILorann lorann, IMonster2 monster) {

        }
	 	
	 	public void checkImpact( ILorann lorann, IMonster3 monster) {

        }
	 	
	 	public void checkImpact( ILorann lorann, IMonster4 monster) {

        }
	 	
	    public void checkImpact( ILorann lorann, ISpell spell) {

	    }

	    public void checkImpact( ILorann lorann, IHBone hBone) {

	    }

	    public void checkImpact( ILorann lorann, IVBone vBone) {

	    }

	    public void checkImpact( ILorann lorann, IOBone oBone) {

	    }

	    public void checkImpact( ILorann lorann, IEnergyBall energyBall) {

	    }

	    public void checkImpact( ILorann lorann, IPurse purse) {

	    }

	    public void checkImpact( ILorann lorann, IDoorClosed doorClosed) {

	    }

	    public void checkImpact( ILorann lorann, IDoorOpened doorOpened) {

	    }

	    public void checkImpact( ISpell spell, IMonster1 monster) {

	    }
	    
	    public void checkImpact( ISpell spell, IMonster2 monster) {

	    }
	    
	    public void checkImpact( ISpell spell, IMonster3 monster) {

	    }
	    
	    public void checkImpact( ISpell spell, IMonster4 monster) {

	    }

	    public void checkImpact( ISpell spell, IHBone hBone) {

	    }
	    public void checkImpact( ISpell spell, IOBone oBone) {

	    }

	    public void checkImpact( ISpell spell, IVBone vBone) {

	    }

	    public void checkImpact( ISpell spell,  IEnergyBall energyBall) {

	    }

	    public void checkImpact( ISpell spell, IPurse purse) {

	    }

	    public void checkImpact( ISpell spell, IDoorClosed doorClosed) {

	    }

	    public void checkImpact( ISpell spell, IDoorOpened doorOpened) {

	    }

	    public void checkImpact( IMonster1 monster, IHBone hBone) {

	    }
	    
	    public void checkImpact( IMonster2 monster, IHBone hBone) {

	    }
	    
	    public void checkImpact( IMonster3 monster, IHBone hBone) {

	    }
	    
	    public void checkImpact( IMonster4 monster, IHBone hBone) {

	    }

	    public void checkImpact( IMonster1 monster, IVBone vBone) {

	    }
	    
	    public void checkImpact( IMonster2 monster, IVBone vBone) {

	    }
	    
	    public void checkImpact( IMonster3 monster, IVBone vBone) {

	    }
	    
	    public void checkImpact( IMonster4 monster, IVBone vBone) {

	    }

	    public void checkImpact( IMonster1 monster, IOBone oBone) {

	    }
	    
	    public void checkImpact( IMonster2 monster, IOBone oBone) {

	    }
	    
	    public void checkImpact( IMonster3 monster, IOBone oBone) {

	    }
	    
	    public void checkImpact( IMonster4 monster, IOBone oBone) {

	    }

	    public void checkImpact( IMonster1 monster, IEnergyBall energyBall) {

	    }
	    
	    public void checkImpact( IMonster2 monster, IEnergyBall energyBall) {

	    }
	    
	    public void checkImpact( IMonster3 monster, IEnergyBall energyBall) {

	    }
	    
	    public void checkImpact( IMonster4 monster, IEnergyBall energyBall) {

	    }

	    public void checkImpact( IMonster1 monster, IPurse purse) {

	    }
	    
	    public void checkImpact( IMonster2 monster, IPurse purse) {

	    }
	    
	    public void checkImpact( IMonster3 monster, IPurse purse) {

	    }
	    
	    public void checkImpact( IMonster4 monster, IPurse purse) {

	    }

	    public void checkImpact( IMonster1 monster, IDoorClosed doorClosed) {

	    }
	    
	    public void checkImpact( IMonster2 monster, IDoorClosed doorClosed) {

	    }
	    
	    public void checkImpact( IMonster3 monster, IDoorClosed doorClosed) {

	    }
	    
	    public void checkImpact( IMonster4 monster, IDoorClosed doorClosed) {

	    }

	    public void checkImpact( IMonster1 monster, IDoorOpened doorOpened) {

	    }
	    
	    public void checkImpact( IMonster2 monster, IDoorOpened doorOpened) {

	    }
	    
	    public void checkImpact( IMonster3 monster, IDoorOpened doorOpened) {

	    }
	    
	    public void checkImpact( IMonster4 monster, IDoorOpened doorOpened) {

	    }

		@Override
		public Example getExampleById(int id) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Example getExampleByName(String name) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Example> getAllExamples() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Case> getAllCasesByID(int id) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

	
}
