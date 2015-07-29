package es.jc.test;

import org.junit.Test;

import es.jc.interfaces.Implementation;
import es.jc.interfaces.Interface;
import es.jc.interfaces.Overriden;

public class InterfaceTest {

	@Test
	public void testImplementation() {
		final Interface i = new Implementation();
		i.foo();
		i.bar();
	}
	
	@Test
	public void testOverriden() {
		final Interface i = new Overriden();
		i.foo();
		i.bar();
	}

}
