package de.th.wildau.se2.date20120426;

/**
 * Allgemeine (abstracte) Beschreibung von Kleidung.
 * 
 * @author sne
 * @version x, 2012-04-26
 */
public abstract class Kleidung {

	private String name;
	private String farbe;
	private boolean trocken;

	public Kleidung(String name, String farbe, boolean trocken) {
		this.name = name;
		this.farbe = farbe;
		this.trocken = trocken;
	}

	/**
	 * Dieses Kleidungsstück ist erst einmal <code>trocken</code>.
	 * 
	 * @param marke
	 *            Herstellermarke des Kleidungsstückes
	 * @param farbe
	 *            Farbe des Kleidungsstückes
	 */
	public Kleidung(String marke, String farbe) {
		this(marke, farbe, true);
	}

	@Override
	public String toString() {

		return "Kleidung > Name:" + this.name + "; Farbe:" + this.farbe + "; trocken:"
				+ this.trocken;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFarbe() {
		return this.farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public boolean isTrocken() {
		return this.trocken;
	}

	public void setTrocken(boolean trocken) {
		this.trocken = trocken;
	}

}
