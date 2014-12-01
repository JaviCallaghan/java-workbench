package es.jc.test;

import org.junit.Test;

import es.jc.lambdas.FunctionalDefaultInterface;
import es.jc.lambdas.FunctionalDefaultInterfaceImpl;
import es.jc.lambdas.FunctionalInterface;

/**
 * Test class for FunctionalInterface implementation.
 * 
 * @author JaviCallaghan
 */
public class FunctionalInterfaceTest {

	@Test
	public void testFunctionalInterfaceInstance() {
		// interface instance with a nested inline implementation
		FunctionalInterface fi = new FunctionalInterface() {

			@Override
			public void foo() {
				System.out.println("Foo " + this.toString());
			}
		};
		fi.foo();
	}

	@Test
	public void testFunctionalInterfaceLambda() {
		// interface instance with a lambda expression implementation
		FunctionalInterface fi = () -> System.out.println("Foo " + this.toString());
		fi.foo();
	}

	@Test
	public void testFunctionalDefaultInterface() {
		// interface instance extending FunctionalInterface with a lambda expression implementation
		FunctionalDefaultInterface.baz();
		FunctionalDefaultInterface fdi = () -> System.out.println("Foo " + this.toString());
		fdi.foo();
		fdi.bar();
		fdi.foobar();
	}

	@Test
	public void testFunctionalDefaultInterfaceMethodRef() {
		// calling static method of FunctionalDefaultInterface
		FunctionalDefaultInterface.baz();

		System.out.println("---");
		
		// implementation instance by new method reference
		FunctionalDefaultInterface fdi = FunctionalDefaultInterfaceImpl::new;
		fdi.foobar();
		
		System.out.println("---");

		// interface instance extending FunctionalInterface with a local private static method reference implementation
		fdi = FunctionalInterfaceTest::aux;
		fdi.foobar();

		System.out.println("---");

		// interface instance extending FunctionalInterface with a local private method reference implementation
		fdi = this::aux2;
		fdi.foobar();
				
		System.out.println("---");

		// interface instance extending FunctionalInterface with a static method reference implementation
		fdi = FunctionalDefaultInterface::baz;
		fdi.foobar();

	}

	/**
	 * Auxiliary private method to test local static method references.
	 */
	private static void aux() {
		System.out.println("Aux");
	}
	
	/**
	 * Auxiliary private method to test local non-static method references.
	 */
	private void aux2() {
		System.out.println("Aux " + this.toString());
	}

}
