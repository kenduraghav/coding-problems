package coding.problem.examples.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findAllDuplicateNums(arr);
	}

	public int findDuplicate(int[] arr) {
		int i = 0;

		while (i < arr.length) {
			if (arr[i] != i + 1) {
				int index = arr[i] - 1;
				if (arr[i] != arr[index]) {
					swap(arr, i, index);
				} else {
					return arr[i];
				}
			} else {
				i++;
			}

		}

		return -1;
	}

	static List<Integer> findAllDuplicateNums(int[] arr) {

		int i = 0;
		List<Integer> ans = new ArrayList<>();
		while (i < arr.length) {
			int index = arr[i] - 1;
			if (arr[i] != arr[index]) {
				swap(arr, i, index);
			} else {
				i++;
			}
		}

		System.out.println(Arrays.toString(arr));

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				ans.add(arr[index]);
			}
		}

		System.out.println(ans);
		return ans;
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
