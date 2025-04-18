package learn.dsa.week01.day01.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArrayUtilsTests {

	private static ArrayUtils arrayUtils;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		arrayUtils = new ArrayUtils();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		arrayUtils = null;
	}

	@Test
	@Order(1)
	void testReverseRegularArray() {
		int[] arr = { 5, 3, 8, 6, 2 };
		arrayUtils.reverse(arr);

		int[] expected = { 2, 6, 8, 3, 5 };
		assertArrayEquals(expected, arr, "The Arrays are not equal");
	}

	@Test
	@Order(2)
	void testReverseEmptyArray() {
		int[] arr = {};
		arrayUtils.reverse(arr);

		int[] expected = {};
		assertArrayEquals(expected, arr, "The Arrays are not equal");
	}

	@Test
	@Order(3)
	void testReverseSingleElementArray() {
		int[] arr = { 1 };
		arrayUtils.reverse(arr);

		int[] expected = { 1 };
		assertArrayEquals(expected, arr, "The Arrays are not equal");
	}

	@Test
	@Order(4)
	void testReverseIdenticalElements() {
		int[] arr = { 1, 1, 1, 1 };
		arrayUtils.reverse(arr);

		int[] expected = { 1, 1, 1, 1 };
		assertArrayEquals(expected, arr, "The Arrays are not equal");
	}

	@Test
	@Order(5)
	void testFindMaxRegularArray() {
		int[] arr = { 5, 3, 8, 6, 2 };
		int actual = arrayUtils.findMax(arr);

		int expected = 8;
		assertEquals(expected, actual, "Expected value is not equal");
	}

	@Test
	@Order(6)
	void testFindMaxWithNegativeNumbers() {
		int[] arr = { -1, -2, -3, -4 };
		int actual = arrayUtils.findMax(arr);

		int expected = -1;
		assertEquals(expected, actual, "Expected value is not equal");
	}

	@Test
	@Order(7)
	void testFindMaxSingleElement() {
		int[] arr = { 5 };
		int actual = arrayUtils.findMax(arr);

		int expected = 5;
		assertEquals(expected, actual, "Expected value is not equal");
	}

	@Test
	@Order(8)
	void testFindMaxIdenticalElements() {
		int[] arr = { 5, 5, 5, 5 };
		int actual = arrayUtils.findMax(arr);

		int expected = 5;
		assertEquals(expected, actual, "Expected value is not equal");
	}

	@Test
	@Order(9)
	void testIsSortedAscendingArray() {
		int[] arr = { 5, 3, 8, 6, 2 };
		assertFalse(arrayUtils.isSortedAscending(arr), "The array is sorted");
	}

	@Test
	@Order(10)
	void testIsSortedAscending() {
		int[] arr = { 1, 2, 3, 4 };
		assertTrue(arrayUtils.isSortedAscending(arr));
	}

	@Test
	@Order(11)
	void testIsSortedAscendingIdenticalElements() {
		int[] arr = { 2, 2, 2, 2 };
		assertTrue(arrayUtils.isSortedAscending(arr));
	}

	@Test
	@Order(12)
	void testIsSortedAscendingWithNegative() {
		int[] arr = { -2, -3, -1, -4 };
		assertFalse(arrayUtils.isSortedAscending(arr));
	}

	@Test
	@Order(13)
	void testIsSortedAscendingDescending() {
		int[] arr = { 4, 3, 2, 1 };
		assertFalse(arrayUtils.isSortedAscending(arr));
	}

	@Test
	@Order(14)
	void testIsSortedAscendingEmptyArray() {
		int[] arr = {};
		assertTrue(arrayUtils.isSortedAscending(arr)); // Empty array can be considered sorted
	}

	@Test
	@Order(15)
	void givenSortedArray_ReturnsTrue() {
		int[] arr = { 2, 3, 4, 5, 7 };

		assertTrue(arrayUtils.isSortedAscending(arr), "The array is not sorted");
	}

	@Test
	@Order(16)
	void testIsSortedAscendingSingleElement() {
		int[] arr = { 5 };
		assertTrue(arrayUtils.isSortedAscending(arr)); // Single element is trivially sorted
	}

	@Test
	@Order(17)
	void givenNotSortedArray_ReturnsFalse() {
		int[] arr = { 2, 3, 4, 8, 5, 6 };

		assertFalse(arrayUtils.isSortedAscending(arr), "The array is sorted");
	}

	@Test
	@Order(18)
	void givenNotSortedLargeArray_ReturnsFalse() {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12, 20, 13 };

		assertFalse(arrayUtils.isSortedAscending(arr), "The array is sorted");
	}

	@Test
	@Order(19)
	void testSumRegularArray() {
		int[] arr = { 1, 2, 3, 4 };
		assertEquals(10, arrayUtils.sum(arr));
	}

	@Test
	@Order(20)
	void testSumWithNegativeNumbers() {
		int[] arr = { -1, -2, 3, 4 };
		assertEquals(4, arrayUtils.sum(arr));
	}

	@Test
	@Order(21)
	void testSumWithZero() {
		int[] arr = { 0, 0, 0 };
		assertEquals(0, arrayUtils.sum(arr));
	}

	@Test
	@Order(22)
	void testSumSingleElement() {
		int[] arr = { 5 };
		assertEquals(5, arrayUtils.sum(arr));
	}

	@Test
	@Order(23)
	void testSumIdenticalElements() {
		int[] arr = { 7, 7, 7, 7 };
		assertEquals(28, arrayUtils.sum(arr));
	}
	
	@Test
	@Order(24)
	void testMoveZeroRegularArray(){
		int[] actual = {0,1,0,3,12};
		int [] expected  = {1,3,12,0,0};
		arrayUtils.moveZeros(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	@Order(25)
	void testMoveZeroWithSingleElementArray() {
		int [] actual = {0};
		int [] expected  = {0};
		arrayUtils.moveZeros(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	@Order(26)
	void testMoveZeroRegularArrayWithNoZeros(){
		int[] actual = {1,3,12};
		int [] expected  = {1,3,12};
		arrayUtils.moveZeros(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	@Order(27)
	void testMoveZeroWithEmptyArray(){
		int[] actual = {};
		int [] expected  = {};
		arrayUtils.moveZeros(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	@Order(28)
	void testMoveZeroWithAlternateZeroes(){
		int[] actual = {1, 0, 2, 0, 3, 0};
		int [] expected  = {1, 2, 3, 0, 0, 0};
		arrayUtils.moveZeros(actual);
		assertArrayEquals(expected, actual);
	}
	
	
	@ParameterizedTest
	@Order(29)
	@MethodSource("providerArraysForRemoveDuplicate")
	void testRemoveDuplicateWithRegularArray(int [] actual, int expected){
		assertEquals(expected, arrayUtils.removeDuplicates(actual));
	}
	
	private static Stream<Arguments> providerArraysForRemoveDuplicate(){
		return Stream.of(
				Arguments.of(new int[]{1,1,2}, 2),
				Arguments.of(new int[]{1,1,1}, 1),
				Arguments.of(new int[]{1}, 1),
				Arguments.of(new int[]{}, 0),
				Arguments.of(new int[]{1,2,4}, 3),
				Arguments.of(new int[]{1,1,2,3,3}, 3));
	}

}
