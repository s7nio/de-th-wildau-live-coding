package de.th.wildau.se2.date20120524;

public class Webserver {

	public static void main(String[] args) {

		Log log = new Log();

		while (true) {
			// incoming request
			new HttpHandler(log).start();
		}
	}
}
