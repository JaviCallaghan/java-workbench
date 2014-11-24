package es.jc.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Facade which expects functional interfaces from {@code java.util.function} package as method parameters.<br>
 * Only the basic functions will be considered:
 * <ul>
 * <li>{@link Consumer} - accept(T t):void</li>
 * <li>{@link Function} - apply(T t):R</li>
 * <li>{@link Predicate} - test(T t):boolean</li>
 * <li>{@link Supplier} - get():T</li>
 * </ul>
 * 
 * @author JaviCallaghan
 */
public interface BasicFunctions<T> {

	/**
	 * Accepts parameter according to Consumer implementation.
	 * 
	 * @param parameter to accept
	 * @param consumer with default implementation for accept method
	 */
	void accept(T s, Consumer<T> consumer);

	/**
	 * Applies parameter according to Function implementation.<br>
	 * For simplicity purposes, same type for Function.apply method has been considered both for parameter input and
	 * return output objects.
	 * 
	 * @param parameter to apply
	 * @param function with default implementation for apply method
	 */
	void apply(T s, Function<T, T> function);

	/**
	 * Tests parameter according to Predicate implementation.
	 * 
	 * @param parameter to test
	 * @param function with default implementation for test method
	 */
	void test(T s, Predicate<T> predicate);

	/**
	 * Gets value supplied according to Supplier implementation.
	 * 
	 * @param function with default implementation for get method
	 */
	void get(Supplier<T> supplier);

}
