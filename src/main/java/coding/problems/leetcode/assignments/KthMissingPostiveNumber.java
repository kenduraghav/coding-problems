package coding.problems.leetcode.assignments;

public class KthMissingPostiveNumber {

	public static void main(String[] args) {
		int arr [] = {2,3,4,7,11};
		System.out.println(findKthPositive(arr, 5));
	}
	
	static int findKthPositive(int[] arr, int k) {
 
		int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int missing = arr[mid] - (mid+1);

            if(missing<k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start+k;	
		
    }

}
