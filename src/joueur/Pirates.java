package joueur;

import carte.Cartes;
import carte.Pioche;

public class Pirates {
	private String nom;
	private int pop;
	private int hp;
	private Cartes[] main = new Cartes[5];
	private Pioche pioche;

	public Pirates(String nom, Pioche pioche) {
		this.nom = nom;
		this.pioche = pioche;
		this.pop = 0;
		this.hp = 5;
		piocherCartes(5);
	}

	public String getNom() {
		return nom;
	}

	public int getPop() {
		return pop;
	}

	public int getHp() {
		return hp;
	}

	public Cartes[] getMain() {
		return main;
	}

	public void piocherCartes(int nombre) {
		for (int i = 0; i < nombre; i++) {
			main[i] = pioche.piocher();
		}
	}

	public void jouerCarte(int index, Pirates adversaire) {
		if (index >= 0 && index < main.length) {
			Cartes carte = main[index];
			carte.appliquerEffet(this, adversaire);
			pioche.piocher();
			main[index] = pioche.piocher();
		}
	}

	/*
	 * public void volerCarte(Pirates adversaire) { for (int i = 0; i <
	 * adversaire.getMain().length; i++) { if (adversaire.getMain()[i] != null) {
	 * Cartes carteVolee = adversaire.getMain()[i]; adversaire.getMain()[i] =
	 * pioche.piocher(); System.out.println(this.nom + " vole une carte à " +
	 * adversaire.getNom()); return; } } }
	 */

	public void gagnerPop(int pointsPop) {
		pop += pointsPop;
	}

	public void perdreVie(int degats) {
		hp -= degats;
	}

	public boolean estMort() {
		return hp <= 0;
	}
}
