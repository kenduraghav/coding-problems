package coding.problem.examples;

public class Main {

	public static void main(String[] args) {
		int x = 10;
		if (x > ++x)
			System.out.println('A');
		else
			System.out.println('B');

		int a = 5, b = 20;
		a += ++b;
		System.out.println(a);
	}

}
