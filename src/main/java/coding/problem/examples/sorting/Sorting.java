package coding.problem.examples.sorting;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		
		int arr [] = {5,1,3,2,4};
		int arr1 [] = {5,1,3,6,2,4,};
		selectionSort(arr);
		insertionSort(arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}
	
	private static void insertionSort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr, j, j-1);
				} else {
					break;
				}
			}
			
		}
	}

	private static void selectionSort(int[] arr) {
		//find the max
		for(int i=0; i < arr.length; i++) {
			
			int last = arr.length-i-1; // n-i-1 comparisons. 
			int max = getMaxIndex(arr,0, last); // find the max index.
			swap(arr, max,last); // swap the max and other index in right position.
		}
	}
	
	private static int getMaxIndex(int[] arr, int start, int end) {
		int max = start;
		for(int i= start; i <= end; i++) {
			if(arr[max] < arr[i]) {
				max=i; //returns the max index;
			}
		}
		return max;
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
