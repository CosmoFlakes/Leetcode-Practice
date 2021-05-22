package linkedlist;

import linkedlist.util.*;

public class _876_MiddleOfLinkedList {

	public ListNode middleNode(ListNode head) {
		ListNode slow = null;
		ListNode fast;
		if (head != null) {
			slow = head;
			fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return slow;

	}

	public static void main(String[] args) {
		ListNode head = new _876_MiddleOfLinkedList().middleNode(null);
		ListNode.displayList(head);
	}

}
