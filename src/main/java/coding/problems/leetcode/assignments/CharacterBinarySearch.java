package coding.problems.leetcode.assignments;


//Find the smallest letter greater than target - LeetCodeProblem 
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class CharacterBinarySearch {

	public static void main(String[] args) {
		
		char [] letters = {'c','f','f','j'}; 
		char target = 'c';
		System.out.println("Smallest Letter than target: " + nextGreatestLetter(letters, target));
	}
	
	static char nextGreatestLetter(char[] letters, char target) {
		
		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {

			// better way to find mid.
			// find the middle element
			int mid = start + (end - start) / 2;

			// if target is less than mid -> search thru the left
			if (target < letters[mid]) {
				end = mid - 1;
			} else  {
				start = mid + 1; // if target is greater mid element search thru right.
			} 

		}

		return letters[start % letters.length];
	}

}
