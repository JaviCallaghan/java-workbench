package es.jc.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import es.jc.stream.Person;
import es.jc.stream.Role;

/**
 * Streams tests.
 * 
 * @author JaviCallaghan
 */
public class StreamsTest {

	public StreamsTest() {
	}

	@Test
	public void testStringListStream() {

		List<String> result = Collections.emptyList();

		final Collection<String> roster = Arrays.asList("Alpha", null, "Charlie");
		System.out.println("\nInitial roster elements: " + roster.size());
		result = roster.stream()
				.peek(t -> System.out.println(t))
				.filter(t -> (t != null))
				.collect(Collectors.toList());
		System.out.println("\nNonnull elements: " + result.size());
		result.forEach(t -> System.out.println(t));

		result = result.stream()
				.map(t -> t.replaceAll("[Aa]", "@"))
				.collect(Collectors.toList());
		System.out.println("\nTransformed elements: " + result.size());
		result.forEach(t -> System.out.println(t));
	}

	@Test
	public void testEnumListStream() {

		List<Role> result = Collections.emptyList();

		final Collection<Role> roster = Arrays.asList(Role.WARRIOR, null, Role.WIZARD, Role.WARRIOR, Role.WIZARD,
				Role.ROGUE, Role.WARRIOR, Role.WARRIOR);
		System.out.println("\nInitial roster elements: " + roster.stream().count());
		result = roster.stream()
				.peek(t -> System.out.println(t))
				.filter(t -> (t != null))
				.collect(Collectors.toList());
		System.out.println("\nNonnull elements: " + result.size());
		result.forEach(t -> System.out.println(t));

		result = result.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("\nDistinct elements: " + result.size());
		result.forEach(t -> System.out.println(t));
	}

	@Test
	public void testObjectListStream() {

		List<Person> result = Collections.emptyList();

		final Collection<Person> roster = Arrays.asList(new Person("Alpha", Role.WARRIOR, 5),
				null,
				new Person("Bravo", Role.WIZARD, 3),
				new Person("Charlie", Role.WIZARD, 3),
				new Person("Delta", Role.WARRIOR, 1),
				new Person("Echo", Role.ROGUE, 2));
		System.out.println("\nInitial roster elements: " + roster.stream().count());
		result = roster.stream()
				.peek(t -> System.out.println(t))
				.filter(t -> (t != null))
				.collect(Collectors.toList());
		System.out.println("\nNonnull elements: " + result.size());
		result.forEach(t -> System.out.println(t));

		result = result.stream()
				.sorted((t, s) -> (t.getLevel() < s.getLevel()) ? 1 : ((t.getLevel() == s.getLevel()) ? 0 : -1))
				.collect(Collectors.toList());
		System.out.println("\nOrdered from higher to lower level:");
		result.forEach(t -> System.out.println(t));

		System.out.println("\nAverage level: " + result.stream()
				.mapToInt(t -> t.getLevel())
				.average().orElse(0));
	}
	
}
