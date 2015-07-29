package es.jc.test;

import java.util.Arrays;

import org.junit.Test;

import es.jc.concurrent.BasicExecutorsImpl;
import es.jc.concurrent.Runner;

public class ConcurrentTest {

	final BasicExecutorsImpl srv = new BasicExecutorsImpl();

	@Test
	public void testStartFriendlyRaceSingle() {
		srv.startFriendlyRaceSingleThreadPool(Arrays.asList(new Runner.Turtle("Leonardo"), new Runner.Fox("Swift"),
				new Runner.Turtle("Raphael"), new Runner.Fox("Quemorro")));
	}
	
	@Test
	public void testStartFriendlyDelayedRaceSingle() {
		srv.startFriendlyDelayedRaceSingleThreadPool(Arrays.asList(new Runner.Turtle("Leonardo"), new Runner.Fox("Swift"),
				new Runner.Turtle("Raphael"), new Runner.Fox("Quemorro")));
	}

	@Test
	public void testStartFriendlyRaceCached() {
		srv.startFriendlyRaceCachedThreadPool(Arrays.asList(new Runner.Turtle("Leonardo"), new Runner.Fox("Swift"),
				new Runner.Turtle("Raphael"), new Runner.Fox("Quemorro")));
	}

	@Test
	public void testStartFriendlyDelayedRaceCached() {
		srv.startFriendlyDelayedRaceCachedThreadPool(Arrays.asList(new Runner.Turtle("Leonardo"), new Runner.Fox(
				"Swift"), new Runner.Turtle("Raphael"), new Runner.Fox("Quemorro")));
	}

	@Test
	public void testStartCompetitionRaceSingle() {
		srv.startCompetitionRaceSingleThreadPool(Arrays.asList(new Runner.Turtle("Leonardo"), new Runner.Fox("Swift"),
				new Runner.Turtle("Raphael"), new Runner.Fox("Quemorro")));
	}

	@Test
	public void testStartCompetitionRaceCached() {
		srv.startCompetitionRaceCachedThreadPool(Arrays.asList(new Runner.Turtle("Leonardo"), new Runner.Fox("Swift"),
				new Runner.Turtle("Raphael"), new Runner.Fox("Quemorro")));
	}

}
