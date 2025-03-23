package carte;

import joueur.Pirates;

public class CartePop extends Cartes {
	private int pointsPop = 1;

	public CartePop() {
		super("Popularité augmentée");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		joueur.gagnerPop(pointsPop);
		System.out.println(joueur.getNom() + " gagne " + pointsPop + " point de popularité !");
	}
}
