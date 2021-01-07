package fr.eni.projetEncheres.dal;


import java.util.List;

import fr.eni.projetEncheres.bo.Categories;

public class TestDalCategories {
	
	public static void main(String[] args) {
	
	CategoriesDal cat1 = new CategoriesDal();
	
	Categories c1 = new Categories("Ameublement");
	CategoriesDal.insert(c1);
	Categories c2 = new Categories("Informatique");
	CategoriesDal.insert(c2);
	Categories c3 = new Categories("Jardinage");
	CategoriesDal.insert(c3);
	Categories c4 = new Categories("Vêtements");
	CategoriesDal.insert(c4);
	Categories c5 = new Categories("Electroménager");
	CategoriesDal.insert(c5);
	Categories c6 = new Categories("Livres");
	CategoriesDal.insert(c6);
	Categories c7 = new Categories("Sports");
	CategoriesDal.insert(c7);
	Categories c8 = new Categories("Loisirs créatifs");
	CategoriesDal.insert(c8);
	Categories c9 = new Categories("Jeux");
	CategoriesDal.insert(c9);
	
	
	//c8.setLibelle("Loisir créatif");
	//CategoriesDal.update(c8);
	//System.out.println("Article après modification  : " + c8.toString() );
	
	
	
	//Categories a = CategoriesDal.get(3);
	//System.out.println("Catégorie :  " + a.toString() );

	
	
	//CategoriesDal.delete(2);
	
	
	//List<Categories> categories = CategoriesDal.selectALL();
	//System.out.println("\nSélection de toutes les catégories : "  );
	//afficherCategories(categories);
	
	}
	
	//private static void afficherCategories(List<Categories> categories){
		//StringBuffer sb = new StringBuffer();
		//for(Categories cat: categories){
			//sb.append(cat.toString());
			//sb.append("\n");
		//}
		//System.out.println(sb.toString());
	//}
	
}


	
