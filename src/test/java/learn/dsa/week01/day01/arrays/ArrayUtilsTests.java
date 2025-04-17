package learn.dsa.week01.day01.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ArrayUtilsTests {
	
	private static ArrayUtils arrayUtils;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arrayUtils  = new ArrayUtils();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		arrayUtils = null;
	}

	@Test
	void testReverseRegularArray() {
		int[] arr = {5, 3, 8, 6, 2};
		arrayUtils.reverse(arr);
		
		int [] expected = {2,6,8,3,5};
		assertArrayEquals(expected, arr,"The Arrays are not equal");
	}
	
	@Test
	void testReverseEmptyArray() {
		int[] arr = {};
		arrayUtils.reverse(arr);
		
		int [] expected = {};
		assertArrayEquals(expected, arr,"The Arrays are not equal");
	}
	
	@Test
	void testReverseSingleElementArray() {
		int[] arr = {1};
		arrayUtils.reverse(arr);
		
		int [] expected = {1};
		assertArrayEquals(expected, arr,"The Arrays are not equal");
	}
	
	@Test
	void testReverseIdenticalElements() {
		int[] arr = {1,1,1,1};
		arrayUtils.reverse(arr);
		
		int [] expected = {1,1,1,1};
		assertArrayEquals(expected, arr,"The Arrays are not equal");
	}
	
	
	
	@Test
	void testFindMaxRegularArray() {
		int[] arr = {5, 3, 8, 6, 2};
		int actual = arrayUtils.findMax(arr);
		
		int expected = 8;
		assertEquals(expected,actual,"Expected value is not equal");
	}
	
	@Test
	void testFindMaxWithNegativeNumbers() {
		int[] arr = {-1, -2, -3, -4};
		int actual = arrayUtils.findMax(arr);
		
		int expected = -1;
		assertEquals(expected,actual,"Expected value is not equal");
	}
	
	@Test
	void testFindMaxSingleElement() {
		 int[] arr = {5};
		int actual = arrayUtils.findMax(arr);
		
		int expected = 5;
		assertEquals(expected,actual,"Expected value is not equal");
	}
	
	@Test
	void testFindMaxIdenticalElements() {
		 int[] arr = {5,5,5,5};
		int actual = arrayUtils.findMax(arr);
		
		int expected = 5;
		assertEquals(expected,actual,"Expected value is not equal");
	}
	
	
	
	
	@Test
	void testIsSortedAscendingArray() {
		int[] arr = {5, 3, 8, 6, 2};
		assertFalse(arrayUtils.isSortedAscending(arr), "The array is sorted");
	}
	
	@Test
	void testIsSortedAscending() {
		int[] arr = {1, 2, 3, 4};
		assertTrue(arrayUtils.isSortedAscending(arr));
	}
	
	@Test
	void testIsSortedAscendingIdenticalElements() {
		int[] arr = {2, 2, 2, 2};
		assertTrue(arrayUtils.isSortedAscending(arr));
	}
	
	@Test
	void testIsSortedAscendingWithNegative() {
		int[] arr = {-2, -3, -1, -4};
		assertFalse(arrayUtils.isSortedAscending(arr));
	}
	
	@Test
	void testIsSortedAscendingDescending() {
		int[] arr = {4,3,2,1};
		assertFalse(arrayUtils.isSortedAscending(arr));
	}
	
	@Test
    void testIsSortedAscendingEmptyArray() {
        int[] arr = {};
        assertTrue(arrayUtils.isSortedAscending(arr)); // Empty array can be considered sorted
    }
	
	@Test
	void givenSortedArray_ReturnsTrue() {
		int[] arr = {2,3,4,5,7};
		
		assertTrue(arrayUtils.isSortedAscending(arr), "The array is not sorted");
	}
	
	@Test
    void testIsSortedAscendingSingleElement() {
        int[] arr = {5};
        assertTrue(arrayUtils.isSortedAscending(arr)); // Single element is trivially sorted
    }

	@Test
	void givenNotSortedArray_ReturnsFalse() {
		int[] arr = {2,3,4,8,5,6};
		
		assertFalse(arrayUtils.isSortedAscending(arr), "The array is sorted");
	}
	
	
	@Test
	void givenNotSortedLargeArray_ReturnsFalse() {
		int[] arr = {2,3,4,5,6,7,8,8,9,10,11,12,20,13};
		
		assertFalse(arrayUtils.isSortedAscending(arr), "The array is sorted");
	}
	
	
	@Test
    void testSumRegularArray() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(10, arrayUtils.sum(arr));
    }

    @Test
    void testSumWithNegativeNumbers() {
        int[] arr = {-1, -2, 3, 4};
        assertEquals(4, arrayUtils.sum(arr));
    }

    @Test
    void testSumWithZero() {
        int[] arr = {0, 0, 0};
        assertEquals(0, arrayUtils.sum(arr));
    }

    @Test
    void testSumSingleElement() {
        int[] arr = {5};
        assertEquals(5, arrayUtils.sum(arr));
    }

    @Test
    void testSumIdenticalElements() {
        int[] arr = {7, 7, 7, 7};
        assertEquals(28, arrayUtils.sum(arr));
    }

}
