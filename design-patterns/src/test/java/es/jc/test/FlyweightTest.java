package es.jc.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import es.jc.structural.flyweight.LightObject;

/**
 * Test class for Flyweight structural-pattern implementation.<br>
 * The trick is that the client side requests several instances of objects with common state modelled as a common
 * flyweight object, saving memory space for that shared data.
 * 
 * @author JaviCallaghan
 */
public class FlyweightTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n######## FLYWEIGHT TEST ########\n");
	}

	@Test
	public void testFlyweight() {

		// instantiate and print several light objects
		LightObject lo1 = new LightObject("lo1", "alpha");
		lo1.printState();
		LightObject lo2 = new LightObject("lo2", "2ravo");
		lo2.printState();
		LightObject lo3 = new LightObject("lo3", "1lpha");
		lo3.printState();
		LightObject lo4 = new LightObject("lo4", "charlie");
		lo4.printState();
		LightObject lo5 = new LightObject("lo5", "2ravo");
		lo5.printState();
		assertTrue(lo5.getExtrinsicState() == lo2.getExtrinsicState());
		LightObject lo6 = new LightObject("lo6", "charlie");
		lo6.printState();
		assertTrue(lo6.getExtrinsicState() == lo4.getExtrinsicState());
		LightObject lo7 = new LightObject("lo7", "delta");
		lo7.printState();
		LightObject lo8 = new LightObject("lo8", "bravo");
		lo8.printState();
		LightObject lo9 = new LightObject("lo9", "alpha");
		lo9.printState();
		assertTrue(lo9.getExtrinsicState() == lo1.getExtrinsicState());
		LightObject loA = new LightObject("loA", "alpha");
		loA.printState();
		assertTrue(loA.getExtrinsicState() == lo9.getExtrinsicState());
		LightObject loB = new LightObject("loB", "1lpha");
		loB.printState();
		assertTrue(loB.getExtrinsicState() == lo3.getExtrinsicState());
		LightObject loC = new LightObject("loC", "delta");
		loC.printState();
		assertTrue(loC.getExtrinsicState() == lo7.getExtrinsicState());

		// note by sysouts, that only a few heavy states are stored
		// note by asserts that extrinsic states of reused flyweight refer to the same object references
	}

}
