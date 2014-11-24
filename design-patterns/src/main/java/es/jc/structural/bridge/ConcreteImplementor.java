/**
 * 
 */
package es.jc.structural.bridge;

/**
 * [GOF] ConcreteImplementor - Implements the implementor interface and defines its concrete implementation.<br>
 * Note that this way, Implementor implementations grow independently from Abstraction ones.
 * 
 * @author JaviCallaghan
 */
public class ConcreteImplementor implements Implementor {

	@Override
	public void foo() {
		System.out.println("Implementor [" + this.toString() + "]");
	}

}
