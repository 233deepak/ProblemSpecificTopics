package com.deepak.algo.onlineTest;

public class ReverseList {

	public Node reverse(Node start, int k) {
		Node temp = start, next;
		if (start == null)
			return null;
		for (int i = 0; i < k - 1; i++) {
			if (temp.next != null) {
				next = temp.next;
				temp.next = next.next;
				next.next = start;
				start = next;
			}
		}
		temp.next = reverse(temp.next, k);
		return start;
	}

	public Node createLinkedList(int[] array) {
		Node start = null, end = null, temp;
		for (int i = 0; i < array.length; i++) {
			if (start == null) {
				start = new Node(array[i], null);
				end = start;
			} else {
				temp = new Node(array[i], null);
				end.next = temp;
				end = temp;
			}
		}
		return start;
	}

	public void printList(Node staNode) {
		Node tempNode = staNode;
		while (tempNode != null) {
			System.out.print(tempNode.value + "-->");
			tempNode = tempNode.next;
		}

	}
}

class Node {
	int value;
	Node next;

	public Node(int value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}

	@Override
	public String toString() {
		Node tempNode = this;
		String result = "";
		while (tempNode != null) {
			result += tempNode.value + "-->";
			tempNode = tempNode.next;
		}
		return result;
		// return "Node [value=" + value + ", next=" + next + "]";
	}

}
