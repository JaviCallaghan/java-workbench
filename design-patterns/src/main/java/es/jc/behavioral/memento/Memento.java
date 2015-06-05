package es.jc.behavioral.memento;

/**
 * [GOF] Memento - contains state of an object to be restored.<br>
 * 
 * @author JaviCallaghan
 * @param <T> type of memento state
 */
public class Memento<T> {

	private T state;
	
	public Memento(T state) {
		this.state = state;
	}

	/**
	 * Getter for memento state;
	 * @return the state
	 */
	public T getState() {
		return state;
	}
	
}
