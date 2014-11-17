package es.jc.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.jc.structural.composite.AlphaLeaf;
import es.jc.structural.composite.BravoLeaf;
import es.jc.structural.composite.CharlieLeaf;
import es.jc.structural.composite.Composite;

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
		AlphaLeaf l1 = new AlphaLeaf("L1");
		BravoLeaf l2 = new BravoLeaf("L2");
		CharlieLeaf l3 = new CharlieLeaf("L3");
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
		c2.add(new AlphaLeaf("L4"));
		c2.add(new BravoLeaf("L5"));
		c2.add(new CharlieLeaf("L6"));
		// foo composites
		c2.foo();
		System.out.println("");
		c1.foo();

		System.out.println("---");

		// manage components
		c1.remove(c2);
		c1.add(new AlphaLeaf("L9"));
		// foo final composite
		c1.foo();

	}

}
