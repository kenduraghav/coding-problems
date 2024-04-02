package coding.problems.leetcode.assignments;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {

	public static void main(String[] args) {		
		int [] arr = {0,10,5,2};
		System.out.println(peakIndexInMountainArray(arr));
	}

	static int peakIndexInMountainArray(int[] arr) {
		var low = 0; 
		var high = arr.length - 1;

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

}
