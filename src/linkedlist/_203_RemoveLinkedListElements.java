package linkedlist;

import linkedlist.util.ListNode;

public class _203_RemoveLinkedListElements {

	public static ListNode removeElements(ListNode head, int val) {
		ListNode temp = head;
		while (head != null && head.val == val) {
			head = head.next;
		}
		if(head==null)
		{
			return head;
		}
		else if(head.next==null && head.val!=val)
			return head;
		else
		 {
			while (temp.next.next != null) {
				if (temp.next.val == val) {
					temp.next = temp.next.next;
				} else
					temp = temp.next;
			}
			if (temp.next.next == null && temp.next.val == val) {
				temp.next = null;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = null;

		head = ListNode.insert(head, 20);
		head = ListNode.insert(head, 2);
		head = ListNode.insert(head, 2);
		head = ListNode.insert(head, 2);
		head = ListNode.insert(head, 20);
		head = _203_RemoveLinkedListElements.removeElements(head, 2);
		ListNode.displayList(head);

	}

}
