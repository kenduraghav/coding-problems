package coding.problem.examples.math;

public class BitwiseOperatorDSA {

	public static void main(String[] args) {
		System.out.println("Given no Is even ? " + isEven(16));
		
		int arr []  = {2,3,4,6,4,2,3,6,8};
		System.out.println("Two numbers Duplicate array " +findUnique(arr));
		
		int arr1 []  = {2,3,2,3,4,4,6,4,6,2,3,6,8};
		System.out.println("Three numbers duplicate array :" +findUnique2(arr1));
		
		int n = 5;
		System.out.println(findMagic(n));
		
		System.out.println("Is Power of 2: " + isPowerOf2(16)); 
		
		
		System.out.println("No.of digits for (34452422)base 10 equal to == " + noOfDigits(34452422, 10));
		System.out.println("No.of digits for (10)base 2 equal to == " + noOfDigits(10, 2));
		
		
	}
	
	static boolean isOdd(int n) {
		return (n & 1) == 1;
	}
	
	static boolean isEven(int n) {
		return (n & 1) == 0;
	}
	
	
	static int findUnique(int [] arr) {
		int result  = 0;
		for(int i: arr) {
			result ^=  i;
		}
		return result;
	}
	
	
	static int findUnique2(int[] arr) {
        int ones = 0;
        int twos = 0;

        for (int num : arr) {
            // Add the bits that are set in 'num' to 'ones' and 'twos' if they are already set in 'ones'
        	
            twos |= ones & num;

            // XOR 'num' with 'ones' to find the bits that are set in 'num' but not in 'ones', then add them to 'ones'
            ones ^= num;

            // The bits that are set in both 'ones' and 'twos' represent elements that have appeared 3 times.
            // We remove them from 'ones' and 'twos'
            int commonBits = ones & twos;
            ones &= ~commonBits;
            twos &= ~commonBits;
        }

        return ones;
    }
	
	
	//Magic number  -> Powers of 5 or Sum of unique powers of 5. asked in Amazon
	static int findMagic(int n) {
		
		int base = 5; 
		int ans = 0;
		while(n > 0 ) {
			int last = n & 1;
			n = n >> 1;
			ans += last * base;
			base = base * 5;
		}
		return ans;
	}
	
	
	static boolean isPowerOf2(int n) {
		return (n & n-1) == 0;
	}
	
	
	static int noOfDigits(int n, int b) {
		return (int) (Math.log(n) / Math.log(b)) + 1;
	}

}
