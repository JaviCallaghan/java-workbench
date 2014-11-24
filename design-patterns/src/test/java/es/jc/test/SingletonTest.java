package es.jc.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.creational.singleton.Singleton;

/**
 * Test class for Singleton creational-pattern implementation.<br>
 * The trick is that the only way the client side has to get an instance of the singleton is through its getInstance()
 * method and it is always turns out to be same object instance.
 * 
 * @author JaviCallaghan
 */
public class SingletonTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## SINGLETON TEST ########\n");
	}

	@Test
	public void testSingleton() {

		// a Singleton class cannot be instantiated by calling its constructor
		// SingletonGreeter greeter = new SingletonGreeter(); // does not work

		// get singleton instance
		Singleton greeter1 = Singleton.getInstance();
		System.out.println("Greeter 1: " + greeter1.toString());
		// get another singleton instance
		Singleton greeter2 = Singleton.getInstance();
		System.out.println("Greeter 2: " + greeter2.toString());

		// assert that both instances point to the same object
		assertTrue(greeter1 == greeter2);
	}

}
