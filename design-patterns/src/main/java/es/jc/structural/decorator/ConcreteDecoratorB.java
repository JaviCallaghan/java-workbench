package es.jc.structural.decorator;

/**
 * [GOF] ConcreteDecorator - Adds responsibilities to the component.<br>
 * Note that the additional business logic is called transparently at common business logic.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
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
		System.out.println("Decorator [" + this.toString() + "]");
	}
	
}
