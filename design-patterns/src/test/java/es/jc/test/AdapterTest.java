package es.jc.test;

import org.junit.Test;

import es.jc.structural.adapter.Adaptee;
import es.jc.structural.adapter.Adapter;
import es.jc.structural.adapter.ConcreteAdaptee;
import es.jc.structural.adapter.Target;

/**
 * Test class for Adapter structural-pattern implementation.<br>
 * The trick is that the client side is only aware of the target interface (and adapter), which delegates on concrete
 * adaptee business logic implementation.
 * 
 * @author JaviCallaghan
 */
public class AdapterTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testAdaptee() {

		// using the adaptee directly (is actually what adapter usage tries to avoid)
		Adaptee adaptee = new ConcreteAdaptee("foobar");
		adaptee.bar();

	}

	@Test
	public void testAdapter() {

		// using the target interface through adapter to call adaptee business logic implementation unaware of it
		Target target = new Adapter("foobar");
		target.foo();

	}

}
