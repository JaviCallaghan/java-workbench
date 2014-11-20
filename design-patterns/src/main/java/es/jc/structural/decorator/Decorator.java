package es.jc.structural.decorator;

/**
 * [GOF] Decorator - Maintains a reference to a Component object and defines an interfaces that conforms to Component's
 * interface.
 * Note that it delegates in component attribute (set at construction) the execution of the business logic method.
 * 
 * @author JaviCallaghan
 */
public abstract class Decorator implements Component {

	protected Component component;

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void foo() {
		component.foo();
	}
	
}
