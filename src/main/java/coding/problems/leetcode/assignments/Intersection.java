package coding.problems.leetcode.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection {

	public static void main(String[] args) {

		int num1[] = { 4,9,5,4 };
		int num2[] = { 9,4,9,8,4 };
		int[] intersects = intersection(num1, num2);
		System.out.println(Arrays.toString(intersects));
	}

	static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();

		// Check on nums1
		for (int num : nums1) {
			set.add(num);
		}

		// Check nums1 on nums2
		Set<Integer> intersectionSet = new HashSet<>();
		for (int num : nums2) {
			if (set.contains(num)) {
				intersectionSet.add(num);
			}
		}

		// Result
		int[] ans = new int[intersectionSet.size()];
		int i = 0;

		for (int num : intersectionSet) {
			ans[i++] = num;
		}

		return ans;
	}

}
