package controller;

import java.sql.SQLException;
import java.util.List;

import model.Case;
import model.Example;
import model.IElement;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    private IElement[][] level;

	private ViewFacade viewFacade;
    
    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        
        final List<Case> cases = this.getModel().getAllCasesByID(2);
        final StringBuilder message = new StringBuilder();
        for (final Case c : cases) {
            message.append(c);
            message.append('\n');
        }
        System.out.println(message.toString());
        
        this.getModel().CreateLevel(cases);
        
        this.getView().displayMap(this.getModel().getLevel());
        
        this.level = this.getModel().getLevel();
        
        this.setViewFacade(new ViewFacade());
       
        
    }

    private void setViewFacade(ViewFacade viewFacade) {
    	this.viewFacade = viewFacade;
		
	}

	/**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
    
    /**
    public void setViewFacade(ViewFacade viewFacade) {
		this.viewFacade = viewFacade;
	}*/

	
}
