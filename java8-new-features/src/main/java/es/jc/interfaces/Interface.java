package es.jc.interfaces;

public interface Interface {

	void foo();
	
	default void bar() {
		System.out.println("bar " + getDefault());
	}
	
	static String getDefault() {
		return "default";
	}
	
}
