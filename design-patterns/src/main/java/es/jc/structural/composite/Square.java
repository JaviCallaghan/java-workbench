package es.jc.structural.composite;

/**
 * Leaf component. Only worries about drawing itself.
 * 
 * @author JaviCallaghan
 */
public final class Square extends Shape {

	private String foo;
	
	public Square(String foo) {
		super();
		this.foo = foo;
	}
	
	@Override
	public void draw() {
		System.out.println("Square [" + foo + "]");
	}

}
