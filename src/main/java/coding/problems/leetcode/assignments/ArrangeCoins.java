package coding.problems.leetcode.assignments;

public class ArrangeCoins {

	public static void main(String[] args) {
		System.out.println(arrangeCoins(5));
	}
	
	static int arrangeCoins(int n) {
        long start = 0;
        long end = n;

         while (start <= end) {

            long mid = start + (end - start) / 2;
            long addup =((mid*mid) + mid)/2;

            if (addup == n) {
                return (int)mid;             
            } else if (addup > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return (int)end;
    }

}
