package linkedlist;

public class _237_DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a linked list
		ListNode head = null;
		head = ListNode.insert(head, 5);
		head = ListNode.insert(head, 10);
		head = ListNode.insert(head, 15);
		System.out.println("LINKED LIST");
		ListNode.displayList(head);
		// Delete second node
		Solution solnClass = new Solution();
		solnClass.deleteNode(head.next);
		System.out.println("List after deletion of 2nd node");
		ListNode.displayList(head);
	}

}

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;
	// ListNode head;

	ListNode(int x) {
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

class Solution {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
