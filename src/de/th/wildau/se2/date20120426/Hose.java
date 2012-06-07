package de.th.wildau.se2.date20120426;

public class Hose extends Kleidung {

	public Hose(String marke, String farbe) {
		super(marke, Farbe.valueOf(farbe.toUpperCase()));
	}

	public Hose(String marke, Farbe farbe) {
		super(marke, farbe);
	}
}
