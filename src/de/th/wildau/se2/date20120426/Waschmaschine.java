package de.th.wildau.se2.date20120426;

public class Waschmaschine {

	private Kleidung[] inhalt = new Kleidung[10];

	public void hinzufuegen(Kleidung kleidung) {

		for (int i = 0; i < this.inhalt.length; i++) {
			if (this.inhalt[i] == null) {
				inhalt[i] = kleidung;
				// break; // ist in diesem Fall ungünstig, da die Exception immer...
				return;
			}
		}
		throw new IllegalStateException("Waschmaschine ist schon voll.");
	}

	public void waschen() {

		for (int i = 0; i < this.inhalt.length; i++) {
			if (this.inhalt[i] != null) {
				this.inhalt[i].setTrocken(false);
			}
		}
	}

	public void herausnehmen() {

		for (int i = 0; i < this.inhalt.length; i++) {
			inhalt[i] = null;
		}
	}
}
