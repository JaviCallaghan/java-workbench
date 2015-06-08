package es.jc.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import es.jc.structural.flyweight.ConcreteFlyweight.FlyweightType;

/**
 * [GOF] FlyweightFactory - This class holds references to each of the flyweight objects that have already been created.
 * When the GetFlyweight method is called from client code, these references are checked to determine if an appropriate
 * flyweight is already present. If one is, it is returned. If not, a new object is generated, added to the collection
 * and returned.
 * 
 * @author jsferreras
 */
public class FlyweightFactory {

	private static Map<String, Flyweight> flyweights = new HashMap<>();

	static Flyweight getFlyweight(String key) {
		if ((key != null) && (key.trim().length() > 0)) {
			Flyweight f;
			if ((f = flyweights.get(key)) != null) {
				// if flyweight status for given key already exists, return it
			} else {
				// if flyweight status for given key does not exist yet, add a new one to cache and return it
				FlyweightType type;
				if (Character.isLetter(key.charAt(0))) {
					type = FlyweightType.LETTER;
				} else if (Character.isDigit(key.charAt(0))) {
					type = FlyweightType.NUMBER;
				} else {
					type = FlyweightType.OTHER;
				}
				f = new ConcreteFlyweight(key, type, key.length());
				flyweights.put(key, f);
				System.out.println("Added a new flyweight to cache: " + f.getState());
			}
			return f;
		} else {
			return null;
		}
	}
}
