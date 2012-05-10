package de.th.wildau.se2.date20120419;

/**
 * @author sne
 * @version x, 2012-04-19
 */
public class Sonderposten extends Artikel {

	private double rabatt;

	public Sonderposten(String artikelNr, String bezeichnung,
			double einkaufspreis, int lagerzeit) {

		super(artikelNr, bezeichnung, einkaufspreis, lagerzeit);
		if (lagerzeit <= 12) {
			this.rabatt = 0.9;
		} else {
			this.rabatt = 0.7;
		}
	}

	@Override
	public void anzeigen() {
		System.out.println(toString());
	}

	@Override
	public String toString() {

		// Sonderposten:
		// SC120-C "BALLANTINES" EK: 8.0 VK: 12 Euro Lagerzeit: 2 Monate
		// (VK <alt>: 14 Euro; Rabatt: 10%)
		String tmp = new String("Sonderposten:\n" + super.getArtikelNr());
		tmp += " \"";
		tmp += super.getBezeichnung();
		tmp += "\" EK: ";
		tmp += super.getEinkaufspreis();
		tmp += " VK: ";
		tmp += this.berechneVerkaufspreis();
		tmp += " Euro Lagerzeit: ";
		tmp += super.getLagerzeit();
		tmp += " Monate";
		tmp += "\n";
		tmp += "(VK <alt>: ";
		tmp += super.berechneVerkaufspreis();
		tmp += " Euro; Rabatt: ";
		tmp += Math.abs(Math.round((this.rabatt - 1) * 100));
		tmp += "%)";
		return tmp;
	}

	@Override
	public int berechneVerkaufspreis() {

		int verkaufspreis = (int) ((super.getEinkaufspreis() * (this.HANDELSSPANNE + 1))
				* this.rabatt * (this.MWST + 1));
		return verkaufspreis;
	}

	public void foo() {
		// do nothing
	}
}
