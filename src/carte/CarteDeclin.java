package carte;

import joueur.Pirates;

public class CarteDeclin extends Cartes {

	public CarteDeclin() {
		super("Déclin");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		adversaire.piocherCartes(5);
		System.out.println(adversaire.getNom() + " subit un déclin !");
	}
}
