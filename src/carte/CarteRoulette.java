package carte;

import java.util.Random;

import joueur.Pirates;

public class CarteRoulette extends Cartes {

	public CarteRoulette() {
		super("Roulette");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		if (new Random().nextBoolean()) {
			joueur.gagnerPop(2);
		} else {
			joueur.perdreVie(1);
		}
	}
}
