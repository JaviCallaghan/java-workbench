package es.jc.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Concrete implementation of basic functions usage.<br>
 * Note that implementation relies on sysout calls to simplify business logic.
 * 
 * @author jsferreras
 */
public final class BasicFunctionsString implements BasicFunctions<String> {

	@Override
	public void accept(String s, Consumer<String> consumer) {
		System.out.println("Consumer.accept(" + s + ")");
		consumer.accept(s);
	}

	@Override
	public void apply(String s, Function<String, String> function) {
		System.out.println("Function.apply(" + s + ")");
		System.out.println(function.apply(s));
	}

	@Override
	public void test(String s, Predicate<String> predicate) {
		System.out.println("Predicate.test(" + s + ")");
		System.out.println(predicate.test(s));
	}

	@Override
	public void get(Supplier<String> supplier) {
		System.out.println("Supplier.get()");
		System.out.println(supplier.get());
	}

}
