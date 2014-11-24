package es.jc.test;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.structural.decorator.Component;
import es.jc.structural.decorator.ConcreteComponent;
import es.jc.structural.decorator.ConcreteDecorator1;
import es.jc.structural.decorator.ConcreteDecorator2;

/**
 * Test class for Decorator structural-pattern implementation.<br>
 * The trick is that client side is unaware of the real nature of the component (decorator or concrete component) when
 * calling its business logic. The same would be applicable to a decorator decorating another decorator. Client only
 * calls foo() from Component class.
 * 
 * @author JaviCallaghan
 */
public class DecoratorTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## DECORATOR TEST ########\n");
	}

	@Test
	public void testDecorator() {

		// calling concrete component business logic directly
		Component component = new ConcreteComponent();
		component.foo();

		System.out.println("---");

		// decorating previous component
		Component decoratedComponent = new ConcreteDecorator1(component);
		decoratedComponent.foo();

		System.out.println("---");

		// decorating component with other decorator
		Component decoratedComponent2 = new ConcreteDecorator2(component);
		decoratedComponent2.foo();

		System.out.println("---");

		// decorating decorated component with other decorator
		decoratedComponent = new ConcreteDecorator1(decoratedComponent2);
		decoratedComponent.foo();

	}

}
