package coding.problem.examples.sorting;

// https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {

	public static void main(String[] args) {
		int [] arr = {3,4,-1,1};
		System.out.println(firstMissingPositive(arr));
		
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	static int firstMissingPositive(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int index = nums[i] - 1;
			if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[index]) {
				swap(nums, i, index);
			} else {
				i++;
			}
		}

		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index+1) {
				return index+1;
			}
		}

		return nums.length +1;
	}

}
