package coding.problem.examples;

/**
 * 
 * Steps to follow
 * 
 * <li>No of lines = no.of. rows. = no.of times outer loop will run.</li>
 * 
 * <li> Identify for every rowno 
 * 		<li> how many cols are there</li> 
 * 		<li> Types of elements in inner loop</li>
 * 		<p>col Note: try to find the formula for relating the columns and rows.</p>
 * 
 * <li>. What do you need to print</li>
 * 
 * Patterns that will print
 	<pre>
 			-----------Pattern1---------------  
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			-----------Pattern2---------------
			* 
			* * 
			* * * 
			* * * * 
			* * * * * 
			-----------Pattern3---------------
			* * * * * 
			* * * * 
			* * * 
			* * 
			* 
			-----------Pattern4---------------
			1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
			-----------Pattern5---------------
			
			* 
			* * 
			* * * 
			* * * * 
			* * * * * 
			* * * * 
			* * * 
			* * 
			* 
	</pre>
	 <pre>
		-----------Pattern6---------------
		    *
		   **
		  ***
		 ****
		*****
		-----------Pattern7---------------
		*****
		 ****
		  ***
		   **
		    *
		-----------Pattern8---------------
		    *
		   ***
		  *****
		 *******
		*********
		-----------Pattern9---------------
		*********
		 *******
		  *****
		   ***
		    *
 	</pre>
 *
 */

public class PatternProblem {

	public static void main(String[] args) {
//		System.out.println("-----------Pattern1---------------");
//		pattern1(5);
//		System.out.println("-----------Pattern2---------------");
//		pattern2(5);
//		System.out.println("-----------Pattern3---------------");
//		pattern3(5);
//		System.out.println("-----------Pattern4---------------");
//		pattern4(5);
//		System.out.println("-----------Pattern5---------------");
//		pattern5(5);
//		System.out.println("-----------Pattern6---------------");
//		pattern6(5);
//		System.out.println("-----------Pattern7---------------");
//		pattern7(5);
//		System.out.println("-----------Pattern8---------------");
//		pattern8(5);
//		System.out.println("-----------Pattern9---------------");
//		pattern9(5);
//		System.out.println("-----------Pattern10---------------");
//		pattern10(5);
//		System.out.println("-----------Pattern11---------------");
//		pattern11(5);
		System.out.println("-----------Pattern11---------------");
		pattern12(5);
	}

	// if n=4;
	// prints
	// * * * *
	// * * * *
	// * * * *
	// * * * *
	static void pattern1(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 1; row <= n; row++) {

			// for every row, run the col col is also equal to n;
			for (int col = 1; col <= n; col++) {

				// What needs to be print
				System.out.print("* ");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	// if n=4;
	// prints
	// *
	// * *
	// * * *
	// * * * *
	static void pattern2(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 1; row <= n; row++) {

			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= row; col++) {

				// What needs to be print
				System.out.print("* ");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	// if n=4;
	// prints
	// * * * *
	// * * *
	// * *
	// *

	static void pattern3(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 1; row <= n; row++) {

			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= n + 1 - row; col++) {

				// What needs to be print
				System.out.print("* ");
			}
			// When one row is printed, we need to add a newline
			System.out.println();

		}
	}

	// if n=4;
	// prints
	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	static void pattern4(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 1; row <= n; row++) {

			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= row; col++) {

				// What needs to be print
				System.out.print(col + " ");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	// if n=4;
	// prints
	/*
	 
	 */
	static void pattern5(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 0; row < 2 * n; row++) {
			int totalRowsInCol = (row > n) ? 2 * n - row : row;
			// for every row, run the col; col is equal to row.
			for (int col = 0; col < totalRowsInCol; col++) {

				// What needs to be print
				System.out.print("* ");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	static void pattern6(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 1; row <= n; row++) {
			// n + 1 - row
			int noOfSpaces = n - row;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= row; col++) {

				// What needs to be print
				System.out.print("*");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	/*
		*****
		 ****
	      ***
	       **
	        *
	 */
	static void pattern7(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = n; row >= 1; row--) {
			// n + 1 - row
			int noOfSpaces = n - row;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= row; col++) {

				// What needs to be print
				System.out.print("*");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	/*
		*
	   ***
	  *****
	 *******
	*********
	*/
	static void pattern8(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 1; row <= n; row++) {
			// n + 1 - row
			int totalColsInRows = row == 1 ? row : row * 2 - 1;

			int noOfSpaces = n - row;

			for (int space = 1; space <= noOfSpaces; space++) {
				System.out.print(" ");
			}

			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= totalColsInRows; col++) {

				// What needs to be print
				System.out.print("*");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	/*
		*********
	     *******
	      *****
	       ***
	        *
	*/
	static void pattern9(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = n; row >= 1; row--) {
			// n + 1 - row
			int totalColsInRows = row == 1 ? row : row * 2 - 1;

			int noOfSpaces = n - row;

			for (int space = 1; space <= noOfSpaces; space++) {
				System.out.print(" ");
			}

			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= totalColsInRows; col++) {

				// What needs to be print
				System.out.print("*");
			}

			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}
	
	
	static void pattern10(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 1; row <= n; row++) {
			// n + 1 - row
			int noOfSpaces = n - row;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= row; col++) {

				// What needs to be print
				System.out.print(" *");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}
	
	
	static void pattern11(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = n; row >= 1; row--) {
			// n + 1 - row
			int noOfSpaces = n - row;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			// for every row, run the col; col is equal to row.
			for (int col = 1; col <= row; col++) {

				// What needs to be print
				System.out.print(" *");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}
	
	static void pattern12(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 0; row < 2 * n ; row++) {
			
			int totalRowsInCol = (row < n) ? n-row : row-n+1;
			
			int noOfSpaces = n - totalRowsInCol;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			// for every row, run the col; col is equal to row.
			for (int col = 0; col < totalRowsInCol; col++) {

				// What needs to be print
				System.out.print(" *");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

	/**
	 * 
	 * prints the below pattern
	 * 
	 * 
	 * <pre>
	 *   	 *
	 *	    * *
	 *	   * * *
	 *	  * * * *
	 *	 * * * * *
	 *	  * * * *
	 *	   * * *
	 *	    * *
	 *	     *
	 * </pre>
	 * 
	 * 
	 * 
	 * @param n
	 */

	static void pattern28(int n) {

		// run the outer for loop with no.of rows or no.of lines to print row is equal
		// to n
		for (int row = 0; row < 2 * n; row++) {
			int totalRowsInCol = (row > n) ? 2 * n - row : row;
			// for every row, run the col; col is equal to row.

			int noOfSpaces = n - totalRowsInCol;

			for (int space = 0; space < noOfSpaces; space++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalRowsInCol; col++) {

				// What needs to be print
				System.out.print("* ");
			}
			// When one row is printed, we need to add a newline
			System.out.println();
		}
	}

}
