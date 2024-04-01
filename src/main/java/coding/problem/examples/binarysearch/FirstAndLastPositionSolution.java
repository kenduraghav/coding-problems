package coding.problem.examples.binarysearch;

import java.util.Arrays;

/**
 * Binary search with Kunal.
 * 
 */
public class FirstAndLastPositionSolution {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7,7,7, 8, 8, 10 };
		int target = 7;
		int range[] = searchRange(arr, target);
		System.out.println("" + Arrays.toString(range));
		
	}

	// returns the index.
	// return -1 if if does not exist
	static int[] searchRange(int[] nums, int target) {
		int[] range = { -1, -1 };
		range[0] = search(nums, target, true);
		range[1] = search(nums, target, false);
		return range;
	}

	private static int search(int[] nums, int target, boolean isFirstIndex) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		while (start <= end) {

			int mid = start + (end - start) / 2;

			// if target is less than mid -> search thru the left
			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1; // if target is greater mid element search thru right.
			} else {
				ans = mid;
				if(isFirstIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
