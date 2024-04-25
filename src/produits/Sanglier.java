package produits;

import personnages.Gaulois;
import villagegaulois.Etal;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	private Etal etal; 

	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", "kilo");
		this.poids = poids;
		this.chasseur = chasseur;
	}

	public String getDescription() {
		return getNom() + " de " + poids + " " + unite + " chassé par " + chasseur.getNom() + ".";
	}

	public double calculerPrix(double prix) {
		return prix*poids/1000;
	}

}