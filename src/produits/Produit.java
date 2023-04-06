package produits;

public class Produit {
	protected String nom;
	private Unite unite;
	
	public Produit( String nom , Unite unite) {
		this.nom=nom;
		this.unite=unite;	
	}
	public String getNom() {
		return nom;
	}
	public String descriptionProduit(Produit prod) {
		if (prod.getNom()=="Poisson") {
			return("poisson p�ch�s le"+Poisson.date);
		}
		if (prod.getNom()=="sanglier") {
			return ("sanglier de"+sanglier.poid+unite+"chasser par"sanglier.chasseur);
		}
	}

}
