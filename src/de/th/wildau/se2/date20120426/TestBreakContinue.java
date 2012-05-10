package de.th.wildau.se2.date20120426;

/**
 * @author sne
 * @version x, 2012-05-10
 */
public class TestBreakContinue {

	/**
	 * <b>Ausgabe:</b><br />
	 * > break;<br />
	 * Aktueller Wert von i: 0<br />
	 * Aktueller Wert von i: 1<br />
	 * Aktueller Wert von i: 2<br />
	 * Aktueller Wert von i: 3<br />
	 * Aktueller Wert von i: 4<br />
	 * ===<br />>
	 * continue;<br />
	 * Aktueller Wert von i: 5<br />
	 * Aktueller Wert von i: 6<br />
	 * Aktueller Wert von i: 7<br />
	 * Nur diese i Ausgabe: 8<br />
	 * Nur diese i Ausgabe: 9<br />
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("> break;");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("Aktueller Wert von i: " + i);
		}

		System.out.println("===");

		System.out.println("> continue;");
		int i = 5;
		while (i < 10) {
			if (i > 7) {
				System.out.println("Nur diese i Ausgabe: " + i);
				i++;
				continue;
			}

			System.out.println("Aktueller Wert von i: " + i);
			i++;
		}
	}
}
