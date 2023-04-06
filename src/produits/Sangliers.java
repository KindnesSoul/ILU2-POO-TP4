package produits;

import personnages.Gaulois;

public class Sangliers extends Produit {
	private int poids;
	private Gaulois chasseur;
	public Sangliers(int poids,Gaulois chasseur){
		super("sanglier", Unite.K);
		this.poids=poids;
		this.chasseur=chasseur;
	}

}
