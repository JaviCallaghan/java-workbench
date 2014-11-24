package es.jc.structural.composite;

import java.util.Collection;

/**
 * [GOF] Component - Declares the interface for objects in the composition. Declares an interface for accessing and
 * managing child components.
 * 
 * @author JaviCallaghan
 */
public interface Component {

	/**
	 * Business logic method.
	 */
	void foo();

	/**
	 * Method to manage possible graphic components: Add new component.
	 * 
	 * @param graphic component graphic to add to composition
	 */
	void add(Component graphic);

	/**
	 * Method to manage possible graphic components: Remove existing component.
	 * 
	 * @param graphic component graphic to remove from composition
	 */
	void remove(Component graphic);

	/**
	 * Method to manage possible graphic components: Get components.
	 * 
	 * @return composition graphic components
	 */
	Collection<Component> getComponents();

}
