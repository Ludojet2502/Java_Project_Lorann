package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Observer;

import model.Case;
import model.Example;
import model.IDoorClosed;
import model.IDoorOpened;
import model.IElement;
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
import showboard.ISquare;



public class Impact implements IModel, ILorann, IMonster1, IMonster2, IMonster3, IMonster4, ISpell, IHBone, IVBone, IOBone, IEnergyBall, IPurse, IDoorClosed, IDoorOpened{
	
		/**
		 * the method pour checking impact between Lorann and Monster1
		 * 
		 * @param lorann
		 * @param monster
		 */
		public void checkImpact( ILorann lorann, IMonster1 monster1) {
			lorann = null;
        }
	 	/**
	 	 * the method pour checking impact between Lorann and Monster2
	 	 * 
	 	 * @param lorann
	 	 * @param monster
	 	 */
	 	public void checkImpact( ILorann lorann, IMonster2 monster2) {
			lorann = null;
        }
	 	/**
	 	 * the method pour checking impact between Lorann and Monster3
	 	 * 
	 	 * @param lorann
	 	 * @param monster
	 	 */
	 	public void checkImpact( ILorann lorann, IMonster3 monster3) {
			lorann = null;
        }
	 	/**
	 	 * the method pour checking impact between Lorann and Monster4
	 	 * 
	 	 * @param lorann
	 	 * @param monster
	 	 */
	 	public void checkImpact( ILorann lorann, IMonster4 monster4) {
			lorann = null;
        }
	 	/**
	 	 * the method pour checking impact between Lorann and Spell
	 	 * 
	 	 * @param lorann
	 	 * @param spell
	 	 */
	    public void checkImpact( ILorann lorann, ISpell spell) {
			spell = null;
	    }
	    /**
	     * the method pour checking impact between Lorann and hbone
	     * 
	     * @param lorann
	     * @param hBone
	     */
	    public void checkImpact( ILorann lorann, IHBone hBone) {

	    }
	    /**
	     * the method pour checking impact between Lorann and vbone
	     * 
	     * @param lorann
	     * @param vBone
	     */
	    public void checkImpact( ILorann lorann, IVBone vBone) {

	    }
	    /**
	     * the method pour checking impact between Lorann and obone
	     * 
	     * @param lorann
	     * @param oBone
	     */
	    public void checkImpact( ILorann lorann, IOBone oBone) {

	    }
	    /**
	     * the method pour checking impact between Lorann and energyBall
	     * 
	     * @param lorann
	     * @param energyBall
	     */
	    public void checkImpact( ILorann lorann, IEnergyBall energyBall) {
			energyBall = null;
	    }
	    /**
	     * the method pour checking impact between Lorann and pruse
	     * 
	     * @param lorann
	     * @param purse
	     */
	    public void checkImpact( ILorann lorann, IPurse purse) {
			purse = null;
	    }
	    
	    /**
	     * the method pour checking impact between Lorann and doorclosed
	     * 
	     * @param lorann
	     * @param doorClosed
	     */
	    public void checkImpact( ILorann lorann, IDoorClosed doorClosed) {
			lorann = null;
	    }
	    
	    /**
	     * the method pour checking impact between Lorann and dooropened
	     * 
	     * @param lorann
	     * @param doorOpened
	     */
	    public void checkImpact( ILorann lorann, IDoorOpened doorOpened) {
			lorann = null;
	    }
	    
	    /**
	     * the method pour checking impact between Spell and Monster1
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster1 monster1) {
			monster1 = null;
			spell = null;
	    }
	    
	    /**
	     * the method pour checking impact between Spell and Monster2
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster2 monster2) {
			monster2 = null;
			spell = null;
	    }
	    
	    /**
	     * the method pour checking impact between Spell and Monster3
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster3 monster3) {
			monster3 = null;
			spell = null;
	    }
	    
	    /**
	     * the method pour checking impact between Spell and Monster4
	     * 
	     * @param spell
	     * @param monster
	     */
	    public void checkImpact( ISpell spell, IMonster4 monster4) {
			monster4 = null;
			spell = null;
	    }

	    /**
	     * the method pour checking impact between Spell and hbone
	     * 
	     * @param spell
	     * @param hBone
	     */
	    public void checkImpact( ISpell spell, IHBone hBone) {

	    }
	    
	    /**
	     * the method pour checking impact between Spell and obone
	     * 
	     * @param spell
	     * @param oBone
	     */
	    public void checkImpact( ISpell spell, IOBone oBone) {

	    }
	    
	    /**
	     * the method pour checking impact between Spell and vbone
	     * 
	     * @param spell
	     * @param vBone
	     */
	    public void checkImpact( ISpell spell, IVBone vBone) {

	    }

	    /**
	     * the method pour checking impact between Spell and energyBall
	     * 
	     * @param spell
	     * @param energyBall
	     */
	    public void checkImpact( ISpell spell,  IEnergyBall energyBall) {

	    }

	    /**.
	     * the method pour checking impact between Spell and purse
	     * 
	     * @param spell
	     * @param purse
	     */
	    public void checkImpact( ISpell spell, IPurse purse) {

	    }

	    /**
	     * the method pour checking impact between Spell and doorclosed
	     * 
	     * @param spell
	     * @param doorClosed
	     */
	    public void checkImpact( ISpell spell, IDoorClosed doorClosed) {

	    }

	    /**
	     * the method pour checking impact between Spell and dooropened
	     * 
	     * @param spell
	     * @param doorOpened
	     */
	    public void checkImpact( ISpell spell, IDoorOpened doorOpened) {

	    }

	    /**
	     * the method pour checking impact between monster1 and hbone
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster1 monster1, IHBone hBone) {

	    }
	    
	    /**
	     * the method pour checking impact between monster2 and hbone
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster2 monster2, IHBone hBone) {

	    }
	    /**
	     * the method pour checking impact between monster3 and hbone
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster3 monster3, IHBone hBone) {

	    }
	    /**
	     * the method pour checking impact between monster4 and hbone
	     * 
	     * @param monster
	     * @param hBone
	     */
	    public void checkImpact( IMonster4 monster4, IHBone hBone) {

	    }

	    /**
	     * the method pour checking impact between monster1 and vbone
	     * 
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster1 monster1, IVBone vBone) {

	    }
	    
	    /**
	     * the method pour checking impact between monster2 and vbone
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster2 monster2, IVBone vBone) {

	    }
	    
	    /**
	     *  the method pour checking impact between monster3 and vbone
	     * 
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster3 monster3, IVBone vBone) {

	    }
	    
	    /**
	     *  the method pour checking impact between monster4 and vbone
	     * 
	     * @param monster
	     * @param vBone
	     */
	    public void checkImpact( IMonster4 monster4, IVBone vBone) {

	    }

	    /**
	     *  the method pour checking impact between monster1 and obone
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster1 monster1, IOBone oBone) {

	    }
	    
	    /**
	     * the method pour checking impact between monster2 and obone
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster2 monster2, IOBone oBone) {

	    }
	    
	    /**
	     * the method pour checking impact between monster3 and obone
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster3 monster3, IOBone oBone) {

	    }
	    
	    /**
	     * the method pour checking impact between monster4 and obone
	     * 
	     * @param monster
	     * @param oBone
	     */
	    public void checkImpact( IMonster4 monster4, IOBone oBone) {

	    }

	    /**
	     * the method pour checking impact between monster1 and energyBall
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster1 monster1, IEnergyBall energyBall) {

	    }
	    
	    /**
	     * the method pour checking impact between monster2 and energyBall
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster2 monster2, IEnergyBall energyBall) {

	    }
	    
	    /**
	     * the method pour checking impact between monster3 and energyBall
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster3 monster3, IEnergyBall energyBall) {

	    }
	    
	    /**
	     * the method pour checking impact between monster4 and energyBall
	     * 
	     * @param monster
	     * @param energyBall
	     */
	    public void checkImpact( IMonster4 monster4, IEnergyBall energyBall) {

	    }

	    /**
	     * the method pour checking impact between monster1 and purse
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster1 monster1, IPurse purse) {

	    }
	    
	    /**
	     * the method pour checking impact between monster2 and purse
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster2 monster2, IPurse purse) {

	    }
	    
	    /**
	     * the method pour checking impact between monster3 and purse
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster3 monster3, IPurse purse) {

	    }
	    
	    /**
	     * the method pour checking impact between monster4 and purse
	     * 
	     * @param monster
	     * @param purse
	     */
	    public void checkImpact( IMonster4 monster4, IPurse purse) {

	    }

	    /**
	     * the method pour checking impact between monster1 and doorclosed
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster1 monster1, IDoorClosed doorClosed) {

	    }
	    
	    /**
	     * the method pour checking impact between monster2 and doorclosed
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster2 monster2, IDoorClosed doorClosed) {

	    }
	    
	    /**
	     * the method pour checking impact between monster3 and doorclosed
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster3 monster3, IDoorClosed doorClosed) {

	    }
	    
	    /**
	     * the method pour checking impact between monster4 and doorclosed
	     * 
	     * @param monster
	     * @param doorClosed
	     */
	    public void checkImpact( IMonster4 monster4, IDoorClosed doorClosed) {

	    }

	    /**
	     * the method pour checking impact between monster1 and dooropened
	     * 
	     * @param monster
	     * @param doorOpened
	     */
	    public void checkImpact( IMonster1 monster1, IDoorOpened doorOpened) {

	    }
	    
	    /**
	     * the method pour checking impact between monster2 and dooropened
	     * 
	     * @param monster
	     * @param doorOpened
	     */
	    public void checkImpact( IMonster2 monster2, IDoorOpened doorOpened) {

	    }
	    
	    /**
	     * the method pour checking impact between monster3 and dooropened
	     * 
	     * @param monster
	     * @param doorOpened
	     */
	    public void checkImpact( IMonster3 monster3, IDoorOpened doorOpened) {

	    }
	    
	    /**
	     * the method pour checking impact between monster4 and dooropened
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
		/**
	     * 
	     */
		@Override
		public void CreateLevel(List<Case> cases) throws SQLException {
			// TODO Auto-generated method stub
			
		}
		/**
	     * 
	     */
		@Override
		public IElement[][] getLevel() {
			// TODO Auto-generated method stub
			return null;
		}
	    
	  
	
}
