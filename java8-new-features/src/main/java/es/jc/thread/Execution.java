package es.jc.thread;

import java.time.Instant;
import java.util.concurrent.Callable;

public class Execution implements Callable<String> {

	private String code;
	
	public Execution(String code) {
		this.code = code;
	}
	
	@Override
	public String call() throws Exception {
		return "Execution " + code + " - " + Instant.now().toString();
	}

}
