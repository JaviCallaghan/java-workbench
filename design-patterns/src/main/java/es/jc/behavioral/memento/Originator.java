package es.jc.behavioral.memento;

/**
 * [GOF] Originator - specifies an abstract interface for saving and loading states to and from memento objects.
 * 
 * @author JaviCallaghan
 * @param <T> type of memento state
 */
public interface Originator<T> {

	/**
	 * Saves current state at memento object.
	 * @return memento object holding current state.
	 */
	public Memento<T> saveState();
	
	/**
	 * Loads current state given memento object.
	 * @param <T>
	 * @param memento object holding desired state.
	 */
	public void loadState(Memento<T> memento);
	
}
