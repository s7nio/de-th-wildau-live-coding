package de.th.wildau.se2.date20120419;

/**
 * @author sne
 * @version x, 2012-04-19
 */
public class Artikel {

	private String artikelNr;
	private String bezeichnung;
	private double einkaufspreis;
	private int lagerzeit;

	final double HANDELSSPANNE = 0.6; // 60 Prozent des Einkaufspreises
	final double MWST = 0.19; // 19 Prozent

	public Artikel(String artikelNr, String bezeichnung, double einkaufspreis, int lagerzeit) {

		this.artikelNr = artikelNr;
		this.bezeichnung = bezeichnung;
		this.einkaufspreis = einkaufspreis;
		this.lagerzeit = lagerzeit;
	}

	public void anzeigen() {
		System.out.println(toString());
	}

	@Override
	public String toString() {

		String tmp = new String(this.artikelNr);
		tmp += " \"";
		tmp += this.bezeichnung;
		tmp += "\" EK: ";
		tmp += this.einkaufspreis;
		tmp += " VK: ";
		tmp += this.berechneVerkaufspreis();
		tmp += " Euro Lagerzeit: ";
		tmp += this.lagerzeit;
		tmp += " Monate";
		return tmp;
	}

	public int berechneVerkaufspreis() {

		int verkaufspreis = (int) Math
				.round((this.einkaufspreis * (this.HANDELSSPANNE + 1) * (this.MWST + 1)));
		return verkaufspreis;
	}

	public String getArtikelNr() {
		return this.artikelNr;
	}

	public String getBezeichnung() {
		return this.bezeichnung;
	}

	public double getEinkaufspreis() {
		return this.einkaufspreis;
	}

	public int getLagerzeit() {
		return this.lagerzeit;
	}
}
