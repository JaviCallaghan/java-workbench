package es.jc.lambdas;

/**
 * Test for FunctionalDefault Interface that contains a non-default abstract method (inherited) and several static and
 * default methods.
 * 
 * @author JaviCallaghan
 */
public interface FunctionalDefaultInterface extends FunctionalInterface {

	default void bar() {
		System.out.println("Bar " + this.toString());
	}

	default void foobar(String param) {
		// note that we can call static, local and parameter's public methods in default method bodies with no problem
		foobar();
		foo();
		System.out.println(param.toString());
	}

	static void foobar() {
		System.out.println("Foobar");
	}

}
