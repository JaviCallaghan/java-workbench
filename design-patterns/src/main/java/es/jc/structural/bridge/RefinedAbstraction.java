/**
 * 
 */
package es.jc.structural.bridge;

/**
 * [GOF] RefinedAbstraction - Extends the interface defined by Abstraction.<br>
 * This is an example of how Abstraction extensions may grow independently of Implementor ones.
 * 
 * @author JaviCallaghan
 */
public abstract class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	public void foobar() {
		System.out.println("RefinedAbstraction [" + this.toString() + "]");
	}

}
