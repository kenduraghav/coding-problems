package coding.problems.leetcode.assignments;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinInRotatedSortedArray {
	
	
	public static void main(String[] args) {
		
		int arr[] = {3,4,5,6,7,0,1,2};
		//int pivot = findPivot(arr);
		System.out.println(findMin(arr));
	}
	
	static int findMin(int[] arr) {
		// return -1 if not found;
		int pivot = findPivot(arr);
		if(pivot == -1) {
			return arr[0];
		} else {
			return arr[pivot+1];
		}
    }
	
	static int findPivot(int arr[]) {
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
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
	}
}
