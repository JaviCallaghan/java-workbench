package es.jc.creational.singleton;

/**
 * [GOF] Singleton - defines an Instance operation that lets client side access its unique instance. May be responsible
 * for creating its own unique instance.<br>
 * Note that it has private constructor to prevent it to be instantiated from outside. Provides method to return the
 * unique static instance of this class held inside it and instantiated from inside at first request.
 * 
 * @author JaviCallaghan
 */
public final class Singleton {

	/**
	 * Static instance of this class.
	 */
	private static Singleton instance = null;

	/**
	 * Private constructor to prevent external instantiation.
	 */
	private Singleton() {
	}

	/**
	 * Instance request method which always returns the same singleton static instance.
	 * 
	 * @return the singleton instance (instantiates it if it is not initialized at first call)
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			// if first request, initialize static instance
			instance = new Singleton();
		}
		// else, return already initialized instance
		return instance;
	}

}
