package es.jc.behavioral.memento;

/**
 * [GOF] Caretaker - responsible to restore object state from memento.<br>
 * 
 * @author jsferreras
 * @param <T> type of memento state
 */
public interface Caretaker<T, K> {

	/**
	 * Persists a memento.
	 * 
	 * @param state memento to persist
	 */
	void add(Memento<T> state);

	/**
	 * Retrieves a memento.
	 * 
	 * @param key indexing key for memento to retrieve
	 */
	Memento<T> get(K key);

	/**
	 * Retrieves last persisted memento.
	 * 
	 * @return last persisted memento
	 */
	Memento<T> getLast();

}
