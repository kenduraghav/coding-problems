package coding.problem.examples.binarysearch;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteSearchArray {

	public static void main(String[] args) {
		int[] arr = IntStream.range(0, 1000).toArray();	
		System.out.println(Arrays.toString(arr));
		int target = 50;
		System.out.println("Target element is at %d index :" + findTarget(arr, target));

	}		
	
	static int findTarget(int [] arr, int target) {
		// first find the range
        // first start with a box of size 2
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			int temp = end + 1;  // this is my new start
			// double the box value
            // end = previous end + sizeofbox*2
			end = end + (end-start+1) * 2;
			
			start = temp;
		}
		return binarySearch(arr, target, start, end);
	}

	// returns the index.
	// return -1 if if does not exist
	static int binarySearch(int[] arr, int target, int start, int end) {

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

		// return -1 if not found;
		return -1;
	}

}
