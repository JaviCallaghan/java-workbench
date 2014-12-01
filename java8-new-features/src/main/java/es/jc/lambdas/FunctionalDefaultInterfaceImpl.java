package es.jc.lambdas;

/**
 * Test for FunctionalDefault Interface that contains a non-default abstract method (inherited) and several static and
 * default methods.
 * 
 * @author JaviCallaghan
 */
public final class FunctionalDefaultInterfaceImpl implements FunctionalDefaultInterface {

	@Override
	public void foo() {
		System.out.println("FunctionalDefaultInterfaceImpl [Foo " + this.toString() + "]");
	}

}
