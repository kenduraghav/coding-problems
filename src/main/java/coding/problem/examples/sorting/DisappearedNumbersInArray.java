package coding.problem.examples.sorting;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

//asked in  google.
public class DisappearedNumbersInArray {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
		

	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	static List<Integer> findDisappearedNumbers(int[] nums) {
		int i = 0;
		while(i < nums.length) {
			int index = nums[i]-1;
			if(nums[i] != nums[index]) {
				swap(nums,i,index);
			} else {
				i++;
			}
		}
		
		//index = nums[i]- 1;  which means nums[i] = index+1;
		List<Integer> missingIndexes = new ArrayList<>();
		for(int index = 0; index < nums.length; index++) {
			if((index+1) != nums[index]) {
				missingIndexes.add(index+1);
			}
		}
		return missingIndexes;	
	}

}
