package es.jc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import es.jc.behavioral.iterator.Aggregate;
import es.jc.behavioral.iterator.ConcreteAggregate;
import es.jc.behavioral.iterator.Iterator;

/**
 * Test class for Singleton creational-pattern implementation.<br>
 * The trick is that the client side knows the concrete implementation of the aggregate, and uses the corresponding
 * iterator being unaware of its implementation.
 * 
 * @author JaviCallaghan
 */
public class IteratorTest {

	@Test
	public void testIterator() {

		Aggregate<Integer> ba;

		// create empty aggregate
		ba = new ConcreteAggregate<>();
		assertEquals(0, ba.size());
		assertFalse(ba.createIterator().hasNext());

		// create filled aggregate
		ba = new ConcreteAggregate<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		assertTrue(ba.size() > 0);
		// create two iterators for the aggregate
		Iterator<Integer> it1 = ba.createIterator();
		Iterator<Integer> it2 = ba.createIterator();
		assertTrue(it1.hasNext());
		System.out.println("Next for it1: " + it1.next());
		System.out.println("Next for it1: " + it1.next());
		System.out.println("\nNext items:");
		// iterate through iterators at a different pace
		while (it1.hasNext() && it2.hasNext()) {
			System.out.println("it1: " + it1.next());
			System.out.println("it2: " + it2.next());
		}
		assertFalse(it1.hasNext());
		// there should be it2 elements left
		assertTrue(it2.hasNext());

		System.out.println("\nNext it2 items:");
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("it2: " + it2.next());
			}
			fail("This block should throw IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Overflowed iteration: " + ex.getMessage());
		}
	}
}
