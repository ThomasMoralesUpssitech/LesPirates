package affichage;

import carte.CarteAtt;
import carte.CarteAuraInstable;
import carte.CarteDeclin;
import carte.CarteEgoFragile;
import carte.CartePop;
import carte.CarteRenouveau;
import carte.CarteRoulette;
import carte.Cartes;
import carte.Pioche;
import joueur.Pirates;

public class TestJeu {
	public static void main(String[] args) {
		Cartes[] cartes = new Cartes[40];
		for (int i = 0; i < 4; i++) {
			cartes[i] = new CarteRenouveau();
			cartes[i + 4] = new CarteAtt();
			cartes[i + 8] = new CarteDeclin();
			cartes[i + 12] = new CartePop();
			cartes[i + 16] = new CarteRoulette();
			cartes[i + 20] = new CarteEgoFragile();
			cartes[i + 24] = new CarteRoulette();
			cartes[i + 28] = new CarteAtt();
			cartes[i + 32] = new CarteAuraInstable();
			cartes[i + 36] = new CartePop();
		}
		Pioche piocheCartes = new Pioche(cartes);
		piocheCartes.melanger();

		Ecran ecran = new Ecran();
		ecran.lancement();

		String nomJoueur1 = ecran.demanderNomJoueur(1);
		String nomJoueur2 = ecran.demanderNomJoueur(2);

		Pirates j1 = new Pirates(nomJoueur1, piocheCartes);
		Pirates j2 = new Pirates(nomJoueur2, piocheCartes);

		ecran.nomJoueur(j1.getNom(), 1);
		ecran.nomJoueur(j2.getNom(), 2);
		ecran.afficherVies(5);
		ecran.afficherCartes(5);
		ecran.afficherPopu(0);

		while (!j1.estMort() && !j2.estMort() && j1.getPop() < 5 && j2.getPop() < 5) {
			ecran.tourJoueur(j1);
			ecran.afficherStatut(j1, j2);
			ecran.afficherMain(j1);
			int choixJ1 = ecran.choisirCarte();
			j1.jouerCarte(choixJ1, j2);
			piocheCartes.melanger();

			if (j2.estMort() || j1.getPop() >= 5)
				break;

			ecran.tourJoueur(j2);
			ecran.afficherStatut(j2, j1);
			ecran.afficherMain(j2);
			int choixJ2 = ecran.choisirCarte();
			j2.jouerCarte(choixJ2, j1);
			piocheCartes.melanger();
		}

		if (j1.getPop() >= 5 || j2.estMort()) {
			ecran.afficherVainqueur(j1);
		} else {
			ecran.afficherVainqueur(j2);
		}

		ecran.exit();
	}
}