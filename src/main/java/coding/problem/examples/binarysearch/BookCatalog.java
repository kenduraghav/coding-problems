package coding.problem.examples.binarysearch;

public class BookCatalog {

	public static void main(String[] args) {
		int[] sortedCatalog = { 101, 123, 137, 150, 165, 172, 189, 205, 220 };
		int bookCode = 150;
		System.out.println("Book found at index: " + findBook(sortedCatalog, bookCode));

	}
	
	static int findBook(int[] catalog, int bookCode) {
        int left = 0;
        int right = catalog.length - 1;
        
        while (left <= right) {
            // TODO: implement this
            int mid = left + (right-left) / 2;
            
            if(catalog[mid] == bookCode){
                return mid;
            }
            
            if(bookCode < catalog[mid]){
                right = mid - 1;
            } else{
                left = mid  + 1;
            }
        }
        
        return -1; // Book not found
    }

}
