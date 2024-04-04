package coding.problem.examples.arrays;

import java.util.Arrays;

public class LeetCodeArrayProblem {

	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		int[] ans = buildArray(nums);
		System.out.println(Arrays.toString(ans));

		int[] ans1 = getConcatenation(ans);
		System.out.println(Arrays.toString(ans1));

		var nums2 = new int[] { 1, 2, 3, 4 };
		int[] ans2 = runningSum(nums2);
		System.out.println(Arrays.toString(ans2));

		var nums3 = new int[] { 2, 5, 1, 3, 4, 7 };
		int[] ans3 = shuffleArray(nums3, 3);
		System.out.println(Arrays.toString(ans3));
	}

	// https://leetcode.com/problems/build-array-from-permutation/
	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}

	// https://leetcode.com/problems/concatenation-of-array/
	public static int[] getConcatenation(int[] nums) {

		int n = nums.length;
		int[] ans = new int[2 * n];
		for (int i = 0; i < n; i++) {
			ans[i] = nums[i];
			ans[i + n] = nums[i];
		}

		return ans;
	}

	// https://leetcode.com/problems/running-sum-of-1d-array/description/
	static int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			ans[i] = sum + nums[i];
			sum = ans[i];
		}
		return ans;
	}

	// https://leetcode.com/problems/shuffle-the-array/description/
	static int[] shuffleArray(int[] nums, int n) {

		int[] result = new int[2 * n];
		for (int i = 0; i < n; i++) {
			result[2 * i] = nums[i];
			result[2 * i + 1] = nums[n + i];
		}
		return result;
	}

}
