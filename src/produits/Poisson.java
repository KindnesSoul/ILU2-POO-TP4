package produits;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String datePeche) {
		super("poisson", "gramme");
		this.datePeche=datePeche;

	}

	public String getDescription() {
		return  getNom() + " p�ch� " + datePeche + ".";
	}

	public double calculerPrix(double prix) {	
		return prix;
	}

}