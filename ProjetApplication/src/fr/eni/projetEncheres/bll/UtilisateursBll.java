package fr.eni.projetEncheres.bll;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import fr.eni.projetEncheres.bo.Utilisateurs;
import fr.eni.projetEncheres.dal.UtilisateursDal;
import utils.MonLogger;

public class UtilisateursBll {
	
	private static Logger logger = MonLogger.getLogger("UtilisateursBll");
	
	public void insert(Utilisateurs utilisateur) throws Exception
	{
		
		UtilisateursDal u1 = new UtilisateursDal();
		
		if(utilisateur.getPseudo().trim().equals(""))
		{
			throw new Exception("Pseudo incorrect");
		}
		if(utilisateur.getEmail().trim().equals(""))
		{
			throw new Exception("Email incorrect");
		}
		
		u1.insert(utilisateur);
	}
	
	public Utilisateurs get(int no_utilisateur) throws Exception {
		
		UtilisateursDal u1 = new UtilisateursDal();
		 if(no_utilisateur <= 0)
	        {
	            throw new Exception("n° utilisateur incorrect");
	        }
		return u1.get(no_utilisateur);
	        		
	}
	
	public Utilisateurs get(String pseudo) throws Exception {
		
		UtilisateursDal u1 = new UtilisateursDal();
		 if(pseudo.isEmpty())
	        {
	            throw new Exception("pseudo incorrect");
	        }
		 if(pseudo.equals(""))
		 {
			 throw new Exception("pseudo déjà prit");
		 }
		return u1.get(pseudo);
		
}
		 
	
	public List<Utilisateurs> SelectALL() throws IOException {
		
		UtilisateursDal u1 = new UtilisateursDal();
		return u1.selectALL();
	}
	
	public void update(Utilisateurs utilisateur) throws IOException {
		UtilisateursDal u1 = new UtilisateursDal();
		u1.update(utilisateur);
			
	}
	
	public void delete(int no_utilisateur) throws Exception {
		UtilisateursDal u1 = new UtilisateursDal();
		
        if(no_utilisateur <= 0)
        {
            throw new Exception("n° utilisateur incorrect");
        }
        u1.delete(no_utilisateur);
	}


}
