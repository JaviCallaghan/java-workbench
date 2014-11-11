package es.jc.structural.composite;

/**
 * Leaf component. Only worries about drawing itself.
 * 
 * @author JaviCallaghan
 */
public final class BravoLeaf extends Leaf {

	private String bar;
	
	public BravoLeaf(String bar) {
		super();
		this.bar = bar;
	}

	@Override
	public void foo() {
		System.out.println("Bravo [" + bar + "]");
	}

}
