package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import array.Majority_Element;
import array.Merge_Sorted_Array;
import array.Pascals_Triangle;
import array.Pascals_Triangle2;
import array.Plus_One;
import array.Remove_Duplicates_from_Sorted_Array;
import array.Remove_Element;
import array.Rotate_Array;

public class Array {
	@Test
	public void testRotateArray() {
		int[] nums = {1,2,3,4,5,6,7};
		Rotate_Array.rotate(nums, 3);
		int[] rotated_nums = {5,6,7,1,2,3,4};
    	assertTrue(tools.compareArrays(nums, rotated_nums));
	}

	@Test
	public void testRemoveElement() {
		int[] nums = {1,2,3,4,3,6,7};
    	assertEquals(5, Remove_Element.removeElement(nums, 3));
	}
	@Test
	public void testRemoveDuplicatesfromSort() {
		int[] nums = {1,2,3,3,4,5,6,7};
    	assertEquals(7, Remove_Duplicates_from_Sorted_Array.removeDuplicates(nums));
		int[] nums1 = {0,0,0,0,0};
    	assertEquals(1, Remove_Duplicates_from_Sorted_Array.removeDuplicates(nums1));
		int[] nums2 = {-1,0,1,3,3};
    	assertEquals(4, Remove_Duplicates_from_Sorted_Array.removeDuplicates(nums2));
		int[] nums3 = {1};
    	assertEquals(1, Remove_Duplicates_from_Sorted_Array.removeDuplicates(nums3));
    	
	}
	@Test
	public void testMergeSortedArray() {
		int[] A = {1,3,5,7,9,0,0,0,0,0};
		int[] B = {2,4,6,8,10};
		int[] result = {1,2,3,4,5,6,7,8,9,10};
		Merge_Sorted_Array.merge(A, 5, B, 5);
    	assertTrue(tools.compareArrays(result, A));
    	int[] A_ = {6,7,8,9,10,0,0,0,0,0};
		int[] B_ = {1,2,3,4,5};
		Merge_Sorted_Array.merge(A_, 5, B_, 5);
    	assertTrue(tools.compareArrays(result, A_));
	}
	@Test
	public void testPlusOne() {
		int[] digits = {9,9,9};
		int[] result = {1,0,0,0};
    	assertTrue(tools.compareArrays(result, Plus_One.plusOne(digits)));
		int[] digits2 = {9,9,8};
		int[] result2 = {9,9,9};
    	assertTrue(tools.compareArrays(result2, Plus_One.plusOne(digits2)));
	}
	@Test
	public void testGetRow() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(1);
		assertTrue(tools.compareLists(list, Pascals_Triangle2.getRow(3)));
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(4);
		list1.add(6);
		list1.add(4);
		list1.add(1);
		assertTrue(tools.compareLists(list1, Pascals_Triangle2.getRow(4)));
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		assertTrue(tools.compareLists(list2, Pascals_Triangle2.getRow(0)));
		assertTrue( Pascals_Triangle2.getRow(-1) == null);
	}
	@Test
	public void testMajorityElement() {
		//1,2,2,3,4,5,5,5,5,5,5
		int intArray[] = { 4, 5, 2, 5, 1, 5, 2, 5, 3, 5, 5};
		assertEquals(5, Majority_Element.majorityElement(intArray));
	}
	@Test
	public void testPascalsTriangle() {
		 List<List<Integer>> pascalsTriangle = new ArrayList<>();
		 List<Integer> row1 = new ArrayList<>();
		 row1.add(1);
		 pascalsTriangle.add(row1);
		 List<Integer> row2 = new ArrayList<>();
		 row2.add(1);
		 row2.add(1);
		 pascalsTriangle.add(row2);
		 List<Integer> row3 = new ArrayList<>();
		 row3.add(1);
		 row3.add(2);
		 row3.add(1);
		 pascalsTriangle.add(row3);
		 List<Integer> row4 = new ArrayList<>();
		 row4.add(1);
		 row4.add(3);
		 row4.add(3);
		 row4.add(1);
		 pascalsTriangle.add(row4);
		 List<Integer> row5 = new ArrayList<>();
		 row5.add(1);
		 row5.add(4);
		 row5.add(6);
		 row5.add(4);
		 row5.add(1);
		 pascalsTriangle.add(row5);
		assertEquals(pascalsTriangle, Pascals_Triangle.generate(5));
	}

}
