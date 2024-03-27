package coding.problem.examples;

public class StarPattern {

	
	public static void main(String[] args) {

		int n = 10; // Number of rows
		int space = 0; // Number of spaces

		// Loop to print upper half of the pattern
		for (int i = n; i >= 1; i--) {
			// Print spaces
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Print double spaces
			for (int l = 1; l <= 2; l++) {
				System.out.print(" ");
			}
			// Print stars again
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
			space++; // Increment space for next row
		}

		space = n - 1; // Reset space for lower half

		// Loop to print lower half of the pattern
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			// Print double spaces
			for (int l = 1; l <= 2; l++) {
				System.out.print(" ");
			}
			// Print stars again
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
			space--; // Decrement space for next row
		}

	}
}
