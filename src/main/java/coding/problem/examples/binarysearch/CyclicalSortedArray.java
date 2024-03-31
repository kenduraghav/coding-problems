package coding.problem.examples.binarysearch;

public class CyclicalSortedArray {

	public static void main(String[] args) {
		int[] nums = new int[] { 4, 3, 2, 1, 7, 6, 5 };
		System.out.println(findMax(nums)); // Output: 7

		int[] nums2 = new int[] { 3, 2, 1 };
		System.out.println(findMax(nums2)); // Output: 3

		int[] nums3 = new int[] { 6, 5, 4, 3, 2, 1, 7 };
		System.out.println(findMax(nums3)); // Output: 7
	}

	static int findMax(int arr[]) {
		int low = 0, high = arr.length - 1;
		// TODO: implement this
		while (low < high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] > arr[high]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return arr[low];
	}
	
	
//	public static void main(String[] args) {
//        int[] nums3 = new int[] { 6, 5, 4, 3, 2, 1, 7 };
//
//        // Initialize left and right pointers
//        int left = 0;
//        int right = nums3.length - 1;
//        
//        // Perform binary search4=
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            
//            // If the element at mid is greater than the next element,
//            // maximum must be in the left half, update right pointer
//            if (nums3[mid] > nums3[mid + 1]) {
//                right = mid;
//            } else {
//                // Otherwise, maximum must be in the right half, update left pointer
//                left = mid + 1;
//            }
//        }
//        
//        // At the end of the loop, left pointer points to the maximum value
//        int max = nums3[left];
//        
//        // Print the maximum value
//        System.out.println("The maximum value in the array is: " + max);
//    }
}
