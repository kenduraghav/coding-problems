package coding.problem.examples.linearsearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {18,5,12,13,4,1,78,-9,10};
		int target = 5;
		int index = linearSearch(arr, target);
		System.out.println("==============Single Array==================");
		System.out.println("The index of target is :" + index);
		System.out.println("The target element in the array: " + linearSearch2(arr, 12));
		System.out.println("The target element found in the array:" + linearSearch3(arr, 78));
		System.out.println("The target element found in the array:" + linearSearchUsingStream(arr, -9));
		System.out.println("Search In String: " + searchInString("Stop Dengue", 'e'));
		System.out.println("The target element found in the array:" + linearSearchInRange(arr, 1, 2,5));
		System.out.println("The target element found in the array:" + findMinUsingLS(arr));
		
		System.out.println("============2D Array====================");
		
		int [][] mArr = {
				{12,13,5},
				{3,6,8,4},
				{7,0,1}
				};
		int[] in2dArray = linearSearchIn2DArray(mArr,4);
		System.out.println("The target element found in the 2Darray:" + Arrays.toString(in2dArray));
		
	}
	
	private static int findMinUsingLS(int [] arr) {
		int min = arr[0];
		for(int i= 1; i< arr.length; i++) {
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		return min;
	}
	
	private static int linearSearchInRange(int arr[], int target, int start,int end) {
		if (arr.length == 0) {
			return -1;
		} 

		for (int i = start; i <= end; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean linearSearch3(int[] arr, int target) {

		if (arr.length == 0) {
			return false;
		}

		for (int element : arr) {
			if(element == target) {
				return true;
			}
		}
		return false;
	}

	private static int linearSearch2(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}

		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}
		return Integer.MAX_VALUE;
	}

	private static int linearSearch(int[] arr, int target) {

		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	private static int linearSearchUsingStream(int[] arr, int target) {
		
		return IntStream.range(0, arr.length)
			      .filter(i -> arr[i] == target)			      
			      .findFirst()
			      .orElse(-1);
	}
	
	private static boolean searchInString(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		
		for (char element : str.toCharArray()) {
			if(element == target) {
				return true;
			}
		}
		return false;
	}
	
	private static int[] linearSearchIn2DArray(int [][] arr, int target) {
		for(int row=0; row < arr.length; row++) {
			for(int col=0; col < arr[row].length; col++) {
				if(arr[row][col] == target) {
					return new int[]{row,col};
				}
			}
		}
		return new int []{-1,-1};
	}

}
