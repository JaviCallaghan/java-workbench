/**
 * 
 */
package es.jc.interfaces;

public class Overriden implements Interface {

	@Override
	public void foo() {
		System.out.println("foo overriden");
	}

	/**
	 * Overriding default method bar().
	 */
	@Override
	public void bar() {
		System.out.println("bar overriden non-" + Interface.getDefault());
	}

}
