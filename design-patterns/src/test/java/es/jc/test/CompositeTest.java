package es.jc.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.structural.composite.Composite;
import es.jc.structural.composite.ConcreteLeaf;

/**
 * Test class for Composite creational-pattern implementation.<br>
 * The trick is that the client side invokes business logic of components regardless of their composite/leaf nature,
 * doing in the first case a recursive traversal through business logic of children components.
 * 
 * @author JaviCallaghan
 */
public class CompositeTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## COMPOSITE TEST ########\n");
	}

	@Test
	public void testComposite() {

		// instantiate several leaves
		ConcreteLeaf l1 = new ConcreteLeaf();
		ConcreteLeaf l2 = new ConcreteLeaf();
		ConcreteLeaf l3 = new ConcreteLeaf();
		// foo leaf component
		l3.foo();
		assertNull(l3.getComponents());

		System.out.println("---");

		// instantiate a composite
		Composite c1 = new Composite();
		// foo empty composite
		c1.foo();
		assertNotNull(c1.getComponents());
		assertTrue(c1.getComponents().isEmpty());

		System.out.println("---");

		// fill composite with leaves
		c1.add(l1);
		c1.add(l2);
		c1.add(l3);
		// foo composite of leaves
		c1.foo();

		System.out.println("---");

		// manage composite components, adding another composite
		c1.remove(l1);
		c1.remove(l3);
		Composite c2 = new Composite();
		c1.add(c2);
		// foo composite with empty composite
		c2.foo();
		System.out.println("");
		c1.foo();

		System.out.println("---");

		// fill subcomposite
		c2.add(new ConcreteLeaf());
		c2.add(new ConcreteLeaf());
		c2.add(new ConcreteLeaf());
		// foo composites
		c2.foo();
		System.out.println("");
		c1.foo();

		System.out.println("---");

		// manage components
		c1.remove(c2);
		c1.add(new ConcreteLeaf());
		// foo final composite
		c1.foo();

	}

}
