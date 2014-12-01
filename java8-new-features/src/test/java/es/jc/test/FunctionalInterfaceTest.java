package es.jc.test;

import org.junit.Test;

import es.jc.lambdas.FunctionalDefaultInterface;
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
		FunctionalDefaultInterface.foobar();
		FunctionalDefaultInterface fdi = () -> System.out.println("Foo " + this.toString());
		fdi.foo();
		fdi.bar();
		fdi.foobar("Alpha");
	}

	@Test
	public void testFunctionalDefaultInterfaceMethodRef() {
		// calling static method of FunctionalDefaultInterface
		FunctionalDefaultInterface.foobar();

		System.out.println("---");

		// interface instance extending FunctionalInterface with a local private method reference implementation
		FunctionalDefaultInterface fdi = this::foo2;
		fdi.foo();
		fdi.bar();
		fdi.foobar("Bravo");

		System.out.println("---");

		// interface instance extending FunctionalInterface with a static method reference implementation
		fdi = FunctionalDefaultInterface::foobar;
		fdi.foo();
		fdi.bar();
		fdi.foobar("Charlie");
	}

	private void foo2() {
		System.out.println("Foo2 " + this.toString());
	}

}
