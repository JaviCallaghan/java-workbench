package es.jc.creational.builder;

import java.util.concurrent.ThreadLocalRandom;

/**
 * [GOF] ConcreteBuilder - constructs parts of the product, implementing Builder interface. Defines and keeps track of
 * the Product and provides an interface for retrieving it.<br>
 * Note that it holds a concrete Product instance to be built and retrieved.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteBuilder implements Builder {

	private Product product;

	public ConcreteBuilder() {
		super();
		product = new Product();
	}

	@Override
	public void buildNew() {
		product = new Product();
	}

	@Override
	public void buildPartA() {
		product.getPartsA().add(new String(Character.toChars(ThreadLocalRandom.current().nextInt(65, 91))));
	}

	@Override
	public void buildPartB() {
		product.getPartsB().add(ThreadLocalRandom.current().nextInt(10));
	}

	@Override
	public void buildPartC() {
		product.setPartC(true);
	}

	public Product getProduct() {
		return product;
	}

}
