package coding.problems.leetcode.assignments;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
//With Duplicate values
public class SearchInRotatedSortedArrayTwo {

	public static void main(String[] args) {
		int [] case1= {2,5,6,0,0,1,2};
		System.out.println(search(case1,0));
		
		
		int [] case2= {1};
		System.out.println(search(case2,1));
	}
	
	static boolean search(int[] arr, int target) {
		
//		if(arr.length == 1) {
//			return arr[0] == target;
//		}
		
		int pivot = findPivotWithDuplicates(arr);
		if (pivot == -1) {
			return binarySearch(arr, target, 0, arr.length - 1) >= 0;
		}

		if (arr[pivot] == target) {
			return arr[pivot] == target;
		}

		if (target >= arr[0]) {
			return binarySearch(arr, target, 0, pivot - 1) >= 0;
		}

		return binarySearch(arr, target, pivot + 1, arr.length - 1) >= 0;
		
	}
	
	
	static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
	
	static int binarySearch(int[] arr, int target, int start, int end) {

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
