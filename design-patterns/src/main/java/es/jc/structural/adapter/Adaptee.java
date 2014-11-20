package es.jc.structural.adapter;

/**
 * [GOF] Adaptee - defines an existing interface that needs adapting.<br>
 * 
 * @author JaviCallaghan
 */
public interface Adaptee {

	/**
	 * Inner business logic method to be adapted.
	 * 
	 * @deprecated as it should not be called directly by client side
	 */
	@Deprecated
	public void bar();

}
