package es.jc.structural.flyweight;

/**
 * Holds intrinsic data and a reference to a Flyweight object to share common state with other light objects.
 * 
 * @author jsferreras
 */
public class LightObject {

	private String intrinsicState;
	private Flyweight extrinsicState;

	/**
	 * Public constructor.
	 * 
	 * @param intrinsicState
	 * @param extrinsicState
	 */
	public LightObject(String intrinsicState, String extrinsicStateKey) {
		this.intrinsicState = intrinsicState;
		this.extrinsicState = FlyweightFactory.getFlyweight(extrinsicStateKey);
	}

	/**
	 * Prints state.
	 */
	public void printState() {
		System.out.println(intrinsicState + " - " + extrinsicState.getState());
	}

	/**
	 * Getter of extrinsicState. Only for assertion purposes.
	 * 
	 * @return the extrinsicState
	 */
	public Flyweight getExtrinsicState() {
		return extrinsicState;
	}

}
