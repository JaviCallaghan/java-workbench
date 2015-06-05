package es.jc.test;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.behavioral.memento.Caretaker;
import es.jc.behavioral.memento.CaretakerIndex;
import es.jc.behavioral.memento.ConcreteOriginator;
import es.jc.behavioral.memento.Originator;
import es.jc.structural.bridge.ConcreteImplementor;
import es.jc.structural.bridge.ConcreteRefinedAbstraction;
import es.jc.structural.bridge.RefinedAbstraction;

/**
 * Test class for Memento behavioral-pattern implementation.<br>
 * The trick is that the client side wants to recover a saved state, unaware of how the persistence mechanism works.
 * 
 * @author JaviCallaghan
 */
public class MementoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## MEMENTO TEST ########\n");
	}

	@Test
	public void testMemento() {

		ConcreteOriginator<String> originator = new ConcreteOriginator<String>();
		Caretaker<String, Integer> caretaker = new CaretakerIndex<String>();
	
		originator.setState("State 1");
		originator.setState("State 2");
		
		System.out.println("Last saved state: " + caretaker.getLast());
		
		caretaker.add(originator.saveState());
		
		originator.setState("State 3");
		
		System.out.println("Current state: " + originator.getState());
		System.out.println("Last saved state: " + caretaker.getLast().getState());
		
		originator.loadState(caretaker.getLast());
		System.out.println("Current state: " + originator.getState());
		System.out.println("Last saved state: " + caretaker.getLast().getState());

	}

}
