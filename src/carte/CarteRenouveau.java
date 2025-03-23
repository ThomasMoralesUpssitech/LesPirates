package carte;

import joueur.Pirates;

public class CarteRenouveau extends Cartes {

	public CarteRenouveau() {
		super("Renouveau");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		joueur.piocherCartes(5);
		System.out.println(joueur.getNom() + " renouvelle sa main !");
	}
}
