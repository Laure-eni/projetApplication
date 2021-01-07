package fr.eni.projetEncheres.bll;

import java.util.List;
import java.util.logging.Logger;

import fr.eni.projetEncheres.bo.Utilisateurs;
import fr.eni.projetEncheres.dal.UtilisateursDal;
import utils.MonLogger;

public class UtilisateursBll {
	
	private static Logger logger = MonLogger.getLogger("UtilisateursBll");
	
	public static void insert(Utilisateurs utilisateur) throws Exception
	{
		if(utilisateur.getPseudo().trim().equals(""))
		{
			throw new Exception("Pseudo incorrect");
		}
		if(utilisateur.getEmail().trim().equals(""))
		{
			throw new Exception("Email incorrect");
		}
		
		UtilisateursDal.insert(utilisateur);
	}
	
	public static Utilisateurs get(int no_utilisateur) {
		return UtilisateursDal.get(no_utilisateur);
		
	}
	
	public static List<Utilisateurs> SelectALL() {
		return UtilisateursDal.selectALL();
	}
	
	public static void update(Utilisateurs utilisateur) {
		UtilisateursDal.update(utilisateur);
			
	}
	
	public static void delete(int no_utilisateur) throws Exception {
        if(no_utilisateur <= 0)
        {
            throw new Exception("n° utilisateur incorrect");
        }
        UtilisateursDal.delete(no_utilisateur);
	}


}
