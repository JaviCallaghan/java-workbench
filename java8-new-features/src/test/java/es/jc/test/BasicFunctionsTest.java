package es.jc.test;

import org.junit.Test;

import es.jc.functions.BasicFunctions;
import es.jc.functions.BasicFunctionsString;

/**
 * Test class for BasicFunctionsString implementation.<br>
 * 
 * @author JaviCallaghan
 */
public class BasicFunctionsTest {

	private BasicFunctions<String> functions;

	public BasicFunctionsTest() {
		functions = new BasicFunctionsString();
	}

	@Test
	public void testBasicFunctions() {

		// consumer default implementation as lambda-expression printing decorated given parameter
		functions.accept("foo", t -> System.out.println("*" + t + "*"));

		System.out.println("---");

		// function default implementation as lambda-expression returning changed given parameter
		functions.apply("foo", t -> t.toUpperCase());

		System.out.println("---");

		// predicate default implementation as lambda-expression returning max length evaluation
		functions.test("foo", t -> t.length() > 5);

		System.out.println("---");

		// supplier default implementation as lambda-expression returning random value
		functions.get(() -> "foo");

	}

}
