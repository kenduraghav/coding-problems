package coding.problems.leetcode.assignments;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int[] twoSum = twoSum(numbers, 9);
		System.out.println(Arrays.toString(twoSum));

		int[] numbers1 = { -1, 0 };
		int[] twoSum1 = twoSum(numbers1, -1);
		System.out.println(Arrays.toString(twoSum1));

		int[] numbers2 = { 2, 3, 4 };
		int[] twoSum2 = twoSum(numbers2, 6);
		System.out.println(Arrays.toString(twoSum2));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;

		while (start <= end) {
			if (numbers[start] + numbers[end] == target) {
				return new int[] { start + 1, end + 1 };
			} else if (numbers[start] + numbers[end] > target) {
				end--;
			} else {
				start++;
			}
		}

		return new int[] { -1, -1 };
	}

}
