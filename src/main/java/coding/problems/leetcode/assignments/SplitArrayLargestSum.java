package coding.problems.leetcode.assignments;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		int[] nums = { 7, 2, 5, 10, 8 };
		int k = 2;
		System.out.println(splitArray(nums, k));
	}

	static int splitArray(int[] nums, int m) {

		int start = 0;
		int end = 0;

		for (int num : nums) {
			start = Math.max(start, num); // lower bound
			end += num; // upper bound
		}
		

		System.out.println("Start:" + start);
		System.out.println("End:  " + end);
		// binary search
		while (start < end) {
			int mid = start + (end - start) / 2;

			int sum = 0;
			int pieces = 1; // no. of sub arrays

			// calculate the no.of pieces you can divide into sub array with max sum.
			for (int num : nums) {
				sum += num;
				// if sum exceeds mid, start a new sub array.
				if (sum > mid) {
					sum = num;
					pieces++;
				}
			}
			// If the number of subarrays is less than or equal to k, reduce the upper bound
			if (pieces <= m) {
				end = mid;
			} else {
				// If the number of subarrays is greater than k, increase the lower bound
				start = mid + 1;
			}
		}

		return start; // end also can return coz, both are same.
	}

}
