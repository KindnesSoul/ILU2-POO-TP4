package villagegaulois;

import personnages.Gaulois;

public interface IEtal {


	Gaulois getVendeur();
	
	double donnerPrix();

	int contientProduit(String produit,int quantiteSouhaitee);

	double acheterProduit(int quantiteSouhaitee);

	

	/**
	 * 
	 * @param produit
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'�tal est occup� [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantit� de produit � vendre au d�but du march� [4] :
	 *         quantit� de produit vendu
	 */
	String etatEtal();
	

}