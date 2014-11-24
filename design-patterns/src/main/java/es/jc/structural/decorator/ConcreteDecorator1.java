package es.jc.structural.decorator;

/**
 * [GOF] ConcreteDecorator - Adds responsibilities to the component.<br>
 * Note that the additional business logic is called transparently at common business logic.
 * 
 * @author JaviCallaghan
 */
public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
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
