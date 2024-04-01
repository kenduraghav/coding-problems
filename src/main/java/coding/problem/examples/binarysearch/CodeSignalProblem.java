package coding.problem.examples.binarysearch;

import java.util.Arrays;

public class CodeSignalProblem {

	public static void main(String[] args) {

		int[] arr = { -9,95,85,4,51};

		int threshold = 42;

		Arrays.sort(arr);
		
		System.out.println("Next Element > than threshold:" + nextGreatestElement(arr, threshold));
	}

	static int nextGreatestElement(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			// better way to find mid.
			// find the middle element
			int mid = start + (end - start) / 2;

			// if target is less than mid -> search thru the left
			if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1; // if target is greater mid element search thru right.
			}

		}

		return nums[start % nums.length];
	}

}
