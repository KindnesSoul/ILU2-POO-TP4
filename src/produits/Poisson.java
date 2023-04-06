package produits;

public class Poisson extends Produit {
	private String date;
	
	public Poisson (String date){
		super("Poisson",Unite.K);
		this.date=date;
	}

	public String getDate() {
		return date;
	}
}
