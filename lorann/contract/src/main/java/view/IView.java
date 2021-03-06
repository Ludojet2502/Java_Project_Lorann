package view;

import model.IElement;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
     * Display Map.
     * 
     * @param level 
     * 				the level
     */
    void displayMap(IElement[][] level);
}
