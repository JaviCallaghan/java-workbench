/**
 * 
 */
package es.jc.structural.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * [GOF] Composite - defines behavior for components having children. Stores child components and implements their
 * managing operations.<br>
 * Note that it holds a list of {@link Component} components which could be both composite or leaf instances.
 * Inherited methods to manage this list are properly implemented.
 * 
 * @author JaviCallaghan
 */
public final class Composite implements Component {

	private List<Component> components;

	public Composite() {
		super();
		this.components = new ArrayList<>();
	}

	@Override
	public void foo() {
		System.out.println("Composite [" + this.toString() + "] (" + components.size() + " subcomponents)");
		// draw composite subcomponents
		for (Component component : getComponents()) {
			// note that as any tree-structure traversal method, it is necessarily recursive
			component.foo();
		}
	}

	@Override
	public void add(Component graphic) {
		components.add(graphic);
	}

	@Override
	public void remove(Component graphic) {
		components.remove(graphic);
	}

	@Override
	public Collection<Component> getComponents() {
		return components;
	}

}
