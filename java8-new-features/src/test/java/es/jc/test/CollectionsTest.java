package es.jc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * Collections tests.
 * 
 * @author JaviCallaghan
 */
public class CollectionsTest {

	public CollectionsTest() {
	}

	@Test
	public void testListIterationStreams() {

		List<String> words = new ArrayList<>();
		words.addAll(Arrays.asList("UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
				"DIEZ"));
		List<String> vowels = Arrays.asList("A", "E", "I", "O", "U");

		int v = 0;
		while (!words.isEmpty()) {
			String currentVowel = vowels.get(v);
			System.out.println("Palabras que contienen: " + currentVowel);
			List<String> currentVowelWords = words.stream().filter(w -> w.contains(currentVowel))
					.peek(w -> System.out.println("   " + w))
					.collect(Collectors.toList());
			words.removeAll(currentVowelWords);
			System.out.println("... quedan " + Arrays.toString(words.toArray()));
			// next vowel
			v++;
		}

	}

	@Test
	public void testListIterationIterator() {

		List<String> literals = Arrays.asList("UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO",
				"NUEVE", "DIEZ");
		List<String> words = new ArrayList<>(literals);
		List<String> vowels = Arrays.asList("A", "E", "I", "O", "U");

		int v = 0;
		while (!words.isEmpty()) {
			String currentVowel = vowels.get(v);
			System.out.println("Palabras que contienen: " + currentVowel);
			Iterator<String> itWords = words.iterator();
			while (itWords.hasNext()) {
				String currentWord = itWords.next();
				if (currentWord.contains(currentVowel)) {
					System.out.println("   " + currentWord);
					itWords.remove();
				}
				// else, skip current word
			}
			System.out.println("... quedan " + Arrays.toString(words.toArray()));
			// next vowel
			v++;
		}

		System.out.println("\nInicialmente: " + Arrays.toString(literals.toArray()));

	}

	@Test
	public void testListComplexCollect() {

		List<String> allWords = Arrays.asList("UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO",
				"NUEVE",
				"DIEZ");
		List<String> requestedWords = Arrays.asList("UNO", "UNO", "CIEN", "CINCO");

		// we want a list with all the words in requestedWords that are in allWords, so null be inserted when word is
		// not found

		ArrayList<String> resultingWords = requestedWords.stream().collect(
				ArrayList::new,
				(resultList, element) -> {
					if (allWords.contains(element)) {
						resultList.add(element);
					} else {
						resultList.add(null);
					}
				},
				ArrayList::addAll);

		resultingWords.forEach((w) -> System.out.println(w));

	}
}
