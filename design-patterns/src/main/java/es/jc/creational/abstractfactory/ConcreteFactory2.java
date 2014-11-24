/**
 * 
 */
package es.jc.creational.abstractfactory;

/**
 * [GOF] ConcreteFactory - implements the operations to create concrete product objects (of a concrete kit).
 * 
 * @author JaviCallaghan
 */
public final class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return (new ProductKit2()).new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return (new ProductKit2()).new ConcreteProductB2();
	}

}
