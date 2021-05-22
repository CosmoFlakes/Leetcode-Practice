package linkedlist;

import linkedlist.util.ListNode;

public class _237_DeleteNode {
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

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
		deleteNode(head.next);
		System.out.println("List after deletion of 2nd node");
		ListNode.displayList(head);
	}

}
