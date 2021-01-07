package fr.eni.projetEncheres.bll;

import java.util.List;

import fr.eni.projetEncheres.bo.Categories;
import fr.eni.projetEncheres.dal.CategoriesDal;

public class CategoriesBll {
	
	
	public static void insert(Categories categorie) throws Exception {
		
		CategoriesDal c1 = new CategoriesDal();
		
        if(categorie.getLibelle().trim().equals("")){
            throw new Exception("Nom de catégorie obligatoire");
        }
        c1.insert(categorie);
    }

	
	public static Categories get(int no_categorie) throws Exception {

		CategoriesDal c1 = new CategoriesDal();
		
        if(no_categorie <= 0){
            throw new Exception("Valeur incorrecte");
        }
        return c1.get(no_categorie);
    }
	
	
	public static void update(Categories categorie) throws Exception {
		
		CategoriesDal c1 = new CategoriesDal();

        if(categorie.getLibelle().trim().equals("")){
            throw new Exception("Nécessite un nom");
        }
        c1.update(categorie);
    }
	
	
	public static void delete(int no_categorie) throws Exception {
		
		CategoriesDal c1 = new CategoriesDal();

        if(no_categorie <= 0){
            throw new Exception("Valeur incorrecte");
        }
        c1.delete(no_categorie);
    }
	
	
	 public static List<Categories> selectAll() throws Exception {
		 
		 CategoriesDal c1 = new CategoriesDal();

	        return c1.selectALL();
	    }
	
}
