package learn.dsa.week01.day01.arrays;

public class ArrayUtils {
	
	public void reverse(int [] arr) {
		//Take array length;
		//swap elements from left to right one by one until the start of the array.
		
		if(arr == null || arr.length <= 1) return;
		
		int left = 0;
		int right = arr.length -1;
		
		while(left < right) {
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
		}
	}
	
	
	public int findMax(int [] arr) {
		if(arr == null || arr.length == 0) throw new IllegalArgumentException("Array is null or empty");
		
		int max = arr[0];
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public boolean isSortedAscending(int[] arr) {
		if(arr == null || arr.length <= 1) return true;
		
		for(int i = 0 ; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			} 
		}
		return true;
	}
	
	
	public int sum(int [] arr) {
		if(arr == null) throw new IllegalArgumentException("Array is null");
		int sum = 0;
		for(int i = 0;  i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
