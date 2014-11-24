/**
 * 
 */
package es.jc.behavioral.visitor;

/**
 * [GOF] ConcreteElement - implements an operation that takes a visitor as an argument.<br>
 * Note that the visitor parameter actually visits the current element.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteElement implements Element {

	@Override
	public void accept(Visitor<Element> visitor) {
		visitor.visit(this);
	}

}
