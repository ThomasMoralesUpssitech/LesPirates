package carte;

import joueur.Pirates;

public abstract class Cartes {
	protected String nomCarte;

	public Cartes(String nomCarte) {
		this.nomCarte = nomCarte;
	}

	public String getNomCarte() {
		return nomCarte;
	}

	public abstract void appliquerEffet(Pirates joueur, Pirates adversaire);
}
