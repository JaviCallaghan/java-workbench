package es.jc.structural.composite;

import java.util.Collection;

/**
 * Leaf components behavior.<br>
 * Inherited methods to manage this list are properly implemented for leaf components to skip subcomponents managing.
 * Final implementations will only worry about drawing themselves.
 * 
 * @author JaviCallaghan
 */
public abstract class Shape implements Graphic {

	@Override
	public void add(Graphic graphic) {
		// do nothing
	}

	@Override
	public void remove(Graphic graphic) {
		// do nothing
	}

	@Override
	public Collection<Graphic> getComponents() {
		// leaf components have null subcomponents
		return null;
	}

}
