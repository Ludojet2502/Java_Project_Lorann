package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.IController;
import model.IElement;
import model.IModel;
import showboard.BoardFrame;
import showboard.IPawn;
import showboard.ISquare;
import model.*;

/**
 * 
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

		/**
		 * 
		 */
        private BoardFrame boardFrame;
        
        /**
         * 
         */
		private IModel model;
		
		/**
		 * 
		 */
		private Rectangle view;
		
		/**
		 * 
		 */
		private IController Action;


    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
        this.boardFrame = new BoardFrame("Jeu du Lorann");
        
    }
    /**
    public void setMap(IElement[][] level) {
    	this.boardFrame.setLevel(level);
    }*/
    
    /**
     * 
     */
    public void displayMap(IElement[][] level) {
		for (int i = 0; i <= 11; i++) {
			for (int j = 0; j <= 19; j++) {
				System.out.print(level[j][i].getSprite());
			}
			System.out.println();
		}
	}
    
    

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * 
     */
    public void removePawns() {
    	this.boardFrame.removePawns();
    }
    
    /**
     * 
     * @param pawn
     */
    public void removePawn(IPawn pawn) {
    	this.boardFrame.removePawn(pawn);
    }
    
    /**
     * 
     * @param pawn
     */
    public void addPawn(IPawn pawn) {
    	this.boardFrame.addPawn(pawn);
    }
	
  
    
    
    /**
    public final void run() {
    	boardFrame.setDimension(new Dimension(20,12));
    	boardFrame.setDisplayFrame(this.view);
    	boardFrame.setSize(640, 384);
    	
    	for (int y = 0; y < 384; y++) {
    		for (int x = 0; x < 640; x++) {
    			boardFrame.addSquare((ISquare) this.model.getOnLevel(x,y),x,y);
    		}
    	}
    	
    	boardFrame.addKeyListener((KeyListener) Action);
    	this.model.addObserver(this.boardFrame.getObserver());
    	boardFrame.setFocusable(true);
    	boardFrame.requestFocus();
    	boardFrame.setVisible(true);
   	
    }*/
    

}
