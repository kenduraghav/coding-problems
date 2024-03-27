package coding.problem.examples.recursions;

import java.util.Scanner;

public class GoodOldFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int n = sc.nextInt();
		System.out.println("Factorial of %d is ->  " + factorialOfN(n));
		sc.close();
	}
	
	static int factorialOfN(int n) {
		if(n== 0 || n ==1) {
			return 1;
		} else {
			return n*factorialOfN(n-1);
		}
	}

}
