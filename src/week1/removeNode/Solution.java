package week1.removeNode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {

	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public static void main(String[] args) {
		ListNode root = new ListNode(4);
		root.next = new ListNode(5);
		root.next.next = new ListNode(1);
		root.next.next.next = new ListNode(9);

		deleteNode(root.next);

		while (root != null) {
			System.out.println(root.val);
			root = root.next;
		}
	}
}