package linkedList;

import structures.ListNode;

public class Intersection_of_Two_Linked_Lists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if (headA == null || headB == null) {
    		return null;
    	}
    	int lenA = getLen(headA);
    	int lenB = getLen(headB);
    	int del = Math.abs(lenA - lenB);
    	if (lenA > lenB) {
    		while(del>0) {
    			headA = headA.next;
    			del--;
    		}
    	} else if (lenB > lenA) {
    		while(del>0) {
    			headB = headB.next;
    			del--;
    		}
    	}
    	while (headA != null && headB != null) {
    		if (headA.equals(headB)) {
    			return headA;
    		} else {
				headA = headA.next;
				headB = headB.next;
			}
    	}
        return null;
    }
    private static int getLen(ListNode head) {
    	int count = 0;
    	while (head !=null) {
    		count++;
    		head = head.next;
    	}
    	return count;
    }
}
