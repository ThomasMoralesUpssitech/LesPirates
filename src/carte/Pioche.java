package carte;

import java.util.Random;

public class Pioche {
	private Cartes[] cartes;
	private int indexPioche;

	public Pioche(Cartes[] cartes) {
		this.cartes = cartes;
		this.indexPioche = 0;
		melanger();
	}

	public void melanger() {
		Random rand = new Random();
		for (int i = cartes.length - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			Cartes temp = cartes[i];
			cartes[i] = cartes[j];
			cartes[j] = temp;
		}
	}

	public Cartes piocher() {
		if (indexPioche >= cartes.length) {
			melanger();
			indexPioche = 0;
		}
		return cartes[indexPioche++];
	}
}
