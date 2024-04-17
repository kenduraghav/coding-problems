package coding.problem.examples.recursions;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class GoodOldFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial/fibonacci");
		int n = sc.nextInt();
//		System.out.println("Factorial of %d is ->  " + factorialOfN(n));
		try (ExecutorService service = Executors.newVirtualThreadPerTaskExecutor()){
			Future<BigInteger> f1 = service.submit(() -> fiboUsingDp(n));
			System.out.println("Fibonacci of  %d".formatted(n) + " is : " + f1.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
	
	static int factorialOfN(int n) {
		if(n== 0 || n ==1) {
			return 1;
		} else {
			return n*factorialOfN(n-1);
		}
	}
	
	
	static int fibo(int n) {
		if(n < 2) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
	
	static BigInteger fiboUsingDp(int n) {
		long [] dp = new long[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return BigInteger.valueOf(dp[n]);
	}

}
