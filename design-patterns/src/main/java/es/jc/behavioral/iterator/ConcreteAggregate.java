package es.jc.behavioral.iterator;

/**
 * [GOF] ConcreteAggregate - implements the Iterator creation interface to return an instance of the proper
 * ConcreteIterator.<br>
 * Aggregate to be iterated backwards. No elements management methods have been implemented for simplicity: aggregate
 * elements will be set at construction.
 * 
 * @param <T> type of aggregate elements
 * @author JaviCallaghan
 */
public final class ConcreteAggregate<T> implements Aggregate<T> {

	private T[] elements;

	public ConcreteAggregate(T... elements) {
		this.elements = elements;
	}

	/**
	 * {@inheritDoc}<br>
	 * 
	 * @return Backwards strategy iterator.
	 */
	@Override
	public Iterator<T> createIterator() {
		return new ConcreteIterator();
	}

	@Override
	public int size() {
		return elements.length;
	}

	/**
	 * [GOF] ConcreteIterator - implements the Iterator interface. Keeps track of the current position in the
	 * traversal of the aggregate.<br>
	 * Inner iterator to iterate elements backwards. Inherited methods to iterate through elements are implemented
	 * according to backwards strategy.
	 * 
	 * @param <T> type of aggregate elements
	 * @author JaviCallaghan
	 */
	private final class ConcreteIterator implements Iterator<T> {

		private int current;

		public ConcreteIterator() {
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
