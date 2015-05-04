package es.jc.test;

import org.junit.Test;

import es.jc.thread.Executor;

public class ExecutorTest {

	@Test
	public void test() {
		
		Executor executor = new Executor();
		
		testExecutor(executor);
		
	}
	
	public static void testExecutor(Executor executor) {
		
		String actionAlpha = executor.executeAction("ALPHA");
		String actionBravo = executor.executeAction("BRAVO");

		System.out.println(executor.getExecuteActionResult(actionBravo));
//		System.out.println(executor.getExecuteActionResult(actionAlpha));
		
	}

}
