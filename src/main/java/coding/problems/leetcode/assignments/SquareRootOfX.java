package coding.problems.leetcode.assignments;


// https://leetcode.com/problems/sqrtx/
public class SquareRootOfX {

	public static void main(String[] args) {
		
		System.out.println(mySqrt(16));
		System.out.println(mySqrt(4));
		System.out.println(mySqrt(9));
		System.out.println(mySqrt(2147395599));
		System.out.println(mySqrt(3));
		
		System.out.println("=========Newton's Method============");
		System.out.println(newtonSqrt(16));
		System.out.println(newtonSqrt(4));
		System.out.println(newtonSqrt(9));
		System.out.println(newtonSqrt(2147395599));
		System.out.println(newtonSqrt(3));
	}

	static int newtonSqrt(int x) {
		long sq = x;
		while (sq * sq > x) {
			sq = (sq + x / sq) / 2;
		}
		
		return (int) sq;
	}

	static int mySqrt(int x) {
		if (x < 2) {
			return x;
		}

		long start = 1;
		long end = x;
		int ans = 0;
		while (start <= end) {

			long mid = start + (end - start) / 2;
			long midSquare = mid * mid;
			// System.out.println("Square of Mid is: " + mid + " ---" + midSquare);
			if (midSquare == x) {
				return (int) mid;
			}

			if (midSquare < x) {
				start = mid + 1;
				ans = (int) mid;
			} else {
				end = mid - 1;
			}

		}
		return ans;
	}

}
