package fr.eni.projetEncheres.dal;

import java.util.logging.Logger;

import fr.eni.projetEncheres.bo.Articles_vendus;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import java.time.LocalDate;
import utils.MonLogger;
import java.sql.Date;


public class Articles_vendusdal {
	
	


	Date date = Date.valueOf(LocalDate.now());
	
	private static final String INSERT = "INSERT INTO ARTICLES_VENDUS(nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_vendeur,no_categorie) VALUES (?,?,?,?,?,?,?,?)";
    private static final String GET_BY_NO_ARTICLE = "SELECT * FROM ARTICLES_VENDUS WHERE no_article = ?";
    private static final String GET_ALL = "SELECT * FROM ARTICLES_VENDUS";
    private static final String UPDATE = "UPDATE ARTICLES_VENDUS SET nom_article = ?, description = ?, date_debut_encheres = ?, dete_fin_encheres = ?, prix_initial = ?, prix_vente = ?, no_vendeur = ?, no_categorie = ? WHERE no_article = ?";
    private static final String DELETE = "DELETE ARTICLE_VENDU WHERE no_article = ?";

    private static Logger logger = MonLogger.getLogger("ProjetApplication");
    
    public Articles_vendusdal() throws IOException {
    }

    public static void insert(Articles_vendus article_vendu)
    {
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(INSERT);
    		rqt.setString(1, article_vendu.getNom_article());
    		rqt.setString(2, article_vendu.getDescription());
    		rqt.setDate(3, article_vendu.getDate_debut_encheres());
    		rqt.setDate(4, article_vendu.getDate_fin_encheres());
    		rqt.setInt(5, article_vendu.getPrix_initial());
    		rqt.setInt(6, article_vendu.getPrix_vente());
    		rqt.setInt(7, article_vendu.getNo_utilisateur());//no_vendeur
    		rqt.setInt(8, article_vendu.getNo_categorie());
    		
    		rqt.executeUpdate();
    		
    		
		} catch (SQLException ex) {
			logger.severe("Erreur dans la methode insert(Articles_vendus article_vendu)avec article_vendu = " + article_vendu + "-erreur :" + ex.getMessage()); 
		}	
    	
    }
    public static Articles_vendus get(int no_article)
    
    {
    	Articles_vendus result = null;
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(GET_BY_NO_ARTICLE);
    		rqt.setInt(1, no_article);
    		ResultSet rs = rqt.executeQuery();
    		
    		if(rs.next())
    		{
    			result = new Articles_vendus();
    			result.setNom_article(rs.getString("Nom article"));
    			result.setDescription(rs.getString("Description"));
    			result.setDate_debut_encheres(rs.getDate("date debut encheres"));
    			result.setDate_fin_encheres(rs.getDate("date de fin echeres"));
    			result.setPrix_initial(rs.getInt("Prix initial de l'article"));
    			result.setPrix_vente(rs.getInt("prix de vente de l'article"));
    			result.setNo_utilisateur(rs.getInt("num�ro du vendeur"));//no_vendeur
    			result.setNo_categorie(rs.getInt("categorie de l'article"));
   
    			
    		}
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return result;
}
 public static List<Articles_vendus> selectALL()
    
    {
    	List<Articles_vendus> article_vendu = new ArrayList<>();
    	try(Connection cnx = Utils.getConnection())
    	{
    		PreparedStatement rqt = cnx.prepareStatement(GET_ALL);
            ResultSet rs = rqt.executeQuery();
            
            while(rs.next())
            {
            	Articles_vendus vente = new Articles_vendus();
            	vente.setNom_article(rs.getString("Nom article"));
            	article_vendu.add(vente);
            }
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	return article_vendu;
    }
 
 public static void update(Articles_vendus article_vendu)
 {
 	try(Connection cnx = Utils.getConnection())
 	{
 		PreparedStatement rqt = cnx.prepareStatement(UPDATE);
 		rqt.setString(1, article_vendu.getNom_article());
 		rqt.setString(2, article_vendu.getDescription());
 		rqt.setDate(3, article_vendu.getDate_debut_encheres());
 		rqt.setDate(4, article_vendu.getDate_fin_encheres());
 		rqt.setInt(5, article_vendu.getPrix_initial());
 		rqt.setInt(6, article_vendu.getPrix_vente());
 		rqt.setInt(7, article_vendu.getNo_utilisateur());//no_vendeur
 		rqt.setInt(8, article_vendu.getNo_categorie());
 		
 		
 		
 		rqt.executeUpdate();
 	} catch (SQLException e) {
			e.printStackTrace();
		}
 }
 
 public static void delete(int no_article)
 {
 	try(Connection cnx = Utils.getConnection())
 	{
 		PreparedStatement rqt = cnx.prepareStatement(DELETE);
 		rqt.setInt(1, no_article);
 		rqt.executeUpdate();
 	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }

}
