package es.jc.concurrent;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public abstract class Runner implements Callable<String> {
	
	String name;
	
	public Runner(String name) {
		this.name = name;
	}
	
	public static class Turtle extends Runner {
		
		public Turtle(String name) {
			super(name);
		}

		@Override
		public String call() throws Exception {
			Instant init = Instant.now();
			Thread.sleep(10000);
			return toString() + " made it in " + Duration.between(init, Instant.now()).toMillis() + " ms";
		}

		@Override
		public String toString() {
			return "Turtle " + name;
		}
		
	}
	
	public static class Fox extends Runner {
		
		public Fox(String name) {
			super(name);
		}

		@Override
		public String call() throws Exception {
			Instant init = Instant.now();
			Thread.sleep(2000);
			return toString() + " made it in " + Duration.between(init, Instant.now()).toMillis() + " ms";
		}
		
		@Override
		public String toString() {
			return "Fox " + name;
		}
		
	}
	
}
