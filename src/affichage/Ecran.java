package affichage;

import java.util.Scanner;

import joueur.Pirates;

public class Ecran {
	private Scanner scanner = new Scanner(System.in);

	public void lancement() {
		System.out.println("LE JEU DE PIRATE DE LA MORT QUI TUE !!!");
	}

	public String demanderNomJoueur(int numero) {
		System.out.println("Entrez le nom du joueur " + numero + " :");
		return scanner.nextLine();
	}

	public void nomJoueur(String nomPirate, int joueur) {
		System.out.println("Le joueur " + joueur + " est " + nomPirate);
	}

	public void afficherVies(int vies) {
		System.out.println("Les 2 joueurs ont " + vies + " vies au départ du jeu.");
	}

	public void afficherStatut(Pirates joueur, Pirates adversaire) {
		System.out.println(joueur.getNom() + " - Vie: " + joueur.getHp() + " | Popularité: " + joueur.getPop());
		System.out.println(
				adversaire.getNom() + " - Vie: " + adversaire.getHp() + " | Popularité: " + adversaire.getPop());
	}

	public void afficherCartes(int cartes) {
		System.out.println("Chaque joueur dispose déjà de " + cartes + " cartes dans sa main.");
	}

	public void afficherPopu(int popu) {
		System.out.println("Les 2 joueurs ont " + popu + " de popularité au départ du jeu.");
	}

	public void afficherMain(Pirates joueur) {
		System.out.println("Main de " + joueur.getNom() + " :");
		for (int i = 0; i < joueur.getMain().length; i++) {
			if (joueur.getMain()[i] != null) {
				System.out.println((i + 1) + " - " + joueur.getMain()[i].getNomCarte());
			}
		}
	}

	public void tourJoueur(Pirates joueur) {
		System.out.println("C'est au tour de " + joueur.getNom() + " de jouer.");
	}

	public int choisirCarte() {
		System.out.println("Quelle carte voulez-vous jouer ? (Entrez le numéro de la carte)");
		return scanner.nextInt() - 1;
	}

	public void afficherVainqueur(Pirates gagnant) {
		System.out.println(gagnant.getNom() + " a gagné par sa popularité !");
	}

	public boolean exit() {
		System.out.println("Voulez-vous recommencer une partie (1) ou quitter (2) ?");
		int choix = scanner.nextInt();
		return choix == 1;
	}
}