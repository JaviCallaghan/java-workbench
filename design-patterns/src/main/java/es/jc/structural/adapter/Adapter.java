package es.jc.structural.adapter;

/**
 * [GOF] Adapter - adapts the interface of a concrete Adaptee to the Target interface.<br>
 * Note that it holds a concrete Adaptee instance to delegate adapted methods execution.
 * 
 * @author JaviCallaghan
 */
public final class Adapter implements Target {

	/**
	 * 
	 */
	private Adaptee adaptee;

	/**
	 * Public constructor, which forces adaptee implementation instance.
	 */
	public Adapter() {
		super();
		this.adaptee = new ConcreteAdaptee();
	}

	@Override
	public void foo() {
		// this way we are hiding the deprecated method call to client side
		adaptee.bar();
	}
	
}
