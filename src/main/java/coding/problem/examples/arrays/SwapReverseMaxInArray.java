package coding.problem.examples.arrays;

import java.util.Arrays;

public class SwapReverseMaxInArray {

	public static void main(String[] args) {
		
		int arr[] = {-100,1,3,-1,4,6,7,0};
		swap(arr, 2, 5);
		System.out.println("Swapping array:" +Arrays.toString(arr));
		System.out.println("Maximum array: " + max(arr));
		System.out.println("Mininum in array: " + min(arr));
		reverse(arr);
		System.out.println("Reversing Array:" +Arrays.toString(arr));
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	private static int max(int[] arr) {
		int max = arr[0];
		for(int i= 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	private static int min(int[] arr) {
		int min = arr[0];
		for(int i= 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min=arr[i];
			}
		}
		return min;
	}
	
	
	private static void reverse(int [] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		
	}

}
