package coding.problem.examples;

import java.util.HashSet;
import java.util.Set;

public class AudienceOverLapProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int blog1[] = {1, 2, 3, 4, 5};
        int blog2[] = {6, 7, 8, 9, 10};
        
        if (audienceOverlap(blog1, blog2))
            System.out.print("Yes, there is an audience overlap between both blogs.");
        else
            System.out.print("No, there is no audience overlap between both blogs.");
	}
	
	public static boolean audienceOverlap(int blog1[], int blog2[]) {

        Set<Integer> visitorSet = new HashSet<>();
        
        // implement this 
        for(int i= 0; i < blog1.length; i++){
            visitorSet.add(blog1[i]);
        }
        
        
        for(int i= 0; i < blog2.length; i++){            
            if(visitorSet.contains(blog2[i])){
                return true;
            }
        }

        return false;
    }

}
