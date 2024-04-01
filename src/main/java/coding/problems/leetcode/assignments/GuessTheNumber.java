package coding.problems.leetcode.assignments;


class Guess {
	
	int pick;
	
	Guess(int pick){
		this.pick = pick;
	}
	
	
	int guess(int num) {
		return Integer.compare(pick, num);
	}
}


// https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessTheNumber extends Guess {

	GuessTheNumber(int pick) {
		super(pick);
	}

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(new GuessTheNumber(6).guessNumber(n));
		System.out.println(new GuessTheNumber(2).guessNumber(2));
	}
	
	public int guessNumber(int n) {

        int start = 0;
        int end = n;
        int ans = 0;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            // mid is equal to pick
            if(guess(mid) == 0){
                return mid;
            }

            //if pick is lower than guess number(mid) 
            if (guess(mid) == -1) {
               end = mid -1;
            } else  {
                start = mid + 1;
                              
            } 
        }
        return ans;
    }

}
