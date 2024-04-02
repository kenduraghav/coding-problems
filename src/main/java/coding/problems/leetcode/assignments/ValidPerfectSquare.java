package coding.problems.leetcode.assignments;

//https://leetcode.com/problems/valid-perfect-square/description/
public class ValidPerfectSquare {

	public boolean isPerfectSquare(int num) {

		if (num < 2) {
			return true;
		}
		long start = 2;
		long end = num / 2;

		while (start <= end) {
			long mid = start + (end - start) / 2;

			long midSquare = mid * mid;
			String text = """ 
					Square of Start is %d - Start value is %d
					""".formatted(midSquare,start);
			System.out.println(text);
			if (midSquare == num) {
				return true;
			}
			if (midSquare > num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new ValidPerfectSquare().isPerfectSquare(808201));
		System.out.println(new ValidPerfectSquare().isPerfectSquare(16));
		System.out.println(new ValidPerfectSquare().isPerfectSquare(14));
		System.out.println(new ValidPerfectSquare().isPerfectSquare(9));
		System.out.println(new ValidPerfectSquare().isPerfectSquare(49));
	}

}
