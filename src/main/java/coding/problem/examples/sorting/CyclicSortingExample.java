package coding.problem.examples.sorting;

import java.util.Arrays;

public class CyclicSortingExample {

	public static void main(String[] args) {
		int arr [] = {3,5,2,1,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void cyclicSort(int[] arr) {
		
		int i = 0;
		while(i < arr.length) {
			int index = arr[i] - 1;
			if(arr[i] != arr[index]) {
				swap(arr,i,index);
			} else {
				i++;
			}
		}
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
