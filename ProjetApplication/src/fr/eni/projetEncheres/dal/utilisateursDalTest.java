package fr.eni.projetEncheres.dal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projetEncheres.bo.Retraits;
import fr.eni.projetEncheres.bo.Utilisateurs;
import fr.eni.projetEncheres.dal.UtilisateursDal;
import fr.eni.projetEncheres.dal.RetraitsDal;




public class utilisateursDalTest {

	public static void main(String[] args) throws IOException {
		
											// TESTS UTILISTEURS
	//UtilisateursDal utilisateur1 = new UtilisateursDal();
	//UtilisateursDal utilisateur2 = new UtilisateursDal();
	//UtilisateursDal utilisateur3 = new UtilisateursDal();
		
	//Utilisateurs JeanPaul = new Utilisateurs("JP", "Jean-Paul", "Dupont", "jp@gmail.com",  "0650852520", "rue Dupuis", "54000", "Nancy", "1234", 50, 0);
	//UtilisateursDal.insert(JeanPaul);

	//Utilisateurs Adrian = new Utilisateurs("LeSauveur", "Adrian", "Lepage", "adrian@gmail.com",  "0650852530", "rue des super héros", "10000", "Gotham", "1234", 50, 0);
	//UtilisateursDal.insert(Adrian);
	
	//Utilisateurs Hubert = new Utilisateurs("HB", "Hubert", "Lebreton", "hb@hotmail.com",  "0750852515", "rue de la Bretagne", "35000", "Rennes", "4321", 50, 0);
	//UtilisateursDal.insert(Hubert);
	
	//List<Utilisateurs> resultatRequete= new ArrayList<Utilisateurs>();
    //resultatRequete = UtilisateursDal.selectALL();
    //for(Utilisateurs user : resultatRequete) {
    //System.out.println(user.getNom()+ " " + user.getPrenom());//
        
		
												//TESTS RETRAITS
       // RetraitsDal retrait1 = new RetraitsDal();
        //RetraitsDal retrait2 = new RetraitsDal();
        
        
        //Retraits numero1 = new Retraits("rue de la madeleine", "69000", "Lyon" );
        //RetraitsDal.insert(numero1);
		
       // Retraits numero2 = new Retraits("rue de la ferme", "51500", "Taissy" );
        //RetraitsDal.insert(numero2);
        
        List<Retraits> resultatRequete= new ArrayList<Retraits>();
        resultatRequete = RetraitsDal.selectALL();
        for(Retraits removal : resultatRequete) {
        System.out.println(removal.getNo_retrait() + " " + removal.getCode_postal()+ " " + removal.getVille());
       
    }
	
	
	}
}
