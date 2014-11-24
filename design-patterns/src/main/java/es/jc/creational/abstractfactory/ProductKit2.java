package es.jc.creational.abstractfactory;

/**
 * Wrapper for product classes of a concrete kit.
 * 
 * @author JaviCallaghan
 */
final class ProductKit2 {
	
	/**
	 * Default constructor. To prevent instantiation out of the factory package.
	 */
	ProductKit2() {
	}
	
	/**
	 * [GOF] ConcreteProduct - defines a product object to be created by the corresponding concrete factory according to
	 * AbstractProduct.
	 * 
	 * @author JaviCallaghan
	 */
	public final class ConcreteProductA2 extends AbstractProductA {

		/**
		 * Default constructor. To prevent instantiation out of the factory package.
		 */
		ConcreteProductA2() {
		}

	}

	/**
	 * [GOF] ConcreteProduct - defines a product object to be created by the corresponding concrete factory according to
	 * AbstractProduct.
	 * 
	 * @author JaviCallaghan
	 */
	public final class ConcreteProductB2 extends AbstractProductB {

		/**
		 * Default constructor. To prevent instantiation out of the factory package.
		 */
		ConcreteProductB2() {
		}

	}

}
