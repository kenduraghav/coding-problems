package coding.problems.leetcode.assignments;

// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {

	public static void main(String[] args) {
		
		int nums1 [] = {1,3,5,6};
		System.out.println("Index found or to be inserted: " + searchInsert(nums1,5));
		
		int nums2 [] = {1,3,5,6};
		System.out.println("Index found or to be inserted: " + searchInsert(nums2,2));
		
		int nums3 [] = {1,3,5,6};
		System.out.println("Index found or to be inserted: " + searchInsert(nums3,7));
		
		
	}

	static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		//using binary search -> since sorted array.
		while (start <= end) {
			//finding the mid position
			int mid = start + (end - start) / 2;
			
			// if mid and target equal return mid
			if (nums[mid] == target)
				return mid;

			if (target < nums[mid]) {
				//search thru left half of the array
				end = mid - 1;
			} else {
				//search thru right of the array.
				start = mid + 1;
			}

		}
		// instead of -1 when element not found 
		// return the position where to be inserted.
		return start; 
	}

}
