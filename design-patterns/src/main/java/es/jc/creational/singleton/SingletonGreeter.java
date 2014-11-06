package es.jc.creational.singleton;

/**
 * Singleton class.<br>
 * Note that it has private constructor to prevent it to be instantiated from outside. Provides method to return the
 * unique static instance of this class held inside it and instantiated from inside at first request.
 * 
 * @author JaviCallaghan
 */
public class SingletonGreeter {
	
	/** Static instance of this class. */
	private static SingletonGreeter instance = null;

	/**
	 * Private constructor to prevent external instantiation.
	 */
	private SingletonGreeter() {
	}

	/**
	 * Instance request method which always returns the same singleton static instance.
	 * @return the singleton instance (instantiates it if it is not initialized at first call)
	 */
	public static SingletonGreeter getInstance() {
		if (instance == null) {
			// if first request, initialize static instance
			instance = new SingletonGreeter();
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
