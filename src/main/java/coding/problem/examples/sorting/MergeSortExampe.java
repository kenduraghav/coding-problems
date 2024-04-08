package coding.problem.examples.sorting;

//Code Signal Example
public class MergeSortExampe {
	static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			// TODO: find mid element
			int mid = (left + right) / 2;
			// TODO: call mergeSort recursively for the left part
			mergeSort(arr, left, mid - 1);
			// TODO: call margeSort recursively for the right part
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] leftPart = new int[n1];
		int[] rightPart = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftPart[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightPart[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftPart[i] <= rightPart[j]) {
				arr[k] = leftPart[i];
				i++;
			} else {
				arr[k] = rightPart[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftPart[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightPart[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] tracks = { 11, 2, 5, 7, 8, 3, 6, 9, 10, 1 };
		mergeSort(tracks, 0, tracks.length - 1);

		for (int songID : tracks) {
			System.out.print(songID + " ");
		}
	}
}
