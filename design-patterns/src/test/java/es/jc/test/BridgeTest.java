package es.jc.test;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.structural.bridge.ConcreteImplementor;
import es.jc.structural.bridge.ConcreteRefinedAbstraction;
import es.jc.structural.bridge.RefinedAbstraction;

/**
 * Test class for Bridge structural-pattern implementation.<br>
 * The trick is that development of Abstraction and Implementor subclassing could be performed independently while the
 * client side chooses which implementation fits best for its purposes.
 * 
 * @author JaviCallaghan
 */
public class BridgeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## BRIDGE TEST ########\n");
	}

	@Test
	public void testBridge() {

		// using the target interface through adapter to call adaptee business logic implementation unaware of it
		RefinedAbstraction abstraction = new ConcreteRefinedAbstraction(new ConcreteImplementor());
		abstraction.foo();
		abstraction.bar();
		abstraction.foobar();

	}

}
