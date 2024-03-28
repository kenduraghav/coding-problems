package coding.problem.examples.recursions;

public class BinarySearchProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] bookIds =  {101, 203, 307, 404, 513, 628, 734, 850, 961}; // sorted array
		int searchId = 404;
		
		int bookIndex = binarySearchForBook(bookIds, 0, bookIds.length-1, searchId);
		if(bookIndex != -1) {
			System.out.println("Book Id found in index at: " + bookIndex);
		} else {
			System.out.println("Given Book Id not found in list" );
		}
			
		
	}

	private static int binarySearchForBook(int[] bookIds, int start, int end, int searchId) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = start + (end-start) / 2;
		
		if(bookIds[mid] == searchId) { 
			return mid;
		}
		
		if(bookIds[mid] > searchId) {
			return binarySearchForBook(bookIds, start, mid-1, searchId); // search thru left half; end should mid-1 for left search
		} else {
			return binarySearchForBook(bookIds, mid + 1, end, searchId); //search thru right half; start should mid + 1 for right search;
		}		
	}

}
