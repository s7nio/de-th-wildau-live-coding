package de.th.wildau.se2.date20120426;

/**
 * @author sne
 * @version x, 2012-04-26
 */
public class TestKleidung {

	public static void main(String[] args) throws KleidungsException {

		Socke sockeBoss = new Socke("Boss", "schwarz", 44);

		// System.out.println(sockeBoss.toString());
		System.out.println(sockeBoss); // hier wird die standardmäßig toString() aufgerufen

		sockeBoss.setGroesse(43);
		try {
			sockeBoss.groessePruefen(55);
		} catch (KleidungsException ex) {
			System.err.println("Ohh ein Fehler: " + ex.getMessage());
		}
		// sockeBoss.setGroesse(55); // exception muss behandelt werden oder siehe main() throws ...

		/*
		 * Anderes paar Socken
		 */

		Kleidung sockeAddidas = new Socke("Addidas", "pink", 45);

		// sockeAddidas.setGroesse(40); // geht nicht
		((Socke) sockeAddidas).setGroesse(40); // expliziter cast / down-cast
		if (sockeAddidas instanceof Socke) {
			((Socke) sockeAddidas).groessePruefen(40);
		}

		// cast's - kurz & übersichtlich
		int x = 5;
		double y = 2.4;
		y = x; // impliziter cast / up-cast
		x = (int) y; // expliziter cast / down-cast

		Hose hose = new Hose("Levis", "blau");

		System.out.println(hose.getFarbe().name());

		Waschmaschine waschmaschine = new Waschmaschine();
		waschmaschine.hinzufuegen(sockeAddidas);
		waschmaschine.hinzufuegen(sockeBoss);
		waschmaschine.hinzufuegen(hose);
		// waschmaschine.waschen();
		// waschmaschine.herausnehmen();
	}

}
