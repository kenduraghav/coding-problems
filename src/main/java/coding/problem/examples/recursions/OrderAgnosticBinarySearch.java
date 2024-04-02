package coding.problem.examples.recursions;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {

//		int [] arr = {2,3,4,8,10,12,24,45,48};
//		int[] arr = { 78, 45, 35, 20, 15, 8, 5, 2, -1, -5, -8, -10 };
		
		int[] arr = { 2,1};
		int target = 1;
		System.out.println("Index is: " + orderAgnosticBS(arr, target));
	}

	static int orderAgnosticBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			// check if array is sorted in ascending or descending order.
			boolean isAsc = arr[start] < arr[end];
			// better way to find mid.
			// find the middle element
			int mid = start + (end - start) / 2;

			if (target == arr[mid])
				return mid;

			if (isAsc) {
				if (target < arr[mid]) {
					// if target is less than mid -> search thru the left
					end = mid - 1;
				} else {
					start = mid + 1; // if target is greater mid element search thru right.
				}
			} else {
				if (target > arr[mid]) {
					// if target is less than mid -> search thru the left
					end = mid - 1;
				} else {
					start = mid + 1; // if target is greater mid element search thru right.
				}
			}

		}

		// return -1 if not found;
		return -1;
	}

}
