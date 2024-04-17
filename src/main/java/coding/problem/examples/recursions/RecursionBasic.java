package coding.problem.examples.recursions;

public class RecursionBasic {

	public static void main(String[] args) {
		recursiveBasic(10);
	}
	
	static void recursiveBasic(int x) {
		if(x < 0) {//base case
			System.out.println("Function End");
		} else {
			System.out.println("X: " + x);
			recursiveBasic(x-1);
		}
	}

}
