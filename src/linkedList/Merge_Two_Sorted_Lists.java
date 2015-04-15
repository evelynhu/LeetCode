package linkedList;

import structures.ListNode;

public class Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null) {
    		return l2;
    	} else if (l2 == null) {
    		return l1;
    	}
    	
    	ListNode l3;
    	if (l1.val < l2.val) {
    		l3 = l1;
    		l1 = l1.next;
    	} else {
    		l3 = l2;
    		l2 = l2.next;
    	}
    	ListNode fakeHead = new ListNode(-1);
    	fakeHead.next = l3;
    	while (l1 != null && l2 != null) {
    		if (l1.val < l2.val) {
        		l3.next = l1;
        		l3 = l3.next;
        		l1 = l1.next;
        	} else {
        		l3.next = l2;
        		l3 = l3.next;
        		l2 = l2.next;
        	}
    	}
    	if (l1 != null) {
    		l3.next = l1;
    	} else if (l2 != null) {
    		l3.next = l2;
    	}
        return fakeHead.next;
    }
}
