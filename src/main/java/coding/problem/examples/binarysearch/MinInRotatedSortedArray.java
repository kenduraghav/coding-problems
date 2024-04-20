package coding.problem.examples.binarysearch;

//from codesignal problem
public class MinInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int findMin(int[] publishDates) {
	    int left = 0, right = publishDates.length - 1;
	    while (left < right) {
	        int mid = left + (right - left) / 2;
	        if (publishDates[mid] > publishDates[right]) {
	            left = mid + 1;
	        } else {
	            right = mid;
	        }
	    }
	    return publishDates[left]; // This is the oldest book's publish date.
	}

}
