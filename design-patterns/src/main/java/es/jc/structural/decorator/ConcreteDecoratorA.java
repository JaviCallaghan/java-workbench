package es.jc.structural.decorator;

/**
 * [GOF] ConcreteDecorator - Adds responsibilities to the component.<br>
 * Note that the additional business logic is called transparently at common business logic.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void foo() {
		super.foo();
		bar();
	}
	
	/**
	 * Additional responsibility to be added to the decorated component foo behavior.
	 */
	private void bar() {
		System.out.println("Decorator [" + this.toString() + "]");
	}
	
}
