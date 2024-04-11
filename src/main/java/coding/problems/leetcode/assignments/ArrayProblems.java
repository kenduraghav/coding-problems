package coding.problems.leetcode.assignments;

import java.util.Arrays;

public class ArrayProblems {

	public static void main(String[] args) {
		int [][] image = {
				{1,1,0},
				{1,0,1},
				{0,0,0}
		};
		flipAndInvertImage(image);
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

	public static int[][] flipAndInvertImage(int[][] image) {

		return new int[][] { { -1, -1 } };

	}

	void swap(int[] imageCol, int first, int second) {

	}
}
