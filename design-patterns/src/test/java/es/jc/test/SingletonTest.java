package es.jc.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.jc.creational.singleton.Singleton;

/**
 * Test class for Singleton creational-pattern implementation.
 * 
 * @author JaviCallaghan
 */
public class SingletonTest {

	@Test
	public void testSingleton() {

		// A Singleton class cannot be instantiated by calling its constructor
		// SingletonGreeter greeter = new SingletonGreeter(); // does not work

		// Get singleton instance and foo it
		Singleton greeter1 = Singleton.getInstance();
		greeter1.foo();
		// Get another singleton instance and foo it
		Singleton greeter2 = Singleton.getInstance();
		greeter2.foo();

		// Assert that both instances point to the same object
		assertTrue(greeter1 == greeter2);
	}

}
