package view;

import javax.swing.JOptionPane;

import showboard.BoardFrame;
import showboard.IPawn;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

        private BoardFrame boardFrame;


    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
        //this.boardFrame = new BoardFrame("Lorann");
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void removePawns() {
    	this.boardFrame.removePawns();
    }
    
    public void removePawn(IPawn pawn) {
    	this.boardFrame.removePawn(pawn);
    }
    
    public void addPawn(IPawn pawn) {
    	this.boardFrame.addPawn(pawn);
    }
    

}
