package es.jc.test;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.creational.abstractfactory.AbstractFactory;
import es.jc.creational.abstractfactory.AbstractProductA;
import es.jc.creational.abstractfactory.AbstractProductB;
import es.jc.creational.abstractfactory.ConcreteFactory1;
import es.jc.creational.abstractfactory.ConcreteFactory2;

/**
 * Test class for AbstractFactory creational-pattern implementation.<br>
 * The trick is that the client side is unaware of which factory implementation has been injected at runtime, as it
 * calls creation logic and works with resulting objects in an abstract way.
 * 
 * @author JaviCallaghan
 */
public class AbstractFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## ABSTRACT FACTORY TEST ########\n");
	}

	@Test
	public void testAbstractFactory() {

		// factory to create products with of according to an implementation kit
		AbstractFactory af;
		AbstractProductA productA;
		AbstractProductB productB;

		// neither a kit nor a concrete product can be instantiated without using factory
		// new ProductKit1(); // does not work
		// product A = new ConcreteProductA1(); // does not work

		// instantiate kit 1
		System.out.println("Kit 1");
		af = new ConcreteFactory1();
		productA = af.createProductA();
		System.out.println("ProductA: " + productA.toString());
		productB = af.createProductB();
		System.out.println("ProductB: " + productB.toString());

		System.out.println("---");

		// instantiate kit 2
		System.out.println("Kit 2");
		af = new ConcreteFactory2();
		productA = af.createProductA();
		System.out.println("ProductA: " + productA.toString());
		productB = af.createProductB();
		System.out.println("ProductB: " + productB.toString());

	}

}
