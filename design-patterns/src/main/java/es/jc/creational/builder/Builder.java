package es.jc.creational.builder;

/**
 * [GOF] Builder - specifies an abstract interface for creating parts of a part-based object.
 * 
 * @author JaviCallaghan
 */
public interface Builder {

	/**
	 * Public constructor.
	 */
	public void buildNew();

	/**
	 * Method to build a product part.
	 */
	public void buildPartA();

	/**
	 * Method to build a product part.
	 */
	public void buildPartB();

	/**
	 * Method to build a product part.
	 */
	public void buildPartC();

}
