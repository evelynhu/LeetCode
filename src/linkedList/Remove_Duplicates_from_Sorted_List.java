package linkedList;

import structures.ListNode;

public class Remove_Duplicates_from_Sorted_List {
    public static ListNode deleteDuplicates(ListNode head) {
    	if (head == null || head.next == null) {
    		return head;
    	}
    	ListNode node = head;
    	while (node!=null) {
    		ListNode tmp = node.next;
    		while (tmp != null && tmp.val == node.val) {
    			tmp = tmp.next;
    		}
    		node.next = tmp;
    		node = node.next;
    	}
        return head;
    }
}
