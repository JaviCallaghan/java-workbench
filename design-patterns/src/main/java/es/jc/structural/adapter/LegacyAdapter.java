package es.jc.structural.adapter;

/**
 * [GOF] Adapter - adapts the interface of Adaptee to the Target interface.<br>
 * Note that it holds a concrete Adaptee instance to delegate adapted methods execution.
 * 
 * @author JaviCallaghan
 */
public final class LegacyAdapter implements Target {

	private Adaptee adaptee;

	public LegacyAdapter(String bar) {
		super();
		this.adaptee = new LegacyAdaptee(bar);
	}

	@Override
	public void foo() {
		adaptee.bar();
	}
	
}
