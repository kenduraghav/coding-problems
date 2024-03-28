package coding.problem.examples.recursions;

public class DigitCounter {

	public static void main(String[] args) {
		System.out.println("The number of digits in the 'diameter of Mars': " + countDigits(764223));
	}

	static int countDigits(int num) {
		if (num == 0) {
			return 0;
		} else {
			// Recursive case: reduce the number by dividing by 10 and count the rest
			int lastDigit = num % 10; // counting only the even number
			if(lastDigit  % 2 == 0) {
				return 1 + countDigits(num / 10);
			} else {
				return countDigits(num / 10);
			}
			
		}
	}

}
