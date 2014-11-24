package es.jc.structural.adapter;

/**
 * Concrete Adaptee object. Only worries about implementing its own business logic.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteAdaptee implements Adaptee {

	@Override
	@Deprecated
	public void bar() {
		System.out.println("Adaptee [" + this.toString() + "]");
	}

}
