package es.jc.structural.composite;

/**
 * Leaf component. Only worries about drawing itself.
 * 
 * @author JaviCallaghan
 */
public final class Circle extends Shape {

	private String foo;
	
	public Circle(String foo) {
		super();
		this.foo = foo;
	}

	@Override
	public void draw() {
		System.out.println("Circle [" + foo + "]");
	}

}
