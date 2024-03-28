package coding.problem.examples.recursions;

public class SumOfInteger {

	public static void main(String[] args) {
		System.out.println("The Sum of Integer:" + sumOfInteger(4042));
	}

	private static int sumOfInteger(int i) {
		if(i < 10) {
			return i;
		} else {
			return i % 10 + sumOfInteger(i / 10);
		}
		
	}

	
	
	

}
