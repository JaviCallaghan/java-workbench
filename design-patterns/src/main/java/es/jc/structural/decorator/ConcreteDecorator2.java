package es.jc.structural.decorator;

/**
 * [GOF] ConcreteDecorator - Adds responsibilities to the component.
 * Note that the additional business logic is called transparently at common business logic.
 * 
 * @author JaviCallaghan
 */
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}

	@Override
	public void foo() {
		super.foo();
		foobar();
	}
	
	/**
	 * Additional business logic to be added to the decorated component foo behavior.
	 */
	private void foobar() {
		System.out.println(" └ Decorated with ConcreteDecorator2 (foobar)");
	}
	
}