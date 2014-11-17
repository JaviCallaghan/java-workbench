package es.jc.behavioral.iterator;

/**
 * [GOF] Aggregate - defines an interface for creating an Iterator object.<br>
 * 
 * @param <T> type of aggregate elements
 * @author JaviCallaghan
 */
public interface Aggregate<T> {

	/**
	 * Method to create an iterator suitable for current aggregate.
	 * @return iterator suitable for current aggregate
	 */
	Iterator<T> createIterator();
	
	/**
	 * Method to retrieve aggregate number of elements.
	 * @return number of aggregated elements
	 */
	int size();

}
