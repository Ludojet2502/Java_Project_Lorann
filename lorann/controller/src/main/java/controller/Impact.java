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
	
	/**
	 * 
	 * @param lorann
	 * @param monster
	 */
		public void checkImpact( ILorann lorann, IMonster1 monster1) {
			lorann = null;
        }
	 	/**
	 	 * 
	 	 * @param lorann
	 	 * @param monster
	 	 */
	 	public void checkImpact( ILorann lorann, IMonster2 monster2) {
			lorann = null;
        }
	 	/**
	 	 * 
	 	 * @param lorann
	 	 * @param monster
	 	 */
	 	public void checkImpact( ILorann lorann, IMonster3 monster3) {
			lorann = null;
        }
	 	/**
	 	 * 
	 	 * @param lorann
	 	 * @param monster
	 	 */
	 	public void checkImpact( ILorann lorann, IMonster4 monster4) {
			lorann = null;
        }
	 	/**
	 	 * 
	 	 * @param lorann
	 	 * @param spell
	 	 */
	    public void checkImpact( ILorann lorann, ISpell spell) {
			spell = null;
	    }
	    /**
	     * 
	     * @param lorann
	     * @param hBone
	     */
	    public void checkImpact( ILorann lorann, IHBone hBone) {

	    }
	    /**
	     * 
	     * @param lorann
	     * @param vBone
	     */
	    public void checkImpact( ILorann lorann, IVBone vBone) {

	    }
	    /**
	     * 
	     * @param lorann
	     * @param oBone
	     */
	    public void checkImpact( ILorann lorann, IOBone oBone) {

	    }
	    /**
	     * 
	     * @param lorann
	     * @param energyBall
	     */
	    public void checkImpact( ILorann lorann, IEnergyBall energyBall) {
			energyBall = null;
	    }
	    /**
	     * 
	     * @param lorann
	     * @param purse
	     */
	    public void checkImpact( ILorann lorann, IPurse purse) {
			purse = null;
	    }
	    
	    /**
	     * 
	     * @param lorann
	     * @param doorClosed
	     */
	    public void checkImpact( ILorann lorann, IDoorClosed doorClosed) {
			lorann = null;
	    }
	    
	    /**
	     * 
	     * @param lorann
	     * @param doorOpened
	     */
	    public void checkImpact( ILorann lorann, IDoorOpened doorOpened) {
			lorann = null;
	    }
	    
	    /**
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster1 monster1) {
			monster1 = null;
			spell = null;
	    }
	    
	    /**
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster2 monster2) {
			monster2 = null;
			spell = null;
	    }
	    
	    /**
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster3 monster3) {
			monster3 = null;
			spell = null;
	    }
	    
	    /**
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster4 monster4) {
			monster4 = null;
			spell = null;
	    }

	    /**
	     * 
	     * @param spell
	     * @param hBone
	     */
	    public void checkImpact( ISpell spell, IHBone hBone) {

	    }
	    
	    /**
	     * 
	     * @param spell
	     * @param oBone
	     */
	    public void checkImpact( ISpell spell, IOBone oBone) {

	    }
	    
	    /**
	     * 
	     * @param spell
	     * @param vBone
	     */
	    public void checkImpact( ISpell spell, IVBone vBone) {

	    }

	    /**
	     * 
	     * @param spell
	     * @param energyBall
	     */
	    public void checkImpact( ISpell spell,  IEnergyBall energyBall) {

	    }

	    /**.
	     * 
	     * @param spell
	     * @param purse
	     */
	    public void checkImpact( ISpell spell, IPurse purse) {

	    }

	    /**
	     * 
	     * @param spell
	     * @param doorClosed
	     */
	    public void checkImpact( ISpell spell, IDoorClosed doorClosed) {

	    }

	    /**
	     * 
	     * @param spell
	     * @param doorOpened
	     */
	    public void checkImpact( ISpell spell, IDoorOpened doorOpened) {

	    }

	    /**
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster1 monster1, IHBone hBone) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster2 monster2, IHBone hBone) {

	    }
	    /**
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster3 monster3, IHBone hBone) {

	    }
	    /**
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster4 monster4, IHBone hBone) {

	    }

	    /**
	     * 
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster1 monster1, IVBone vBone) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster2 monster2, IVBone vBone) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster3 monster3, IVBone vBone) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster4 monster4, IVBone vBone) {

	    }

	    /**
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster1 monster1, IOBone oBone) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster2 monster2, IOBone oBone) {

	    }
	    
	    /**.
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster3 monster3, IOBone oBone) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster4 monster4, IOBone oBone) {

	    }

	    /**
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster1 monster1, IEnergyBall energyBall) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster2 monster2, IEnergyBall energyBall) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster3 monster3, IEnergyBall energyBall) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster4 monster4, IEnergyBall energyBall) {

	    }

	    /**
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster1 monster1, IPurse purse) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster2 monster2, IPurse purse) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster3 monster3, IPurse purse) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster4 monster4, IPurse purse) {

	    }

	    /**
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster1 monster1, IDoorClosed doorClosed) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster2 monster2, IDoorClosed doorClosed) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster3 monster3, IDoorClosed doorClosed) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster4 monster4, IDoorClosed doorClosed) {

	    }

	    /**
	     * 
	     * @param monster
	     * @param doorOpened
	     */
	    public void checkImpact( IMonster1 monster1, IDoorOpened doorOpened) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param doorOpened
	     */
	    public void checkImpact( IMonster2 monster2, IDoorOpened doorOpened) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param doorOpened
	     */
	    public void checkImpact( IMonster3 monster3, IDoorOpened doorOpened) {

	    }
	    
	    /**
	     * 
	     * @param monster
	     * @param doorOpened
	     */
	    public void checkImpact( IMonster4 monster4, IDoorOpened doorOpened) {

	    }
	    
	    /**
	     * 
	     */
		@Override
		public Example getExampleById(int id) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		 * 
		 */
		@Override
		public Example getExampleByName(String name) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		 * 
		 */
		@Override
		public List<Example> getAllExamples() throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

		/**
		 * 
		 */
		@Override
		public List<Case> getAllCasesByID(int id) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

	
}
