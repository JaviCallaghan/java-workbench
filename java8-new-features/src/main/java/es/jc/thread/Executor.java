package es.jc.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Executor {

	/** Constant for define the number of threads. */
	private static final int NTHREADS = 20;
	/** Hold the current (last) action id. */
	private static Integer currentActionId;
	/** Threads (workers) executor. */
	private static ExecutorService executorPool;
	/** Map of actions results. */
	private static Map<String, Future<String>> actionsResults;

	public Executor() {
		currentActionId = 0;
		executorPool = Executors.newFixedThreadPool(NTHREADS);
		actionsResults = new HashMap<String, Future<String>>();
	}

	public final String executeAction(final String code) {
		Callable<String> worker = new Execution(code);
		Future<String> submit = executorPool.submit(worker);
		final String actionId = (currentActionId++).toString();
		actionsResults.put(actionId, submit);
		System.out.println("ExecutorPool after submit: " + executorPool);
		return actionId;
	}

	public final String getExecuteActionResult(final String actionId) {
		Future<String> future = actionsResults.get(actionId);
		if (future != null) {
			try {
				final String result = future.get();
				System.out.println("ExecutorPool after get: " + executorPool);
				return result;
			} catch (InterruptedException | ExecutionException ex) {
				throw new RuntimeException("Error getting action submit", ex);
			}
		} else {
			throw new RuntimeException("No future found for action " + actionId);
		}
	}

	public void shutdownAndAwaitTermination() {

		System.out.println("ExecutorPool before shutdown: " + executorPool);
		executorPool.shutdown(); // Disable new tasks from being submitted
		System.out.println("ExecutorPool after shutdown: " + executorPool);
		try {
			// Wait a while for existing tasks to terminate
			if (!executorPool.awaitTermination(60, TimeUnit.SECONDS)) {
				System.out.println("ExecutorPool before shutdown now: " + executorPool);
				executorPool.shutdownNow(); // Cancel currently executing tasks
				System.out.println("ExecutorPool after shutdown now: " + executorPool);
				// Wait a while for tasks to respond to being cancelled
				if (!executorPool.awaitTermination(60, TimeUnit.SECONDS))
					System.err.println("Pool did not terminate");
			}
		} catch (InterruptedException ie) {
			// (Re-)Cancel if current thread also interrupted
			System.out.println(ie.getMessage());
			System.out.println("ExecutorPool before shutdown now: " + executorPool);
			executorPool.shutdownNow();
			System.out.println("ExecutorPool after shutdown now: " + executorPool);
			// Preserve interrupt status
			Thread.currentThread().interrupt();
		}
		System.out.println("ExecutorPool after termination: " + executorPool);

	}

}
