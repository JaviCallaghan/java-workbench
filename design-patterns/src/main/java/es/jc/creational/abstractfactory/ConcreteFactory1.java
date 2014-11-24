/**
 * 
 */
package es.jc.creational.abstractfactory;

/**
 * [GOF] ConcreteFactory - implements the operations to create concrete product objects (of a concrete kit).
 * 
 * @author JaviCallaghan
 */
public final class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return (new ProductKit1()).new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return (new ProductKit1()).new ConcreteProductB1();
	}

}
