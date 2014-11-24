package es.jc.creational.abstractfactory;

/**
 * Wrapper for product classes of a concrete kit.
 * 
 * @author JaviCallaghan
 */
final class ProductKit1 {
	
	/**
	 * Default constructor. To prevent instantiation out of the factory package.
	 */
	ProductKit1() {
	}
	
	/**
	 * [GOF] ConcreteProduct - defines a product object to be created by the corresponding concrete factory according to
	 * AbstractProduct.
	 * 
	 * @author JaviCallaghan
	 */
	public final class ConcreteProductA1 extends AbstractProductA {

		/**
		 * Default constructor. To prevent instantiation out of the factory package.
		 */
		ConcreteProductA1() {
		}

	}

	/**
	 * [GOF] ConcreteProduct - defines a product object to be created by the corresponding concrete factory according to
	 * AbstractProduct.
	 * 
	 * @author JaviCallaghan
	 */
	public final class ConcreteProductB1 extends AbstractProductB {

		/**
		 * Default constructor. To prevent instantiation out of the factory package.
		 */
		ConcreteProductB1() {
		}

	}

}
