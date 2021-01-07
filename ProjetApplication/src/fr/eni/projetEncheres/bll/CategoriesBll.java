package fr.eni.projetEncheres.bll;

import java.util.List;

import fr.eni.projetEncheres.bo.Categories;
import fr.eni.projetEncheres.dal.CategoriesDal;

public class CategoriesBll {
	
	
	public static void insert(Categories categorie) throws Exception {
        	
        if(categorie.getLibelle().trim().equals("")){
            throw new Exception("Nom de catégorie obligatoire");
        }
        CategoriesDal.insert(categorie);
    }

	
	public static Categories get(int no_categorie) throws Exception {

        if(no_categorie <= 0){
            throw new Exception("Valeur incorrecte");
        }
        return CategoriesDal.get(no_categorie);
    }
	
	
	public static void update(Categories categorie) throws Exception {

        if(categorie.getLibelle().trim().equals("")){
            throw new Exception("Nécessite un nom");
        }
        CategoriesDal.update(categorie);
    }
	
	
	public static void delete(int no_categorie) throws Exception {

        if(no_categorie <= 0){
            throw new Exception("Valeur incorrecte");
        }
        CategoriesDal.delete(no_categorie);
    }
	
	
	 public static List<Categories> selectAll() throws Exception {

	        return CategoriesDal.selectALL();
	    }
	
}
