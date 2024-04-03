package coding.problems.leetcode.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfDoubleExists {
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static boolean checkIfDoubleExists(int[] arr) {
        Arrays.sort(arr); // Sort the array in non-decreasing order
        for (int i = 0; i < arr.length; i++) {
            int doubleValue = arr[i] * 2;
            int index = Arrays.binarySearch(arr, doubleValue);
            if (index >= 0 && index != i) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkIfDoubleExistsUsingSet(int [] arr) {
    	Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfDoubleExists(arr)); // Output: true
        System.out.println(checkIfDoubleExistsUsingSet(arr)); // Output: true
    }
}
