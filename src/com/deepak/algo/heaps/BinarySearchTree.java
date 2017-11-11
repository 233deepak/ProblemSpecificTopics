package com.deepak.algo.heaps;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree(int[] array) {
		buildInitialTree(array);
	}

	public void buildInitialTree(int[] array) {
		for (int element : array) {
			insert(element);
		}
	}

	private void insert(int element) {
		Node node = new Node(element);
		if (root == null) {
			root = node;
			node.parent = null;
			node.subtreeSize++;
			return;
		}
		Node currentNode = root;
		Node parent = currentNode;
		while (currentNode != null) {
			parent = currentNode;
			parent.subtreeSize++;
			if (currentNode.value < node.value)
				currentNode = currentNode.right;
			else if (currentNode.value > node.value)
				currentNode = currentNode.left;

		}
		node.parent = parent;
		node.subtreeSize++;
		if (parent.value < node.value) {
			parent.right = node;
		} else {
			parent.left = node;
		}
	}

	public int rankOfElement(int element, Node root) {
		if (root == null)
			return 0;
		if (root.value == element) {
			int subtreeSize = (root.left != null) ? 1 + root.left.subtreeSize
					: 1;
			return subtreeSize;
		}

		if (root.value < element) {
			int subtreeSize = (root.left != null) ? 1 + root.left.subtreeSize
					: 1;
			return subtreeSize + rankOfElement(element, root.right);
		} else {
			return rankOfElement(element, root.left);
		}

	}

	public void inOrderTraversal(Node root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.value + " ");
		inOrderTraversal(root.right);

	}

	public int max(Node root) {
		if (root == null)
			return -1;
		if (root.right == null)
			return root.value;
		return max(root.right);

	}

	public int getNextLargest(Node root, int element) {
		if (root == null)
			return 0;
		Node node = search(element, root);
		if (node.right != null)
			return max(root.right);
		else {
			Node current = node;
			Node parent = current.parent;
			while (parent != null && parent.right == current) {
				current = parent;
				parent = current.parent;
			}
			return parent.value;
		}

	}

	public Node search(int element, Node root) {
		Objects.requireNonNull(root);
		if (root.value == element)
			return root;
		else if (element < root.value)
			return search(element, root.left);
		else
			return search(element, root.right);
	}

	public void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(node.value + " ");
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);

		}

	}

	public Node getRoot() {
		return root;
	}
}

class Node {

	int value;
	Node left;
	Node right;
	Node parent;
	int subtreeSize;

	public Node(int value) {
		this.value = value;
		this.subtreeSize = 0;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

}
