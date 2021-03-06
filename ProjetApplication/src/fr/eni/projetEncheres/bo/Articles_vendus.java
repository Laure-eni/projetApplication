package fr.eni.projetEncheres.bo;

import java.time.LocalDate;
import java.sql.Date;


public class Articles_vendus {

	private int no_article;                 
    private String nom_article;                   
    private String description;                  
	private Date date_debut_encheres;          
    private Date date_fin_encheres;             
    private int  prix_initial;                
    private int prix_vente;                   
    private int no_vendeur;               
    private int no_categorie;  
	

    //Constructeur
    public Articles_vendus( String nom_article, String description, Date date_debut_encheres,
    		Date date_fin_encheres, int prix_initial, int prix_vente, int no_vendeur, int no_categorie
			) 
    {
		super();
		
		this.nom_article = nom_article;
		this.description = description;
		this.date_debut_encheres = date_debut_encheres;
		this.date_fin_encheres = date_fin_encheres;
		this.prix_initial = prix_initial;
		this.prix_vente = prix_vente;
		this.no_vendeur = no_vendeur;
		this.no_categorie = no_categorie;
	}
    public Articles_vendus() {
		super();
	}
    
    
	public String getNom_article() {
		return nom_article;
	}
	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate_debut_encheres() {
		return date_debut_encheres;
	}
	public void setDate_debut_encheres(Date date_debut_encheres) {
		this.date_debut_encheres = date_debut_encheres;
	}
	public Date getDate_fin_encheres() {
		return date_fin_encheres;
	}
	public void setDate_fin_encheres(Date date_fin_encheres) {
		this.date_fin_encheres = date_fin_encheres;
	}
	public int getPrix_initial() {
		return prix_initial;
	}
	public void setPrix_initial(int prix_initial) {
		this.prix_initial = prix_initial;
	}
	public int getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(int prix_vente) {
		this.prix_vente = prix_vente;
	}
	public int getNo_utilisateur() {
		return no_vendeur;
	}
	public void setNo_utilisateur(int no_utilisateur) {
		this.no_vendeur = no_utilisateur;
	}
	public int getNo_categorie() {
		return no_categorie;
	}
	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}


	//methode toString
	@Override
	public String toString() {
		return "Articles_vendus [no_article=" + no_article + ", nom_article=" + nom_article + ", description="
				+ description + ", date_debut_encheres=" + date_debut_encheres + ", date_fin_encheres="
				+ date_fin_encheres + ", prix_initial=" + prix_initial + ", prix_vente=" + prix_vente
				+ ", no_utilisateur=" + no_vendeur + ", no_categorie=" + no_categorie 
				+ "]";
	}
    
}
