package fr.eni.projetEncheres.dal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projetEncheres.bo.Utilisateurs;
import fr.eni.projetEncheres.dal.UtilisateursDal;




public class utilisateursDalTest {

	public static void main(String[] args) throws IOException {
		
	//UtilisateursDal utilisateur1 = new UtilisateursDal();
	//UtilisateursDal utilisateur2 = new UtilisateursDal();
	//UtilisateursDal utilisateur3 = new UtilisateursDal();
		
	//Utilisateurs JeanPaul = new Utilisateurs("JP", "Jean-Paul", "Dupont", "jp@gmail.com",  "0650852520", "rue Dupuis", "54000", "Nancy", "1234", 50, 0);
	//UtilisateursDal.insert(JeanPaul);

	//Utilisateurs Adrian = new Utilisateurs("LeSauveur", "Adrian", "Lepage", "adrian@gmail.com",  "0650852530", "rue des super héros", "10000", "Gotham", "1234", 50, 0);
	//UtilisateursDal.insert(Adrian);
	
	//Utilisateurs Hubert = new Utilisateurs("HB", "Hubert", "Lebreton", "hb@hotmail.com",  "0750852515", "rue de la Bretagne", "35000", "Rennes", "4321", 50, 0);
	//UtilisateursDal.insert(Hubert);
	
	List<Utilisateurs> resultatRequete= new ArrayList<Utilisateurs>();
    resultatRequete = UtilisateursDal.selectALL();
    for(Utilisateurs user : resultatRequete) {
        System.out.println(user.getNom()+ " " + user.getPrenom());
       
    }
		
		
		
		 
	
	
	
	
	}
}