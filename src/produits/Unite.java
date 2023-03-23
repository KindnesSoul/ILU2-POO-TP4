package produits;

public enum Unite {
	 L("litre"), G("gramme"), K("kilogramme"), CL("centilitre");
	private String nom;
	private Unite(String nom) {
		this.nom=nom;
	}
	public String toString(){
		return nom;
	}

	}
