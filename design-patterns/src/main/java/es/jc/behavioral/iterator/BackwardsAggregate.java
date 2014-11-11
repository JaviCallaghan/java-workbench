package es.jc.behavioral.iterator;

/**
 * Aggregate to be iterated backwards.<br>
 * No elements management methods have been implemented for simplicity: aggregate elements will be set at construction.
 * 
 * @param <T> type of aggregate elements
 * @author JaviCallaghan
 */
public class BackwardsAggregate<T> implements Aggregate<T> {

	private T[] elements;

	public BackwardsAggregate(T... elements) {
		this.elements = elements;
	}

	/**
	 * {@inheritDoc}<br>
	 * 
	 * @return Backwards strategy iterator.
	 */
	@Override
	public Iterator<T> createIterator() {
		return new BackwardsIterator();
	}

	@Override
	public int size() {
		return elements.length;
	}

	/**
	 * Inner iterator to iterate elements backwards.<br>
	 * Inherited methods to iterate through elements are implemented according to backwards strategy.
	 * 
	 * @param <T> type of aggregate elements
	 * @author JaviCallaghan
	 */
	private class BackwardsIterator implements Iterator<T> {

		private int current;

		public BackwardsIterator() {
			super();
			this.current = elements.length - 1;
		}

		@Override
		public T next() {
			if (current >= 0) {
				return elements[current--];
			} else {
				throw new IndexOutOfBoundsException("Maximum aggregate elements number fetched: " + elements.length);
			}
		}

		@Override
		public boolean hasNext() {
			return current > -1;
		}

	}

}
