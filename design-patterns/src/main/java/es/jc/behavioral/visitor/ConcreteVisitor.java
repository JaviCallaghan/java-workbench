package es.jc.behavioral.visitor;

/**
 * [GOF] ConcreteVisitor - implements each visit operation for a concrete element type.<br>
 * Note that it also holds a traversal status, although it is optional.
 * 
 * @author JaviCallaghan
 */
public final class ConcreteVisitor implements Visitor<Element> {

	/**
	 * Traversal status to be held through iteration.
	 */
	private int count;
	
	/**
	 * Public constructor to initialize status.
	 */
	public ConcreteVisitor() {
		count = 0;
	}
	
	@Override
	public void visit(Element element) {
		System.out.println("ElementVisitor [" + ++count + ": " + element.toString() + "]");
		
	}
	
	public int getCount() {
		return count;
	}

}
