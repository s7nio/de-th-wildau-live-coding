package de.th.wildau.se2.date20120426;

/**
 * @author sne
 * @version x, 2012-05-10
 */
public class TestException {

	public static void main(String[] args) {

		try {
			double zufall = Math.random();

			if (zufall < 0.5) {
				throw new KleidungsException("random");
			} else if (zufall > 0.4 && zufall < 0.6) {
				throw new Exception("not random");
			} else if (zufall > 1) {
				throw new IllegalStateException("das sollte nicht vorkommen!");
			}

			throw new KleidungsException("DEIN FEHLER!!!");

		} catch (KleidungsException ex) { // fängt alle KleidungsExceptions
			ex.printStackTrace();// liefert den stack trace auf der Standardausgabe
		} catch (IllegalStateException ex) { // fängt die IllegalStateException
			System.err.println("Ohh: " + ex.getMessage());
		} catch (Exception ex) { // fängt alle (anderen) Exception's
			System.err.println(ex.getMessage());
		}
	}
}
