package es.jc.concurrent;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BasicExecutorsImpl {

	private ExecutorService es;

	/**
	 * Esta ejecución se lanzará sobre un pool con un único hilo, por lo que los procesos (corredores) se ejecutarán
	 * (correrán) sobre el mismo hilo, por orden de suscripción, de manera que hasta que no termine el primero, no
	 * empezará el segundo.
	 * 
	 * @param runners
	 */
	public void startFriendlyRaceSingleThreadPool(List<Runner> runners) {
		es = Executors.newSingleThreadExecutor();
		System.out.println("CONTRARRELOJ");
		try {
			run(runners, false);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public void startFriendlyDelayedRaceSingleThreadPool(List<Runner> runners) {
		es = Executors.newSingleThreadScheduledExecutor();
		System.out.println("CONTRARRELOJ CON VENTAJA");
		try {
			run(runners, false);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Esta ejecución se lanzará sobre un pool con múltiples hilos, por lo que los procesos (corredores) se ejecutarán
	 * (correrán) sobre diferentes hilos, saliendo prácticamente a la vez (por orden de suscripción), de manera que
	 * correrán a la vez.
	 * 
	 * @param runners
	 */
	public void startFriendlyRaceCachedThreadPool(List<Runner> runners) {
		es = Executors.newCachedThreadPool();
		System.out.println("CARRERA AMISTOSA");
		try {
			run(runners, false);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		es.shutdown();
	}
	
	public void startFriendlyDelayedRaceCachedThreadPool(List<Runner> runners) {
		es = Executors.newScheduledThreadPool(runners.size());
		System.out.println("CARRERA AMISTOSA CON VENTAJA");
		try {
			run(runners, false);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		es.shutdown();
	}


	public void startCompetitionRaceSingleThreadPool(List<Runner> runners) {
		es = Executors.newSingleThreadExecutor();
		System.out.println("CONTRARRELOJ ABSURDA");
		try {
			run(runners, true);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		es.shutdown();
	}

	public void startCompetitionRaceCachedThreadPool(List<Runner> runners) {
		es = Executors.newCachedThreadPool();
		System.out.println("CARRERA COMPETITIVA");
		try {
			run(runners, true);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		es.shutdown();
	}

	private void run(List<Runner> runners, boolean singleWinner) throws InterruptedException {

		Set<Future<String>> futures = new HashSet<>();
		LocalDateTime subscriptionTime = LocalDateTime.now();
		System.out.println("Subscribing runners at " + subscriptionTime.toString());
		LocalDateTime runTime = LocalDateTime.now();
		System.out.println("Starting race at " + runTime.toString());
		for (Runner r : runners) {
			if (es instanceof ScheduledExecutorService) {
				futures.add(((ScheduledExecutorService)es).schedule(r, 2000, TimeUnit.MILLISECONDS));
			} else {
				futures.add(es.submit(r));
			}
			System.out.println("Runner " + r + " starts at " + LocalDateTime.now());
		}

		boolean allDone = false;
		while (!allDone) {
			Thread.sleep(1000);
			Iterator<Future<String>> itFutures = futures.iterator();
			while (itFutures.hasNext()) {
				Future<String> future = itFutures.next();
				System.out.println("Waiting for runner... ");
				if (future.isDone()) {
					try {
						System.out.println("Runner finished at " + LocalDateTime.now() + ": " + future.get());
						if (singleWinner) {
							System.out.println("Other runners are disqualified: "
									+ Arrays.toString(es.shutdownNow().toArray()));
							allDone = true;
						} else {
							itFutures.remove();
						}
						System.out.println(futures.size() + " runners left");
						if (futures.size() == 0) {
							allDone = true;
						}
					} catch (ExecutionException ex) {
						ex.printStackTrace();
					}
				}// else, check next one
			}
		}
		LocalDateTime endTime = LocalDateTime.now();
		System.out.println("Ending race at " + endTime.toString());
		System.out.println(Duration.between(runTime, endTime).toMillis() + " ms since start");
	}

}
