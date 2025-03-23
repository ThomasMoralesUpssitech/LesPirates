package carte;

import joueur.Pirates;

public class CarteAtt extends Cartes {
	private int degats = 1;

	public CarteAtt() {
		super("Attaque au sabre");
	}

	@Override
	public void appliquerEffet(Pirates joueur, Pirates adversaire) {
		adversaire.perdreVie(degats);
		System.out.println(
				joueur.getNom() + " attaque " + adversaire.getNom() + " et lui inflige " + degats + " vie de dégâts !");
	}
}
