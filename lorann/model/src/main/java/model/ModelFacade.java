package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observer;

import model.dao.CaseDAO;
import model.dao.ExampleDAO;
import showboard.ISquare;
import model.*;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

	
	Level Niveau;
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

	
    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllCasesByID(int)
     */
	@Override
	public List<Case> getAllCasesByID(int id) throws SQLException {
		return CaseDAO.getAllCaseByID(id);
	}

	public void CreateLevel(List<Case> cases) throws SQLException{
		this.Niveau = new Level();
		Niveau.CreateMap(cases);
	}
	
	public IElement[][] getLevel(){
		return Niveau.getLevel();
	}
	
	public void setLevel(IElement[][] level) {
		Niveau.setLevel(level);
	}
	
	public char getIElement( int x, int y) {
		return Niveau.getIElement(x, y);
	}
	

}
