package learn.dsa.week01.day01.arrays;

public class ArrayUtils {
	
	public void reverse(int [] arr) {
		//Take array length;
		//swap elements from left to right one by one until the start of the array.
		
		if(arr == null || arr.length <= 1) return;
		
		int left = 0;
		int right = arr.length -1;
		
		while(left < right) {
			swap(arr, left, right);
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
	
	
	public void moveZeros(int [] arr) {
		if(arr == null || arr.length <= 1) return;
		
		if(arr.length == 1) 
			return;
		
		
		int insertPosition = 0;
		for(int num: arr) {
			if(num != 0) {
				arr[insertPosition++] = num;
			}
		}
		
		while(insertPosition < arr.length) {
			arr[insertPosition++] = 0;
		}
	}
	
	public int removeDuplicates(int [] arr) {
		if(arr == null || arr.length < 1) { return 0; }
		
		if(arr.length == 1) { return arr.length;}
		
		int i = 0;  // slow pointer - where the next unique value goes

	    for (int j = 1; j < arr.length; j++) {
	        if (arr[j] != arr[i]) {
	            i++;
	            arr[i] = arr[j]; // overwrite duplicate
	        }
	    }

	    return i + 1; // new length = index + 1
	}

	private void swap(int[] arr, int left, int right) {
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}
}
