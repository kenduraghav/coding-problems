package coding.problem.examples.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequentVisitors {

	public static void main(String[] args) {

		FrequentVisitors solution = new FrequentVisitors();

		int[] visits1 = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 };
		int frequentUser1 = solution.frequentUser(visits1);
		System.out.println("Frequent User: " + frequentUser1); // Expected output: 1

		int[] visits2 = { 5, 0, 5, 0, 5, 0, 5, 0, 1, 1, 1, 1, 1 };
		int frequentUser2 = solution.frequentUser(visits2);
		System.out.println("Frequent User: " + frequentUser2); // Expected output: 5

		int[] visits3 = { 3, 2, 2, 1, 3, 2, 3, 0, 0, 1, 4, 1 };
		int frequentUser3 = solution.frequentUser(visits3);
		System.out.println("Frequent User: " + frequentUser3); // Expected output: -1
	}

	public int frequentUser(int[] visits) {
		HashMap<Integer, Integer> countMap = new HashMap<>();
		int frequentVisitThreshold = visits.length / 4;

		// implement this
		for (int i : visits) {

			if (i != 0) {
				int count = countMap.getOrDefault(i, 0) + 1;
				countMap.put(i, count);
				if (count > frequentVisitThreshold) {
					return i;
				}
			}
		}

		return -1;
	}

}
