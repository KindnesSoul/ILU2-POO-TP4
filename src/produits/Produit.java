package produits;

public abstract class Produit implements IProduit {
	protected String nom;
	protected String unite;
	
	protected Produit(String nom, String unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
}