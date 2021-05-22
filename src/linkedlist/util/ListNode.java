package linkedlist.util;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
	public int val;
	public ListNode next;
	// ListNode head;

	public ListNode(int x) {
		val = x;
		next = null;
	}

	ListNode() {
	}

	public static ListNode insert(ListNode head, int data) {
		ListNode node = new ListNode(data);
		if (head == null) {
			head = node;
			return head;
		}
		node.next = null;
		ListNode last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = node;
		return head;
	}

	public static void displayList(ListNode head) {
		ListNode curr = head;
		if (head != null) {
			while (curr != null) {
				System.out.println(curr.val);
				curr = curr.next;
			}
		}
	}
}