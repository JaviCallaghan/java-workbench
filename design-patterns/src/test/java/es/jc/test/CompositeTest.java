package es.jc.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.jc.structural.composite.Circle;
import es.jc.structural.composite.Line;
import es.jc.structural.composite.Picture;
import es.jc.structural.composite.Square;

/**
 * Test class for Composite creational-pattern implementation.
 * 
 * @author JaviCallaghan
 */
public class CompositeTest {

	@Test
	public void testComposite() {

		// instantiate several leaves
		Circle c1 = new Circle("C1");
		Line l1 = new Line("L1");
		Square s1 = new Square("S1");
		// draw leaf component
		c1.draw();
		assertNull(c1.getComponents());

		System.out.println("");
		// instantiate a composite
		Picture p1 = new Picture("P1");
		// draw empty composite
		p1.draw();
		assertNotNull(p1.getComponents());
		assertTrue(p1.getComponents().isEmpty());

		System.out.println("");
		// fill composite with leaves
		p1.add(c1);
		p1.add(l1);
		p1.add(s1);
		// draw composite of leaves
		p1.draw();

		System.out.println("");
		// manage composite components, adding another composite
		p1.remove(l1);
		p1.remove(s1);
		Picture p2 = new Picture("P2");
		p1.add(p2);
		p1.add(l1);
		p1.add(s1);
		// draw composite with empty composite
		p1.draw();

		System.out.println("");
		// fill subcomposite
		p2.add(new Circle("C2"));
		p2.add(new Line("L2"));
		p2.add(new Square("S2"));
		// draw composites
		p2.draw();
		System.out.println("");
		p1.draw();

		System.out.println("");
		// manage components
		p1.remove(p2);
		p1.remove(c1);
		// draw final composite
		p1.draw();

	}

}
