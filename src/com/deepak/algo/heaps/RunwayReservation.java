package com.deepak.algo.heaps;

public class RunwayReservation {

	private Node root;

	public void processLandingRequest(int time, int interval) {
		Node node = new Node(time);
		if (root == null) {
			node.parent = null;
			root = node;
			return;
		}
		Node currentNode = root;
		Node parent = currentNode;
		while (currentNode != null) {
			parent = currentNode;
			if (Math.abs(parent.value - node.value) < interval)
				return;
			if (currentNode.value < node.value)
				currentNode = currentNode.right;
			else if (currentNode.value > node.value)
				currentNode = currentNode.left;

		}
		node.parent = parent;
		if (parent.value < node.value
				&& Math.abs(parent.value - node.value) >= interval) {
			parent.right = node;
		} else if (Math.abs(parent.value - node.value) >= interval) {
			parent.left = node;
		}
	}

	public void inOrderTraversal(Node root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.println(root.value + " ");
		inOrderTraversal(root.right);

	}

	public Node getRoot() {
		return root;
	}

}
