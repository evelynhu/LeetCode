package test;

import static org.junit.Assert.assertEquals;
import linkedList.Intersection_of_Two_Linked_Lists;
import linkedList.Merge_Two_Sorted_Lists;
import linkedList.Remove_Duplicates_from_Sorted_List;
import linkedList.Remove_Nth_Node_from_End_of_List;

import org.junit.Test;

import structures.ListNode;

public class Linked_List {
	@Test
	public void RemoveNthNodeFromEndofList() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		Remove_Nth_Node_from_End_of_List.removeNthFromEnd(n1, 3);
		assertEquals(n4, n2.next);
	}
	@Test
	public void testRemoveNthNodeFromEndofList() {
		ListNode n1 = new ListNode(1);
		ListNode n1_1 = new ListNode(1);
		ListNode n1_2 = new ListNode(2);
		ListNode n2 = new ListNode(1);
		ListNode n2_1 = new ListNode(1);
		ListNode n2_2 = new ListNode(2);
		ListNode n2_3 = new ListNode(3);
		ListNode n2_4 = new ListNode(3);
		n1.next = n1_1;
		n1_1.next = n1_2;
		n2.next = n2_1;
		n2_1.next = n2_2;
		n2_2.next = n2_3;
		n2_3.next = n2_4;
		Remove_Duplicates_from_Sorted_List.deleteDuplicates(n1);
		assertEquals(n1_2, n1.next);
		Remove_Duplicates_from_Sorted_List.deleteDuplicates(n2);
		assertEquals(n2_2, n2.next);
		assertEquals(null, n2_3.next);
	}
	@Test
	public void testMergeTwoSortedLists() {
		ListNode n1 = new ListNode(1);
		ListNode n1_1 = new ListNode(3);
		ListNode n1_2 = new ListNode(5);
		ListNode n2 = new ListNode(2);
		ListNode n2_1 = new ListNode(4);
		ListNode n2_2 = new ListNode(6);
		ListNode n2_3 = new ListNode(8);
		ListNode n2_4 = new ListNode(9);
		n1.next = n1_1;
		n1_1.next = n1_2;
		n2.next = n2_1;
		n2_1.next = n2_2;
		n2_2.next = n2_3;
		n2_3.next = n2_4;
		ListNode l3 = Merge_Two_Sorted_Lists.mergeTwoLists(n1, n2);
		assertEquals(n1, l3);
		assertEquals(n1_1, n2.next);
		assertEquals(n2_2, n1_2.next);
	}
	@Test
	public void testIntersectionofTwoLinkedLists() {
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode b1 = new ListNode(3);
		ListNode b2 = new ListNode(4);
		ListNode b3 = new ListNode(5);
		ListNode c1 = new ListNode(6);
		ListNode c2 = new ListNode(7);
		ListNode c3 = new ListNode(8);
		a1.next = a2;
		a2.next = c1;
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;
		c1.next = c2;
		c2.next = c3;
		assertEquals(c1, Intersection_of_Two_Linked_Lists.getIntersectionNode(a1, b1));
		ListNode d1 = new ListNode(1);
		ListNode e1 = d1;
		assertEquals(d1, Intersection_of_Two_Linked_Lists.getIntersectionNode(d1, e1));
	}
}
