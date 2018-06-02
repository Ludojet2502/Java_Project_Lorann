package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Case;
import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class CaseDAO extends AbstractDAO {

    

    /** The sql all examples. */
    private static String sqlAllCases   = "{call findAllCasesByID(?)}";

    /** The id column index. */
    private static int    idColumnIndex    = 1;
    
    /** The name column index. */
    private static int    id_mapColumnIndex  = 2;
    
    /** The name column index. */
    private static int    XColumnIndex  = 3;
    
    /** The name column index. */
    private static int    YColumnIndex  = 4;
    
    /** The name column index. */
    private static int    SpriteColumnIndex  = 5;

    
    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    
    
    public static List<Case> getAllCaseByID(final int id) throws SQLException {
        final ArrayList<Case> cases = new ArrayList<Case>();
        final CallableStatement callStatement = prepareCall(sqlAllCases);
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
            	cases.add(new Case(result.getInt(idColumnIndex), result.getInt(id_mapColumnIndex), result.getInt(XColumnIndex), result.getInt(YColumnIndex), result.getString(SpriteColumnIndex).charAt(0)));
            }
            result.close();
        }
        return cases;
    }
}
