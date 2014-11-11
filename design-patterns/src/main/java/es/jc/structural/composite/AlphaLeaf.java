package es.jc.structural.composite;

/**
 * Leaf component. Only worries about drawing itself.
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
