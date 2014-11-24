package es.jc.creational.abstractfactory;

/**
 * [GOF] AbstractFactory - declares an interface for operations that create abstract product objects.
 * 
 * @author JaviCallaghan
 */
public interface AbstractFactory {

	/**
	 * Creates a product A of a specific kit.
	 * 
	 * @return a product of a specific type from a specific kit
	 */
	AbstractProductA createProductA();

	/**
	 * Creates a product A of a specific kit.
	 * 
	 * @return a product of a specific type from a specific kit
	 */
	AbstractProductB createProductB();

}
