package coding.problem.examples.binarysearch;

/*
 * BitonicArray Sorting using Binary Search -> Advance binary search algorithm
 * From CodeSignal
 */
public class BitonicArrayBinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,3,1 };
		int x = 3;
		int position = findPosition(arr, x);
		if (position == -1) {
			System.out.println("Element Not Present");
		} else {
			System.out.println("Element Present at Index " + position);
		}
	}

	public static int findPosition(int arr[], int target) {
		// TODO: find peak
		int peakIndex = findPeak(arr);
		// TODO: search to the left of the peak
		// TODO: search to the right of the peak

		int searchResult = binarySearch(arr, target, 0, peakIndex, true);

		if (searchResult != -1) {

			return searchResult;

		} else {

			return binarySearch(arr, target, peakIndex+1, arr.length - 1, false);

		}
	}

	static int findPeak(int arr[]) {
		int low = 0, high = arr.length - 1;
		// TODO: implement this
		while (low < high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] > arr[mid + 1]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	static int binarySearch(int arr[], int x, int low, int high, boolean ascending) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (ascending) {
				if (arr[mid] < x) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				// TODO: implement the descending binary search logic
				if (arr[mid] > x) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}

}
