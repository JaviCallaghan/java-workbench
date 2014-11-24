package es.jc.structural.composite;

/**
 * Concrete Leaf component. Only worries about implementing its own business logic.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteLeaf extends Leaf {


	public ConcreteLeaf() {
		super();
	}

	@Override
	public void foo() {
		System.out.println("Leaf [" + this.toString() + "]");
	}

}
