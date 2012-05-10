package de.th.wildau.se2.date20120419;

/**
 * @author sne
 * @version x, 2012-04-19
 */
public class ArtikelTester {

	public static void main(String[] args) {

		// SC120-C "BALLANTINES" EK: 8.0 VK: 14 Euro Lagerzeit: 2 Monate
		Artikel artikel1 = new Artikel("SC120-C", "BALLANTINES", 8.0, 2);
		System.out.println(artikel1.toString());
		artikel1.anzeigen();

		// Sonderposten: SC120-C "BALLANTINES" EK: 8.0 VK: 12 Euro Lagerzeit: 2
		// Monate (VK <alt>: 14 Euro; Rabatt: 10%)
		Sonderposten sonderposten1 = new Sonderposten("SC120-C", "BALLANTINES", 8.0, 2);
		sonderposten1.anzeigen();

		Artikel sonderposten2 = new Sonderposten("SC120-C", "BALLANTINES", 8.0, 2);
		if (sonderposten2 instanceof Sonderposten) {
			((Sonderposten) sonderposten2).anzeigen();
		}
	}

}
