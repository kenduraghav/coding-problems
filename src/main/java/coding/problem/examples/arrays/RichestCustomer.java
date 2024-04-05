package coding.problem.examples.arrays;


//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomer {

	public static void main(String[] args) {

		int[][] accounts1 = { { 1, 2, 3 }, { 3, 2, 1 } };
		int[][] accounts2 = { { 1,5 }, { 7,
			3},{3,5} };
		int[][] accounts3 = { { 2,8,7 }, { 7,1,3 } ,{1,9,5}};
		
		System.out.println("Customer 1: " + maximumWealth(accounts1));
		System.out.println("Customer 2: " + maximumWealth(accounts2));
		System.out.println("Customer 3: " + maximumWealth(accounts3));
	}

	static int maximumWealth(int[][] accounts) {
		int[] result = new int[accounts.length]; 
		// create a temp array with length of rows in 2D array.
		int max = 0;
		for (int row = 0; row < accounts.length; row++) {
			int sum = 0;
			// calculate the wealth of each customer.
			for (int col = 0; col < accounts[row].length; col++) {
				sum += accounts[row][col];
			}
			//result[row] = sum; // update the temp array with wealth of each customer.
			if(sum > max) {
				max= sum;
			}
		}
		
//		for (int i = 0; i < result.length; i++) {
//			if (result[i] > max) { // apply linear search to calculate the richest customer.
//				max = result[i];
//			}
//		}
		return max;
	}

}
