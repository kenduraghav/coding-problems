package coding.problems.leetcode.assignments;


// https://leetcode.com/problems/first-bad-version/
public class BadVersion {
	
	int badVersion;
	
	public BadVersion(int badVersion) {
		this.badVersion = badVersion;
	}

	public static void main(String[] args) {
		System.out.println(new BadVersion(4).firstBadVersion(5));
	}

	public int firstBadVersion(int n) {
		int start = 1; 
	       int end = n;

	       while(start < end){
	            int mid = start + (end - start) / 2;
	            
	            if(isBadVersion(mid)){  //              
	                end = mid;
	            }  else {
	                start = mid+1;
	            }                   
	       }
	       System.out.println(start);
	       return start;
	    }

	private boolean isBadVersion(int mid) {
		return this.badVersion == mid;
	}

}
