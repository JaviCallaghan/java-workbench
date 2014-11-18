package es.jc.creational.builder;

/**
 * [GOF] Builder - specifies an abstract interface for creating parts of a part-based object.<br>
 * 
 * @author JaviCallaghan
 */
public interface Builder {

	public void buildNew();

	public void buildPartA();

	public void buildPartB();

	public void buildPartC();

}
