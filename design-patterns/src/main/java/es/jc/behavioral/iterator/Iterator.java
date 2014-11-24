/**
 * 
 */
package es.jc.behavioral.iterator;

/**
 * [GOF] Iterator - defines an interface for accessing and traversing elements.<br>
 * Note that it holds the aggregate reference to iterate and a current iteration item what makes possible to maintain
 * several iterations of the same aggregation at different paces.
 * 
 * @param <T> type of aggregate elements
 * @author JaviCallaghan
 */
public interface Iterator<T> {

	/**
	 * Retrieves next element of the iteration.
	 * 
	 * @return fetches and returns next element of the iteration
	 */
	T next();

	/**
	 * Tells if an iteration is not done yet.
	 * 
	 * @return {@code true} if iteration is not done yet, {@code false} otherwise
	 */
	boolean hasNext();

}
