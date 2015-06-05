package es.jc.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * [GOF] CaretakerIndex - implements a concrete caretaker, based on sequential index.<br>
 * 
 * @author jsferreras
 * @param <T> type of memento state
 */
public class CaretakerIndex<T> implements Caretaker<T, Integer> {

	private List<Memento<T>> mementos;

	public CaretakerIndex() {
		this.mementos = new ArrayList<Memento<T>>();
	}

	@Override
	public void add(Memento<T> state) {
		mementos.add(state);
	}

	@Override
	public Memento<T> get(Integer key) {
		return mementos.get(key);
	}

	@Override
	public Memento<T> getLast() {
		if (mementos.size() > 0) {
			return get(mementos.size() - 1);
		} else {
			return null;
		}
	}

}
