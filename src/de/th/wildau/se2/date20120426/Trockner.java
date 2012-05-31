package de.th.wildau.se2.date20120426;

public class Trockner implements iMaschine {

	private Kleidung[] inhalt = new Kleidung[10];

	public void trocknen() {
		for (int i = 0; i < this.inhalt.length; i++) {
			if (this.inhalt[i] == null) {
				inhalt[i].setTrocken(true);
			}
		}
	}

	@Override
	public void hinzufuegen(Kleidung kleidung) {

		System.out.println("Kleidung in Trockner hinzugefügt: " + kleidung.getName());
		for (int i = 0; i < this.inhalt.length; i++) {
			if (this.inhalt[i] == null) {
				inhalt[i] = kleidung;
				return;
			}
		}
		throw new IllegalStateException("Trockner ist schon voll.");
	}

	@Override
	public void herausnehmen() {

		for (int i = 0; i < this.inhalt.length; i++) {
			inhalt[i] = null;
		}
	}

}
