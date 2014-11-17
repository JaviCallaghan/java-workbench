package es.jc.structural.adapter;

/**
 * Final Adaptee object. Only worries about implementing its own business logic.
 * 
 * @author JaviCallaghan
 */
public final class LegacyAdaptee implements Adaptee {

	private String bar;

	public LegacyAdaptee(String bar) {
		super();
		this.bar = bar;
	}

	@Override
	public void bar() {
		System.out.println("Legacy [" + bar + "]");
	}

}
