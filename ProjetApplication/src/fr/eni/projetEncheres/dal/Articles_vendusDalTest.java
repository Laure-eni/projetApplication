package fr.eni.projetEncheres.dal;

import fr.eni.projetEncheres.dal.Articles_vendusdal;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import fr.eni.projetEncheres.bo.Articles_vendus;

public class Articles_vendusDalTest {

	public static void main(String[] args) throws IOException {
		
		Articles_vendusdal article1 = new Articles_vendusdal();
		Articles_vendusdal article2 = new Articles_vendusdal();
		//Articles_vendusdal article3 = new Articles_vendusdal();
//		Date date = null;
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
//		String date1 = "22/06/2006";	
//		date = simpleDateFormat.parse(date1);
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 8);
		LocalDate date2 = LocalDate.of(2021, Month.JANUARY, 9);
		Articles_vendus voiture = new Articles_vendus("voiture", "petite voiture jouet", date, date2, 15, 10, 3, 5, 3);
		Articles_vendusdal.insert(voiture);

		//Utilisateurs Adrian = new Utilisateurs("LeSauveur", "Adrian", "Lepage", "adrian@gmail.com",  "0650852530", "rue des super héros", "10000", "Gotham", "1234", 50, 0);
		//UtilisateursDal.insert(Adrian);
		
		//Utilisateurs Hubert = new Utilisateurs("HB", "Hubert", "Lebreton", "hb@hotmail.com",  "0750852515", "rue de la Bretagne", "35000", "Rennes", "4321", 50, 0);
		//UtilisateursDal.insert(Hubert);

	}

}
