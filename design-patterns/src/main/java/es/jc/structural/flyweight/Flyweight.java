package es.jc.structural.flyweight;

/**
 * [GOF] Flyweight - defines the members of the flyweight objects (extrinsic data).
 * 
 * @author JaviCallaghan
 */
public interface Flyweight {

	/**
	 * Gets state for all objects maintaining a reference to a flyweight.
	 * 
	 * @return a single string representing flyweight status value.
	 */
	String getState();

}
