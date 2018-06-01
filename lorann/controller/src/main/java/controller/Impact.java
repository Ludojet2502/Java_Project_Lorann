package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IDoorClosed;
import model.IDoorOpened;
import model.IEnergyBall;
import model.IHBone;
import model.ILorann;
import model.IModel;
import model.IMonster;
import model.IOBone;
import model.IPurse;
import model.ISpell;
import model.IVBone;



public class Impact implements IModel, ILorann, IMonster, ISpell, IHBone, IVBone, IOBone, IEnergyBall, IPurse, IDoorClosed, IDoorOpened{
	 public void checkImpact( ILorann lorann, IMonster monster) {

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

	    public void checkImpact( ISpell spell, IMonster monster) {

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

	    public void checkImpact( IMonster monster, IHBone hBone) {

	    }

	    public void checkImpact( IMonster monster, IVBone vBone) {

	    }

	    public void checkImpact( IMonster monster, IOBone oBone) {

	    }

	    public void checkImpact( IMonster monster, IEnergyBall energyBall) {

	    }

	    public void checkImpact( IMonster monster, IPurse purse) {

	    }

	    public void checkImpact( IMonster monster, IDoorClosed doorClosed) {

	    }

	    public void checkImpact( IMonster monster, IDoorOpened doorOpened) {

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

	
}
