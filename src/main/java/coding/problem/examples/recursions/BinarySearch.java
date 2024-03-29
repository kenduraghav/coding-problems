package coding.problem.examples.recursions;

/**
 * Binary search with Kunal.
 * 
 */
public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {2,3,4,8,10,12,24,45,48};
		int target = 45;
		System.out.println("" +binarySearch(arr, target));
	}
	
	//returns the index.
	//return -1 if if does not exist
	static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			
			//better way to find mid.
			//find the middle element
			int mid = start + (end - start) / 2;
			
			//if target is less than mid -> search thru the left
			if(target < arr[mid]) {
				end = mid - 1;
			} else if(target > arr[mid]) {
				start = mid + 1; // if target is greater mid element search thru right.
			} else {
				return mid;
			}
					
					
		}
		
		//return -1 if not found;
		return -1;
	}

}
