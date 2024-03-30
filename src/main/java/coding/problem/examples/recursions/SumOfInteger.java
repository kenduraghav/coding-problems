package coding.problem.examples.recursions;

import java.util.Arrays;

public class SumOfInteger {

	public static void main(String[] args) {
//		System.out.println("The Sum of Integer:" + sumOfInteger(5858));
		boolean abs = Math.abs(-2) < Math.abs(-4);
		System.out.println("Math.abs " + abs );
		int [] arr = {-9,95,85,4,51};
		int target = 42;
		Arrays.sort(arr);
		int index = flooringBS(arr, target);
		if(index !=-1) {
			System.out.println("First Index: " +arr[index+1]);
		} else {
			System.out.println("No item found:" + index);
		}
		
		System.out.println(Math.abs(-2));
//		System.out.println(Math.abs(4));
	}

	private static int sumOfInteger(int i) {
		if(i < 10) {
			return i;
		} else {
			return i % 10 + sumOfInteger(i / 10);
		}
		
	}
	
	
	static int flooringBS(int[] arr, int target) {

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

		return end;
	}
	
	
	

}
