package com.deepak.algo.huffmanCode;

public class Node<T> implements Comparable {

	T value;
	String code;
	int frequency;
	Node<T> left;
	Node<T> right;

	public Node() {
	};

	public Node(T value, int frequency) {
		super();
		this.value = value;
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", code=" + code + ", frequency="
				+ frequency + ", left=" + left + ", right=" + right + "]";
	}

	@Override
	public int compareTo(Object o) {
		Node node = (Node<T>) o;
		if (this.frequency > node.frequency)
			return 1;
		else if (this.frequency < node.frequency)
			return -1;
		else
			return 0;
	}

}
