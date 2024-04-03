package coding.problem.examples.basics;

import java.util.Arrays;

public class SwapReverseMaxInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,6,7,0};
		int index1 = 2, index2= 5;
		swap(arr, index1, index2);
		System.out.println("Swapping array:" +Arrays.toString(arr));
		System.out.println("Maximum array: " + max(arr));
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
