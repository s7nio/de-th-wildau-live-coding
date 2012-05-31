package de.th.wildau.se2.date20120426;

public class Waschmaschine implements iMaschine {

	private Kleidung[] inhalt = new Kleidung[10];

	@Override
	public void hinzufuegen(Kleidung kleidung) {

		System.out.println("Kleidung in Waschmaschine hinzugefügt: " + kleidung.getName());
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

	@Override
	public void herausnehmen() {

		for (int i = 0; i < this.inhalt.length; i++) {
			inhalt[i] = null;
		}
	}
}
