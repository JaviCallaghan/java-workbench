package es.jc.structural.adapter;

/**
 * [GOF] Adapter - adapts the interface of a concrete Adaptee to the Target interface.<br>
 * Note that it holds a concrete Adaptee instance to delegate adapted methods execution.
 * 
 * @author JaviCallaghan
 */
public final class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(String bar) {
		super();
		this.adaptee = new ConcreteAdaptee(bar);
	}

	@Override
	public void foo() {
		adaptee.bar();
	}
	
}
