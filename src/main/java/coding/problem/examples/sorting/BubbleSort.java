package coding.problem.examples.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] arr = {-9,10,32,-5,1,10,15,20,8,5,3,2,4,16,11};	
		
		int n = arr.length;
		
		System.out.println("Before Sorting	:" + Arrays.toString(arr));
		
		for(int i = 0; i < n-1; i++) {//outer loop controls the no. of runs for inner loop and outer loop must run n-1 times. 
			boolean isSwapped = false;
			for(int j=0; j < n-i-1; j++) { // inner loop that loops thru array
				if (arr[j] > arr[j+1]) { // swap the values if the first element is higher than next value.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped =true;
                }
			}
			if(!isSwapped) {//if no swapping required, exit the loop.
				break;
			}
		}
		
		System.out.println("After Sorting	:" + Arrays.toString(arr));
	}

}
