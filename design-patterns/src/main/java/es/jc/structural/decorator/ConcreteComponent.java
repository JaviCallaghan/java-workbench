package es.jc.structural.decorator;

/**
 * [GOF] ConcreteComponent - Defines an object to which additional responsibilities can be attached.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteComponent implements Component {

	@Override
	public void foo() {
		System.out.println("Component [" + this.hashCode() + "]");
	}

}
