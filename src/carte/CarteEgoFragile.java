package carte;

import joueur.Pirates;

public class CarteEgoFragile extends Cartes {

	public CarteEgoFragile() {
		super("Ego Fragile");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		if (joueur.getPop() <= 2) {
			joueur.perdreVie(-1);
		} else {
			joueur.perdreVie(1);
		}
	}
}
