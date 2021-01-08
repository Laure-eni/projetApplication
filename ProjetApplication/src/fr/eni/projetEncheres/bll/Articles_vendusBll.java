package fr.eni.projetEncheres.bll;

import java.util.List;
import java.util.logging.Logger;
import fr.eni.projetEncheres.bo.Articles_vendus;
import fr.eni.projetEncheres.dal.Articles_vendusdal;
import utils.MonLogger;

//testcomit.
public class Articles_vendusBll {
	
private static Logger logger = MonLogger.getLogger("UtilisateursBll");
	
	public void insert(Articles_vendus article_vendu) throws Exception
 {
	
	Articles_vendusdal A1 = new Articles_vendusdal();
	
		if(article_vendu.getNom_article().isEmpty())
			
		 {
			throw new Exception("nom article incorrect");
		 }
		
		A1.insert(article_vendu);
	}
	
	public static Articles_vendus get(int no_article) throws Exception {

		Articles_vendusdal A1 = new Articles_vendusdal();
		
        if(no_article <= 0){
            throw new Exception("Valeur incorrecte");
        }
        return A1.get(no_article);
    }
	
 public static List<Articles_vendus> selectAll() throws Exception {
		 
		 Articles_vendusdal A1 = new Articles_vendusdal();

	        return A1.selectALL();
	    }
}
