package coding.problem.examples.sorting;

//https://leetcode.com/problems/missing-number/ -- Amazon Question
public class MissingNumber {

	public static void main(String[] args) {
		int [] arr = {3,0,1};
		System.out.println(missingNumber(arr));
		
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	static int missingNumber(int[] nums) {
		int i = 0;
		while(i < nums.length) {
			int index = nums[i];
			if(nums[i] < nums.length && nums[i] != nums[index]) {
				swap(nums,i,index);
			} else {
				i++;
			}
		}
		
		for(int index = 0; index < nums.length; index++) {
			if(nums[index] != index) {
				return index;
			}
		}
		
		return nums.length;
	}

}
