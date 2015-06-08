/**
 * 
 */
package es.jc.structural.flyweight;

/**
 * [GOF] ConcreteFlyweight - provides the functionality and stateless information (extrinsic state) shared amongst other
 * objects.
 * 
 * @author jsferreras
 */
public class ConcreteFlyweight implements Flyweight {

	private String stateString;
	private FlyweightType stateType;
	private Integer stateInteger;

	/**
	 * Inner type.
	 * 
	 * @author jsferreras
	 */
	enum FlyweightType {
		LETTER, NUMBER, OTHER;
	}
	
	/**
	 * Public constructor.
	 * @param stateString the string part of the state
	 * @param stateType the type part of the state
	 * @param stateInteger the integer part of the state
	 */
	public ConcreteFlyweight(String stateString, FlyweightType stateType, Integer stateInteger) {
		this.stateString = stateString;
		this.stateType = stateType;
		this.stateInteger = stateInteger;
	}

	/**
	 * {@inheritDoc}<br>
	 */
	@Override
	public String getState() {
		return stateString + " : " + stateType + " : " + stateInteger;
	}

}
