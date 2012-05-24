package de.th.wildau.se2.date20120524;

public class HttpHandler extends Thread {

	private Log log;

	public HttpHandler(Log log) {
		this.log = log;
	}

	@Override
	public void run() {

		this.log.info("my text");
	};
}
