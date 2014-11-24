package es.jc.behavioral.visitor;

/**
 * [GOF] Visitor - declares an operation for an element to be performed at visit over the element itself.
 * 
 * @param <T> type of visitable elements
 * @author JaviCallaghan
 */
public interface Visitor<T> {
	
	/**
	 * Business logic at visitation.
	 * @param type visitable type
	 */
	void visit(T type);

}
