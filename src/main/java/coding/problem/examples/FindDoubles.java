package coding.problem.examples;

import java.util.HashSet;

public class FindDoubles {

	public static void main(String[] args) {
		
		System.out.println(findFirstDuplicateID(new String[]{"X123", "A456", "X123", "B789", "A456", "C111"})); // Expected "X123"
        System.out.println(findFirstDuplicateID(new String[]{"Z999", "Y888", "Z999", "Y888"})); // Expected "Z999"
        System.out.println(findFirstDuplicateID(new String[]{"E100", "B200", "C300", "E100", "D400", "C300"})); // Expected "E100"
	}
	
	public static String findFirstDuplicateID(String[] ids) {
        HashSet<String> idSet = new HashSet<>();

        // TODO: Find an id that appears more than once and return it
        for(String id : ids)   {
             if(!idSet.contains(id)){
                 idSet.add(id);
             }  else{
                 return id;
             }
         }
        // Return an empty string if no duplicate ids are found
        return "";
    }


}
