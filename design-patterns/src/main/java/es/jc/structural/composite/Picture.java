/**
 * 
 */
package es.jc.structural.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Composite class.<br>
 * Note that it holds a list of {@link Graphic} components which could be both composite or leaf instances.
 * Inherited methods to manage this list are properly implemented.
 * 
 * @author JaviCallaghan
 */
public final class Picture implements Graphic {

	private String foo;
	private List<Graphic> components;
	
	public Picture(String foo) {
		super();
		this.foo = foo;
		this.components = new ArrayList<>();
	}

	@Override
	public void draw() {
		System.out.println("Picture [" + foo + "] (" + components.size() + " subcomponents)");
		// draw composite subcomponents
		for (Graphic component : getComponents()) {
			// note that as any tree-structure traversal method, it is necessarily recursive
			component.draw();
		}
	}

	@Override
	public void add(Graphic graphic) {
		components.add(graphic);
	}

	@Override
	public void remove(Graphic graphic) {
		components.remove(graphic);
	}

	@Override
	public Collection<Graphic> getComponents() {
		return components;
	}

}
