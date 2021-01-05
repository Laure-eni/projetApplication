package fr.eni.projetEncheres.dal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



import fr.eni.projetEncheres.bo.Utilisateurs;
import utils.MonLogger;

public class UtilisateursDal {
	private static final String INSERT = "INSERT INTO Utilisateurs VALUES (?,?)";
    private static final String GET_BY_ID = "SELECT * FROM Utilisateurs WHERE pseudo = ?";
    private static final String GET_ALL = "SELECT * FROM Utilisateurs";
    private static final String UPDATE = "UPDATE Utilisateurs SET nom = ?, prenom = ? WHERE pseudo = ?";
    private static final String DELETE = "DELETE Utilisateurs WHERE pseudo = ?";

    private static Logger logger = MonLogger.getLogger("ProjetApplication");

    public UtilisateursDal() throws IOException {
    }

    public static void insert(Utilisateurs utilisateur)
    {
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(INSERT);
    		rqt.setString(1, utilisateur.getNom());
    		rqt.setString(2, utilisateur.getPrenom());
		} catch (SQLException ex) {
			logger.severe("Erreur dans la methode insert(Utilisateurs utilisateur)avec utilisateur = " + utilisateur + "-erreur :" + ex.getMessage()); 
		}	
    	
    }
    
    public static Utilisateurs get(String pseudo)
    {
    	Utilisateurs result = null;
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(GET_BY_ID);
    		rqt.setString(1, pseudo);
    		ResultSet rs = rqt.executeQuery();
    		
    		if(rs.next())
    		{
    			result = new Utilisateurs();
    			result.setPseudo(rs.getString("pseudo"));
    			result.setNom(rs.getString("nom"));
    			result.setPrenom(rs.getString("prenom"));
    		}
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return result;
    }
    
    public static List<Utilisateurs> get()
    {
    	List<Utilisateurs> lists = new ArrayList<>();
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(GET_ALL);
            ResultSet rs = rqt.executeQuery();
            
            while(rs.next())
            {
            	Utilisateurs utilisateur = new Utilisateurs();
            	utilisateur.setPseudo(rs.getString("id"));
            	utilisateur.setNom(rs.getString("nom"));
            	utilisateur.setPrenom(rs.getString("prenom"));
            }
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	return lists;
    }
   
}
