package es.jc.lambdas;

/**
 * Test for FunctionalDefault Interface that contains a non-default abstract method (inherited) and several static and
 * default methods.
 * 
 * @author JaviCallaghan
 */
public interface FunctionalDefaultInterface extends FunctionalInterface {

	/**
	 * Default non-static method.
	 */
	default void bar() {
		System.out.println("Bar " + this.toString());
	}
	
	/**
	 * Static method.
	 */
	static void baz() {
		System.out.println("Baz");
	}

	/**
	 * Default non-static method (as it calls both static and non-static methods).
	 */
	default void foobar() {
		System.out.println("Foobar");
		// note that we can call inherited and static method implementations
		foo();
		bar();
		baz();
	}

}
