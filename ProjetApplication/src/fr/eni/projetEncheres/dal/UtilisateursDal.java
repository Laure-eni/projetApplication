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
	private static final String INSERT = "INSERT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur ) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String GET_BY_NO_UTILISATEUR = "SELECT * FROM UTILISATEURS WHERE no_utilisateur = ?";
    private static final String GET_ALL = "SELECT * FROM UTILISATEURS";
    private static final String UPDATE = "UPDATE UTILISATEURS SET pseudo = ?, nom = ?, prenom = ?, email = ?, rue = ?, code_postal = ?, ville = ?, mot_de_passe = ?, credit = ?, administrateur= ? WHERE no_utilisateur = ?";
    private static final String DELETE = "DELETE UTILISATEURS WHERE pseudo = ?";

    private static Logger logger = MonLogger.getLogger("ProjetApplication");

    public UtilisateursDal() throws IOException {
    }

    public static void insert(Utilisateurs utilisateur)
    {
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(INSERT);
    		rqt.setString(1, utilisateur.getPseudo());
    		rqt.setString(2, utilisateur.getNom());
    		rqt.setString(3, utilisateur.getPrenom());
    		rqt.setString(4, utilisateur.getEmail());
    		rqt.setString(5, utilisateur.getTelephone());
    		rqt.setString(6, utilisateur.getRue());
    		rqt.setString(7, utilisateur.getCode_postal());
    		rqt.setString(8, utilisateur.getVille());
    		rqt.setString(9, utilisateur.getMot_de_passe());
    		rqt.setInt(10, utilisateur.getCredit());
    		rqt.setInt(11, utilisateur.getAdministrateur());
    		rqt.executeUpdate();
    		
    		
		} catch (SQLException ex) {
			logger.severe("Erreur dans la methode insert(Utilisateurs utilisateur)avec utilisateur = " + utilisateur + "-erreur :" + ex.getMessage()); 
		}	
    	
    }
    
    public static Utilisateurs get(int no_utilisateur)
    {
    	Utilisateurs result = null;
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(GET_BY_NO_UTILISATEUR);
    		rqt.setInt(1, no_utilisateur);
    		ResultSet rs = rqt.executeQuery();
    		
    		if(rs.next())
    		{
    			result = new Utilisateurs();
    			result.setNo_utilisateur(rs.getInt("no_utilisateur"));
    			result.setPseudo(rs.getString("pseudo"));
    			result.setNom(rs.getString("nom"));
    			result.setPrenom(rs.getString("prenom"));
    			result.setEmail(rs.getString("email"));
    			result.setRue(rs.getString("rue"));
    			result.setCode_postal(rs.getString("code_postal"));
    			result.setVille(rs.getString("ville"));
    			result.setMot_de_passe(rs.getString("mot_de_passe"));
    			result.setCredit(rs.getInt("credit"));
    			result.setAdministrateur(rs.getInt("administrateur"));
    		}
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return result;
    }
    
    public static List<Utilisateurs> selectALL()
    
    {
    	List<Utilisateurs> utilisateur = new ArrayList<>();
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(GET_ALL);
            ResultSet rs = rqt.executeQuery();
            
            while(rs.next())
            {
            	Utilisateurs user = new Utilisateurs();
            	user.setNom(rs.getString("nom"));
            	user.setPrenom(rs.getString("prenom"));
            	utilisateur.add(user);
            }
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	return utilisateur;
    }
    
    public static void update(Utilisateurs utilisateur)
    {
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(UPDATE);
    		rqt.setString(1, utilisateur.getPseudo());
    		rqt.setString(2, utilisateur.getNom());
    		rqt.setString(3, utilisateur.getPrenom());
    		rqt.setString(4, utilisateur.getEmail());
    		rqt.setString(5, utilisateur.getTelephone());
    		rqt.setString(6, utilisateur.getRue());
    		rqt.setString(7, utilisateur.getCode_postal());
    		rqt.setString(8, utilisateur.getVille());
    		rqt.setString(9, utilisateur.getMot_de_passe());
    		rqt.setInt(10, utilisateur.getCredit());
    		rqt.setInt(11, utilisateur.getAdministrateur());
    		
    		
    		rqt.executeUpdate();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public static void delete(int no_utilisateur)
    {
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(DELETE);
    		rqt.setInt(1, no_utilisateur);
    		rqt.executeUpdate();
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
}
