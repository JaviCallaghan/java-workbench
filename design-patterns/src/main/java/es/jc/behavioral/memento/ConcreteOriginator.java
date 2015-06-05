package es.jc.behavioral.memento;

/**
 * [GOF] ConcreteOriginator - creates and stores string states in Memento objects.<br>
 * 
 * @author JaviCallaghan
 * @param <T> type of memento state
 */
public class ConcreteOriginator<T> implements Originator<T> {

	private T state;

	public ConcreteOriginator() {
	}

	/**
	 * Getter for originator state;
	 * 
	 * @return the state
	 */
	public T getState() {
		return state;
	}

	/**
	 * Setter for originator state;
	 * 
	 * @param state the state to set
	 */
	public void setState(T state) {
		this.state = state;
	}

	@Override
	public Memento<T> saveState() {
		return new Memento<T>(state);
	}

	@Override
	public void loadState(Memento<T> memento) {
		state = memento.getState();
	}
}
