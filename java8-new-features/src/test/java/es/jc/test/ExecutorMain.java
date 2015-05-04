package es.jc.test;

import es.jc.thread.Executor;

public class ExecutorMain {

	private static Executor executor = new Executor();

	public static void main(String[] args) {

		ExecutorTest.testExecutor(executor);

//		executor.shutdownAndAwaitTermination();

	}

}
