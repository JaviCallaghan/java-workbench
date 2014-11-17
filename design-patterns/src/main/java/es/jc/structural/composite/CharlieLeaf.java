package es.jc.structural.composite;

/**
 * Final Leaf component. Only worries about implementing its own business logic.
 * 
 * @author JaviCallaghan
 */
public final class CharlieLeaf extends Leaf {

	private String bar;
	
	public CharlieLeaf(String bar) {
		super();
		this.bar = bar;
	}
	
	@Override
	public void foo() {
		System.out.println("Charlie [" + bar + "]");
	}

}
