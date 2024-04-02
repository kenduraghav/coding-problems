package coding.problems.leetcode.assignments;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
		
		int case1[] = {4,5,6,7,0,1,2};
		System.out.println(obj.search(case1, 0));
		
		int case2[] = {4,5,6,7,0,1,2};
		System.out.println(obj.search(case2, 3));
		
		int case3[] = {2,1,0};
		System.out.println(obj.search(case3, 1));
		
	}

	int search(int[] arr, int target) {

		int pivot = findPivot(arr);
		if (pivot == -1) {
			return binarySearch(arr, target, 0, arr.length - 1);
		}

		if (arr[pivot] == target) {
			return pivot;
		}

		if (target >= arr[0]) {
			return binarySearch(arr, target, 0, pivot - 1);
		}

		return binarySearch(arr, target, pivot + 1, arr.length - 1);

	}

	int findPivot(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	int binarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
