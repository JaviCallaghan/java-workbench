package es.jc.test;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.behavioral.visitor.ConcreteElement;
import es.jc.behavioral.visitor.ConcreteVisitor;
import es.jc.behavioral.visitor.Element;

/**
 * Test class for Visitor behavioral-pattern implementation.<br>
 * The trick is that the client side wants to visit all elements of the roster, unaware of how visitor is implemented
 * but selecting the concrete one which fits its needs.
 * 
 * @author JaviCallaghan
 */
public class VisitorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## VISITOR TEST ########\n");
	}

	@Test
	public void testVisitor() {

		// roster to be iterated to visit elements
		List<Element> elements = Arrays.asList(new ConcreteElement(), new ConcreteElement(), new ConcreteElement());

		// visitor to be accepted by elements at which will hold track of the iteration
		ConcreteVisitor visitor = new ConcreteVisitor();

		// traverse roster
		for (Element e : elements) {
			e.accept(visitor);
		}
		System.out.println(visitor.getCount() + " elements visited");

	}
}
