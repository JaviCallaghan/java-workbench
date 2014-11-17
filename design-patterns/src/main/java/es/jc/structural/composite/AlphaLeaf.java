package es.jc.structural.composite;

/**
 * Final Leaf component. Only worries about implementing its own business logic.
 * 
 * @author JaviCallaghan
 */
public final class AlphaLeaf extends Leaf {

	private String bar;

	public AlphaLeaf(String bar) {
		super();
		this.bar = bar;
	}

	@Override
	public void foo() {
		System.out.println("Alpha [" + bar + "]");
	}

}
