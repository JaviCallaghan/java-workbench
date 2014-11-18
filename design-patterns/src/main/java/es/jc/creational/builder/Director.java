/**
 * 
 */
package es.jc.creational.builder;

/**
 * [GOF] Director - constructs an object using the Builder interface.<br>
 * Note that it knows the algorithm to build parts, but not how they are built inside.
 * 
 * @author JaviCallaghan
 */
public final class Director {
	
	public static void createProduct(Builder builder) {
		// create new building
		builder.buildNew();
		// build 4 A parts
		for (int i = 0; i < 4; i++) {
			builder.buildPartA();
		}
		// build C part
		builder.buildPartC();
		// build 3 B parts
		for (int i = 0; i < 3; i++) {
			builder.buildPartB();
		}
	}

}
