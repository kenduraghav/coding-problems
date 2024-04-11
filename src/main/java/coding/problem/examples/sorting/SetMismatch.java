package coding.problem.examples.sorting;

//https://leetcode.com/problems/set-mismatch/description/ 
public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public int[] findErrorNums(int[] nums) {
		int i = 0;
		while(i < nums.length) {
			int index = nums[i]-1;
			if(nums[i] != nums[index]) {
				swap(nums,i,index);
			} else {
				i++;
			}
		}
		
		for(int index = 0; index < nums.length; index++) {
			if(nums[index] != index+1) {
				return new int[] {nums[index], index+1};
			}
		}
		
		return new int[] {-1};
	}

}
