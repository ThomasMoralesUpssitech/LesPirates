package carte;

import joueur.Pirates;

public class CarteVol extends Cartes {

	public CarteVol() {
		super("Vol");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		joueur.volerCarte(adversaire);
		System.out.println(joueur.getNom() + " vole une carte à " + adversaire.getNom());
	}
}
