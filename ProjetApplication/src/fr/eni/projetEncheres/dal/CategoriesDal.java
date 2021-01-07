package fr.eni.projetEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import fr.eni.projetEncheres.bo.Categories;

import utils.MonLogger;

public class CategoriesDal {

	private static final String INSERT = "INSERT INTO CATEGORIES VALUES (?)";
	private static final String GET_BY_ID = "SELECT * FROM CATEGORIES WHERE no_categorie = ?";
	private static final String GET_ALL = "SELECT * FROM CATEGORIES";
	private static final String UPDATE = "UPDATE CATEGORIES SET libelle = ? WHERE no_categorie = ?";
	private static final String DELETE = "DELETE CATEGORIES WHERE no_categorie = ?";

	private static Logger logger = MonLogger.getLogger("ProjetApplication");




	public  void insert(Categories categorie)  {
		try(Connection cnx = Utils.getConnection()){
			PreparedStatement rqt = cnx.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			rqt.setString(1, categorie.getLibelle());
			rqt.executeUpdate();
		} catch (Exception ex) {
			logger.severe("Erreur dans la méthode insert(Categories categorie) avec categorie =" + categorie.toString() + " Erreur : " + ex.getMessage());
		}
	}

	public  Categories get(int no_categorie)
	{
		Categories result = null;
		try(Connection cnx = Utils.getConnection())
		{
			PreparedStatement rqt = cnx.prepareStatement(GET_BY_ID);
			rqt.setInt(1, no_categorie);
			ResultSet rs = rqt.executeQuery();

			if(rs.next())
			{
				result = new Categories();
				result.setNo_categorie(rs.getInt("no_categorie"));
				result.setLibelle(rs.getString("libelle"));
			}
		} catch (SQLException e) {
			logger.severe("Erreur dans la méthode get(int no_categorie) avec no_categorie =" + no_categorie + " Erreur : " + e.getMessage());
		}
		return result;
	}
	
	public  List<Categories> selectALL()
	{
		List<Categories> categories = new ArrayList<>();
		try(Connection cnx = Utils.getConnection())
		{
			PreparedStatement rqt = cnx.prepareStatement(GET_ALL);
			ResultSet rs = rqt.executeQuery();
			while(rs.next())
			{
				Categories categorie = new Categories();
				categorie.setNo_categorie(rs.getInt("no_categorie"));
				categorie.setLibelle(rs.getString("libelle"));
				categories.add(categorie);
			}
		} catch (SQLException e) {
			logger.severe("Erreur dans la méthode selectALL() - Erreur : " + e.getMessage());
		}
		return categories;
	}
	public  void update(Categories categorie)
    {
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(UPDATE);
    		rqt.setString(1, categorie.getLibelle());
    		rqt.setInt(2, categorie.getNo_categorie());
    		rqt.executeUpdate();
    	} catch (SQLException e) {
    		logger.severe("Erreur dans la méthode update(Categories categorie) avec categorie =" + categorie.toString() + " Erreur : " + e.getMessage());
		}
    }
	 public  void delete(int no_categorie)
	    {
	    	try(Connection cnx = Utils.getConnection())
	    	{
	    		PreparedStatement rqt = cnx.prepareStatement(DELETE);
	    		rqt.setInt(1, no_categorie);
	    		rqt.executeUpdate();
	    	} catch (SQLException e) {
	    		logger.severe("Erreur dans la méthode delete(int no_categorie) avec no_categorie ="+no_categorie+" - Erreur : " + e.getMessage());
			}
	    }

}
