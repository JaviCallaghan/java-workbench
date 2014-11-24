package es.jc.behavioral.visitor;

/**
 * [GOF] Element - defines an operation that takes a visitor as an argument.<br>
 * Note that it can provide an interface which may be used by visitor logic. But we will omit it for simplicity.
 * 
 * @author JaviCallaghan
 */
public interface Element {

	/**
	 * Accept operation to be called at iteration.
	 * 
	 * @param visitor which will process an element
	 */
	void accept(Visitor<Element> visitor);

}
