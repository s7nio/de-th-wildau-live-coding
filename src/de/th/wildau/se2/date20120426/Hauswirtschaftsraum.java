package de.th.wildau.se2.date20120426;

public class Hauswirtschaftsraum {

	public static void main(String[] args) {

		Hauswirtschaftsraum hsw = new Hauswirtschaftsraum();
		hsw.maschineHinzufuegen(new Waschmaschine());
		hsw.maschineHinzufuegen(new Trockner());
	}

	public void maschineHinzufuegen(iMaschine x) {
		try {
			x.hinzufuegen(new Socke("Socke", "farbe", 40));
			x.hinzufuegen(new Hose("Hose", "farbe"));
		} catch (KleidungsException e) {
			e.printStackTrace();
		}
	}
}
