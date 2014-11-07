package es.jc.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.jc.creational.singleton.Greeter;

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

		// Get singleton instance and call business logic
		Greeter greeter1 = Greeter.getInstance();
		greeter1.greet("Javi");
		// Get another singleton instance and call business logic
		Greeter greeter2 = Greeter.getInstance();
		greeter2.greet("Callaghan");

		// Assert that both instances point to the same object
		assertTrue(greeter1 == greeter2);
	}

}
