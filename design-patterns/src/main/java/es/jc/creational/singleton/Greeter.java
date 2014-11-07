package es.jc.creational.singleton;

/**
 * Singleton class.<br>
 * Note that it has private constructor to prevent it to be instantiated from outside. Provides method to return the
 * unique static instance of this class held inside it and instantiated from inside at first request.
 * 
 * @author JaviCallaghan
 */
public final class Greeter {
	
	/** Static instance of this class. */
	private static Greeter instance = null;

	/**
	 * Private constructor to prevent external instantiation.
	 */
	private Greeter() {
	}

	/**
	 * Instance request method which always returns the same singleton static instance.
	 * @return the singleton instance (instantiates it if it is not initialized at first call)
	 */
	public static Greeter getInstance() {
		if (instance == null) {
			// if first request, initialize static instance
			instance = new Greeter();
		}
		// else, return already initialized instance
		return instance;
	}

	/**
	 * Business logic method: Simple greeting.
	 */
	public void greet(String name) {
		System.out.println("Hello " + name + "!! (from " + this + " == " + instance + ")");
	}
}
