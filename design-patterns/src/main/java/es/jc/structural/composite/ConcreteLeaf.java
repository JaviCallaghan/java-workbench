package es.jc.structural.composite;

/**
 * Concrete Leaf component. Only worries about implementing its own business logic.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteLeaf extends Leaf {

	private String bar;

	public ConcreteLeaf(String bar) {
		super();
		this.bar = bar;
	}

	@Override
	public void foo() {
		System.out.println("Leaf [" + bar + "]");
	}

}
