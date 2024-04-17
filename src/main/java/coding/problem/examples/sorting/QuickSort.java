package coding.problem.examples.sorting;

public class QuickSort {
	
	
	static void quickSort(int[] arr, int start, int end) {
	    if (start < end) {
	        int pivot_index = partition(arr, start, end);
	        quickSort(arr, start, pivot_index - 1); // sort left part
	        quickSort(arr, pivot_index + 1, end);  // sort right part
	    }
	}

	static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;

        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {   
                int temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[start] = arr[i];
        arr[i] = pivot;

        return i;
    }
	
	//if we taking the right most element then apply this 
	//partition and swap the arr[i+1] and pivot to place it in correct position
	static int partitionWithRightEnd(int[] sizes, int left, int right) {
        int pivot = sizes[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (sizes[j] < pivot) {
                i++;
                int temp = sizes[i];
                sizes[i] = sizes[j];
                sizes[j] = temp;
            }
        }
        int temp = sizes[i + 1];
        sizes[i + 1] = sizes[right];
        sizes[right] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] items = {3, 6, 2,4, 1, 9, 5, 0,7, 8};
        quickSort(items, 0, items.length - 1);

        for (int item : items) {
            System.out.print(item + " ");
        }
    }

}
