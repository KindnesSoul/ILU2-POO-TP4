package produits;

public class Produit {
	private String nom;
	private Unite unite;
	
	public Produit(String nom , Unite unite) {
		this.nom=nom;
		this.unite=unite;	
	}
	public String getNom() {
		return nom;
	}
	public String descriptionProduit(Produit prod) {
		if (prod.getNom()=="Poisson") {
			return("poisson pêchés"+);
		}
		 
	}

}
