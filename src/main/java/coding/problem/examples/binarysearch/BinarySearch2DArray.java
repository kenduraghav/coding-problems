package coding.problem.examples.binarysearch;
public class BinarySearch2DArray {

    // Function to perform binary search in a sorted 2D array and return indices
    public static int[] searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                // Found the target, return the indices
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                // Move down (since the current element is smaller than the target)
                row++;
            } else {
                // Move left (since the current element is greater than the target)
                col--;
            }
        }

        // Target not found, return an array with -1 indices
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        // Example sorted 2D array
        int[][] matrix = {
            {1, 3, 7, 8, 8, 9, 12},
            {2, 4, 8, 9, 10, 30, 38},
            {4, 5, 10, 20, 29, 50, 60},
            {8, 10, 11, 30, 50, 60, 61},
            {11, 12, 40, 80, 90, 100, 111},
            {13, 15, 50, 100, 110, 112, 120},
            {22, 27, 61, 112, 119, 138, 153}
        };

        int target = 50;
        int[] indices = searchMatrix(matrix, target);

        if (indices[0] == -1) {
            System.out.println("Target " + target + " not found in the matrix.");
        } else {
            System.out.println("Target " + target + " found at row " + indices[0] + ", column " + indices[1]);
        }
    }
}
