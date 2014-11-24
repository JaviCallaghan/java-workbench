/**
 * 
 */
package es.jc.structural.bridge;

/**
 * [GOF] Abstraction - defines the abstractions's interface and mantains a reference to an implementor object.<br>
 * Note that it holds an instance of a business logic implementor (which is called the bridge) to delegate business
 * logic execution. It is a design decision from scratch, not an adaption to an existing implementation (see [GOF]
 * Adapter), so client side must inject a concrete implementor at construction.
 * 
 * @author JaviCallaghan
 */
public abstract class Abstraction {

	private Implementor bridge;

	/**
	 * Public constructor, which receives implementor implementation instance.
	 *
	 * @param implementor
	 */
	public Abstraction(Implementor implementor) {
		super();
		this.bridge = implementor;
	}

	/**
	 * Business logic method.
	 */
	public void foo() {
		// delegates in bridge the business logic implementation
		bridge.foo();
	}

	/**
	 * Business logic method.
	 */
	public abstract void bar();

}
