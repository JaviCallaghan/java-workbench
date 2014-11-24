package es.jc.test;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.creational.builder.ConcreteBuilder;
import es.jc.creational.builder.Director;

/**
 * Test class for Builder creational-pattern implementation.<br>
 * The trick is that responsibilities are shared between building components: ConcreteBuilder knows how to perform
 * primitive part-building operations while the director knows an specific construction algorithm combining these
 * operations, unaware of their implementation. Client side only puts the two components together.
 * 
 * @author JaviCallaghan
 */
public class BuilderTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## BUILDER TEST ########\n");
	}

	@Test
	public void testBuilder() {

		// client side wants to build a concrete product
		ConcreteBuilder builder = new ConcreteBuilder();
		Director.createProduct(builder);
		System.out.println(builder.getProduct());

	}

}
