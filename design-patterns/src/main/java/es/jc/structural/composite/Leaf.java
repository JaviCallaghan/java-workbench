package es.jc.structural.composite;

import java.util.Collection;

/**
 * [GOF] Leaf - defines behavior for leaf / primitive objects in the composition. A leaf has no children.<br>
 * Inherited methods to manage this list are properly implemented for leaf components to skip subcomponents managing.
 * Final implementations will only worry about drawing themselves.
 * 
 * @author JaviCallaghan
 */
public abstract class Leaf implements Component {

	@Override
	public void add(Component graphic) {
		// do nothing
	}

	@Override
	public void remove(Component graphic) {
		// do nothing
	}

	@Override
	public Collection<Component> getComponents() {
		// leaf components have null subcomponents
		return null;
	}

}
