package es.jc.creational.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * [GOF] Product - represents the complex object under construction. Includes interfaces for assembling the parts.
 * 
 * @author JaviCallaghan
 */
public final class Product {

	private List<String> partsA;
	private Set<Integer> partsB;
	private Boolean partC;
	
	public Product() {
		super();
		this.partsA = new ArrayList<>();
		this.partsB = new HashSet<>();
		this.partC = null;
	}
	
	public List<String> getPartsA() {
		return partsA;
	}

	public Set<Integer> getPartsB() {
		return partsB;
	}

	public void setPartC(Boolean partC) {
		this.partC = partC;
	}

	@Override
	public String toString() {
		return "Product [partsA=" + Arrays.toString(partsA.toArray())
				+ ", partsB=" + Arrays.toString(partsB.toArray()) + ", partC=" + partC + "]";
	}
	
}
