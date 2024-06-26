package coding.problem.examples.binarysearch;

//kunal --> Finding the missing index to be inserted using binary search
public class CeilingBS {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 8, 10, 12, 24, 45, 48 };
		int target = 13;
		System.out.println("Index to be inserted: " + ceilingBS(arr, target));
	}

	// returns the index.
	// return start if index not found
	static int ceilingBS(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			// better way to find mid.
			// find the middle element
			int mid = start + (end - start) / 2;

			// if target is less than mid -> search thru the left
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1; // if target is greater mid element search thru right.
			} else {
				return mid;
			}

		}

		return start;
	}
}
