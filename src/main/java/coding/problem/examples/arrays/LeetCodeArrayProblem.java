package coding.problem.examples.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeArrayProblem {

	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		int[] ans = buildArray(nums);
		System.out.println("Build Array :" + Arrays.toString(ans));

		int[] ans1 = getConcatenation(ans);
		System.out.println("Array Concatenation :" + Arrays.toString(ans1));

		var nums2 = new int[] { 1, 2, 3, 4 };
		int[] ans2 = runningSum(nums2);
		System.out.println("Running Sum :" + Arrays.toString(ans2));

		var nums3 = new int[] { 2, 5, 1, 3, 4, 7 };
		int[] ans3 = shuffleArray(nums3, 3);
		System.out.println("Shuffle Array :" + Arrays.toString(ans3));

		var nums4 = new int[] { 4, 2, 1, 1, 2 };
		var nums5 = new int[] { 12, 1, 12 };
		var nums6 = new int[] { 2, 3, 5, 1, 3 };
		System.out.println("Kids with Candies : " + kidsWithCandies(nums6, 3));

		var nums7 = new int[] { 1, 2, 3, 1, 1, 3 };
		System.out.println("No of Identical Pairs : " + numIdenticalPairs(nums7));

		var nums8 = new int[] { 0, 1, 2, 3, 4 };
		var index = new int[] { 0, 1, 2, 2, 1 };
		int[] targetArray = createTargetArray(nums8, index);
		System.out.println("Target  Array : " + Arrays.toString(targetArray));
	}

	// https://leetcode.com/problems/build-array-from-permutation/
	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}

	// https://leetcode.com/problems/create-target-array-in-the-given-order/description/
	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> target = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			target.add(index[i], nums[i]); // Insert nums[i] at index[i] in target array
		}

		// Convert ArrayList to int[]
		int[] result = new int[target.size()];
		for (int i = 0; i < target.size(); i++) {
			result[i] = target.get(i);
		}

		return result;
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

	// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int maxCandies = 0;
		for (int candy : candies) {
			maxCandies = Math.max(maxCandies, candy); // Find the maximum number of candies
		}

		List<Boolean> result = new ArrayList<>();
		for (int candy : candies) {
			result.add(candy + extraCandies >= maxCandies); // Check if each kid has the greatest number of candies
		}

		return result;
	}

	// https://leetcode.com/problems/number-of-good-pairs/
	static int numIdenticalPairs(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && i < j) {
					count++;
				}
			}
		}
		return count;
	}

	// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] countArr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (j != i && nums[j] < nums[i]) {
					count += 1;
				}
			}
			countArr[i] = count;
		}
		return countArr;
	}

}
