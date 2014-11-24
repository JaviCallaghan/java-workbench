/**
 * 
 */
package es.jc.structural.bridge;

/**
 * Final implementation of RefinedAbstraction.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteRefinedAbstraction extends RefinedAbstraction {

	public ConcreteRefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void bar() {
		System.out.println("ConcreteRefinedAbstraction [" + this.toString() + "]");
	}

}
