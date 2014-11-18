package es.jc.structural.adapter;

/**
 * Concrete Adaptee object. Only worries about implementing its own business logic.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteAdaptee implements Adaptee {

	private String bar;

	public ConcreteAdaptee(String bar) {
		super();
		this.bar = bar;
	}

	@Override
	public void bar() {
		System.out.println("Adaptee [" + bar + "]");
	}

}
