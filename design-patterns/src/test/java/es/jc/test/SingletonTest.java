package es.jc.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.jc.creational.singleton.Singleton;

/**
 * Test class for Singleton creational-pattern implementation.<br>
 * The trick is that the only way the client has to get an instance of the singleton is through its getInstance() method
 * and it is always turns out to be same object instance.
 * 
 * @author JaviCallaghan
 */
public class SingletonTest {

	@Test
	public void testSingleton() {

		// A Singleton class cannot be instantiated by calling its constructor
		// SingletonGreeter greeter = new SingletonGreeter(); // does not work

		// Get singleton instance and call foo
		Singleton greeter1 = Singleton.getInstance();
		greeter1.foo();
		// Get another singleton instance and call foo
		Singleton greeter2 = Singleton.getInstance();
		greeter2.foo();

		// Assert that both instances point to the same object
		assertTrue(greeter1 == greeter2);
	}

}
