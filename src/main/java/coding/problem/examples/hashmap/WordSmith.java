package coding.problem.examples.hashmap;

import java.util.HashMap;

/*
 * ```
 * Imagine you're a wordsmith astronaut needing to catalog words in alien languages. 
 * We'd create a tool - a HashMap! It maps unique words in any sentence to their frequency of appearance. 
 * Just like you'd document "blorp" shows up 3 times to know it's a common word. Here's a friendly rubric: 
 * Create a function taking a sentence as input (a string of English words separated by spaces, could be empty) 
 * and returning a HashMap. Each key is a unique word (case insensitive), 
 * and its value is the count of how often it appeared. Impressive, eh?
 * ```
 * 
 */
public class WordSmith {

	public static void main(String[] args) {
		String sentence1 = "Hello Hello world world world";
		HashMap<String, Integer> index1 = createWordIndex(sentence1);
		index1.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); // Should print: (hello -> 2), (world
																					// -> 3)
		System.out.println("----");

		String sentence2 = "";
		HashMap<String, Integer> index2 = createWordIndex(sentence2);
		index2.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); // Should print nothing as the
																					// sentence is empty.
		System.out.println("----");

		String sentence3 = "Quick Quick brown fox jumps over the lazy dog";
		HashMap<String, Integer> index3 = createWordIndex(sentence3);
		index3.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")"));
		// Should print: (over -> 1), (the -> 1), (quick -> 2), (lazy -> 1), (jumps ->
		// 1), (brown -> 1), (dog -> 1), (fox -> 1)
		System.out.println("----");
	}

	public static HashMap<String, Integer> createWordIndex(String sentence) {
		HashMap<String, Integer> index = new HashMap<>();

		String[] words = sentence.split("\\s+");
		// implement this
		if(!sentence.isBlank()) {
			for (String word : words) {
				index.put(word, index.getOrDefault(word, 0) + 1);
			}
		}
		
		return index;
	}

}
