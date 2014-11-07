package es.jc.structural.composite;

/**
 * Leaf component. Only worries about drawing itself.
 * 
 * @author JaviCallaghan
 */
public final class Line extends Shape {

	private String foo;

	public Line(String foo) {
		super();
		this.foo = foo;
	}

	@Override
	public void draw() {
		System.out.println("Line [" + foo + "]");
	}

}
