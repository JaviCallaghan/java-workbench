package es.jc.test;

import org.junit.Test;

import es.jc.structural.adapter.LegacyAdapter;
import es.jc.structural.adapter.Target;

/**
 * Test class for Adapter structural-pattern implementation.<br>
 * The trick is that the client side is only aware of the target interface (and adapter), which delegates on concrete
 * adaptee business logic implementation.
 * 
 * @author JaviCallaghan
 */
public class AdapterTest {

	@Test
	public void testAdapter() {

		// instantiate target implementation
		Target target = new LegacyAdapter("foobar");
		target.foo();

	}

}
