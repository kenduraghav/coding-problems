package coding.problem.examples.sorting;

import java.util.Arrays;

//Code Signal Example
public class MergeSortExampe {
	static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			// TODO: find mid element
			int mid = (left + right) / 2;
			// TODO: call mergeSort recursively for the left part
			//System.out.println("left " + left  + "- right " + right + " " +Arrays.toString(arr));
			mergeSort(arr, left, mid);
			// TODO: call margeSort recursively for the right part
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	static void merge(int[] arr, int left, int mid, int right) {
		System.out.println("from merge " +Arrays.toString(arr));
		System.out.println("left: " + left + "mid: " + mid  + "right: " + right);
		int n1 = mid - left + 1; // initializing the length of left array.
		int n2 = right - mid; // initializing the length of right array.
		int[] leftPart = new int[n1]; // left temp array
		int[] rightPart = new int[n2]; // right temp array.

		for (int i = 0; i < n1; ++i)
			leftPart[i] = arr[left + i]; // filling the left temp array
		for (int j = 0; j < n2; ++j)
			rightPart[j] = arr[mid + 1 + j]; // filling the right temp array.
		System.out.println("before merge left" +Arrays.toString(leftPart));
		System.out.println("before merge right" +Arrays.toString(rightPart));
		int i = 0, j = 0; // counter variables used to left and right array.
		int k = left; //k -> is the point where starts from 0;
		while (i < n1 && j < n2) {
			if (leftPart[i] <= rightPart[j]) { // if leftPart is < than rightPart
				arr[k++] = leftPart[i++]; // update the array part with left value.
				//i++; // increment the counter for left
			} else {
				arr[k++] = rightPart[j++]; // else update the array with right part element and increment the counter for right
				//j++;
			}
			//k++; // increment the counter for main array. repeat this untils loop ends.
		}

		while (i < n1) { // insert the pivot element in array.
			arr[k++] = leftPart[i++];
//			i++;
//			k++;
		}

		while (j < n2) {
			arr[k++] = rightPart[j++];
//			j++;
//			k++;
		}
		System.out.println("after merge " +Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] tracks = { 11, 2, 5, 7, 8, 3, 6, 9, 10, 1 };
		mergeSort(tracks, 0, tracks.length - 1);

		for (int songID : tracks) {
			System.out.print(songID + " ");
		}
	}
}
