package es.jc.structural.adapter;

/**
 * [GOF] Target - defines the domain-specific interface that client side uses.<br>
 * 
 * @author JaviCallaghan
 */
public interface Target {
	
	/**
	 * Business logic method expected from client side.
	 */
	public void foo();
	
}
