package coding.problems.leetcode.assignments;

import java.util.Arrays;

public class ArrayProblems {

	public static void main(String[] args) {
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int[][] flipAndInvertImage = flipAndInvertImage(image);
		System.out.println(Arrays.deepToString(flipAndInvertImage));

		System.out.println(1 ^ 1);
	}

	// https://leetcode.com/problems/find-the-highest-altitude/
	public int largestAltitude(int[] gain) {
		int maxAlt = 0;
		int sum = 0;
		for (int i = 0; i < gain.length; i++) {
			sum += gain[i];
			if (sum > maxAlt) {
				maxAlt = sum;
			}
		}
		return maxAlt;
	}

	// https://leetcode.com/problems/flipping-an-image/
	public static int[][] flipAndInvertImage(int[][] image) {
		
		int rows = image.length;
		int cols = image[0].length;

		// Swapping elements in 2d Array
		for (int i = 0; i < rows; i++) {
			
			int start = 0;
			int end = cols - 1;
			
			while (start < end) {
				swap(image, i, start, end);
				start++;
				end--;
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				image[i][j] = image[i][j] ^ 1;
			}
		}
		return image;

	}

	private static void swap(int[][] image, int i, int start, int end) {
		int temp = image[i][start];
		image[i][start] = image[i][end];
		image[i][end] = temp;
	}
	
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
