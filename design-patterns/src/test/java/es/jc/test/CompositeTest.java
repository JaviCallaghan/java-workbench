package es.jc.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.jc.structural.composite.Composite;
import es.jc.structural.composite.ConcreteLeaf;

/**
 * Test class for Composite creational-pattern implementation.<br>
 * The trick is that the client invokes business logic of components regardless of their composite/leaf nature,
 * doing in the first case a recursive traversal through business logic of children components.
 * 
 * @author JaviCallaghan
 */
public class CompositeTest {

	@Test
	public void testComposite() {

		// instantiate several leaves
		ConcreteLeaf l1 = new ConcreteLeaf("L1");
		ConcreteLeaf l2 = new ConcreteLeaf("L2");
		ConcreteLeaf l3 = new ConcreteLeaf("L3");
		// foo leaf component
		l3.foo();
		assertNull(l3.getComponents());

		System.out.println("---");

		// instantiate a composite
		Composite c1 = new Composite("C1");
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
		Composite c2 = new Composite("C2");
		c1.add(c2);
		// foo composite with empty composite
		c2.foo();
		System.out.println("");
		c1.foo();

		System.out.println("---");

		// fill subcomposite
		c2.add(new ConcreteLeaf("L4"));
		c2.add(new ConcreteLeaf("L5"));
		c2.add(new ConcreteLeaf("L6"));
		// foo composites
		c2.foo();
		System.out.println("");
		c1.foo();

		System.out.println("---");

		// manage components
		c1.remove(c2);
		c1.add(new ConcreteLeaf("L9"));
		// foo final composite
		c1.foo();

	}

}
