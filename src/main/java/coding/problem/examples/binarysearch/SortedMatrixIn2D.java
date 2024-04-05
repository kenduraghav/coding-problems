package coding.problem.examples.binarysearch;

import java.util.Arrays;

public class SortedMatrixIn2D {

	public static void main(String[] args) {
		 int[][] arr = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	        };
		 	
	        System.out.println(Arrays.toString(search(arr, 8)));
	}
	
	private static int[] search(int [][] matrix, int target) {
		
		 if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
	            return new int[]{-1, -1};
		 
		 int rows = matrix.length;
		 int cols = matrix[0].length;
		 
		 int start = 0;
		 int end = rows * cols - 1 ;
		 
		 while(start <=end) {
			 int mid = start+(end-start) /2;
			 int midElement = matrix[mid /cols][mid % cols];
			 
			 if(midElement == target) {
				 return new int[]{mid /cols, mid % cols};
			 }else if (midElement < target) {
				 start = mid + 1;
			 } else {
	                end = mid - 1;
			 }
		 }
		 
		 return new int[]{-1, -1};
	}

}
