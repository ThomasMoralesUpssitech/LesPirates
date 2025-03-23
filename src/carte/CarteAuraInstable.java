package carte;

import joueur.Pirates;

public class CarteAuraInstable extends Cartes {

	public CarteAuraInstable() {
		super("Aura Instable");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		if (joueur.getHp() >= 3) {
			joueur.gagnerPop(1);
		} else {
			joueur.gagnerPop(-1);
		}
	}
}
