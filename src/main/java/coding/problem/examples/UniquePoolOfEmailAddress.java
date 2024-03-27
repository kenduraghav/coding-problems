package coding.problem.examples;

import java.util.Arrays;
import java.util.HashSet;

public class UniquePoolOfEmailAddress {

	public static void main(String[] args) {
		int[] addresses = { 1, 2, 3, 2, 1, 5, 3, 1, 2, 1, 4, 5, 6 };
		int[] uniqueAddresses = processAddresses(addresses);
		System.out.println(Arrays.toString(uniqueAddresses)); // Returns [1, 2, 3, 5, 4, 6]
	}

	static int[] processAddresses(int[] addresses) {
		HashSet<Integer> set = new HashSet<>();

		// TODO: fill in the set
		if (addresses.length > 0) {
			for (int i = 0; i < addresses.length; i++) {
				set.add(addresses[i]);
			}
		}

		int[] result = new int[set.size()];

		// TODO: fill in the result array
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}

		return result;
	}
}
