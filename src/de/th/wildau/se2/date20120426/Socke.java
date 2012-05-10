package de.th.wildau.se2.date20120426;

/**
 * <code>Socke</code> erbt von {@link Kleidung}.
 * 
 * @author sne
 * @version x, 2012-04-26
 */
public class Socke extends Kleidung {

	private double groesse = 36;

	/**
	 * Socken - Konstruktor
	 * 
	 * @param marke
	 * @param farbe
	 * @param groesse
	 * @throws KleidungsException
	 *             diese Exception wird an den Aufrufer weiter geworfen
	 */
	public Socke(String marke, String farbe, int groesse) throws KleidungsException {

		super(marke, farbe);
		setGroesse(groesse);
	}

	/**
	 * Methode zur Kontrolle der Sockengröße.
	 * 
	 * @param groesse
	 *            dieser Wert wird überpfrüft
	 * @throws KleidungsException
	 *             Socken können nur die Größe 36 - 46 haben
	 */
	public void groessePruefen(double groesse) throws KleidungsException {

		if (groesse < 36 || groesse > 46) {
			throw new KleidungsException(
					"Die Sockengröße muss zwischen 36 und 46 sein. Falsche Größe: " + groesse);
		}
	}

	@Override
	public String toString() {

		return super.toString() + "; Größe:" + this.groesse + " [Socke]";
	}

	public double getGroesse() {
		return this.groesse;
	}

	public void setGroesse(double groesse) throws KleidungsException {
		groessePruefen(groesse);
		this.groesse = groesse;
	}
}
