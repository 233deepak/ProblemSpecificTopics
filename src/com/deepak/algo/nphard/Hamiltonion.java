package com.deepak.algo.nphard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hamiltonion {

	List<Node> graph;

	public Hamiltonion(int[] vertices, int[][] edges) {
		intit(vertices, edges);
	}

	private void intit(int[] vertices, int[][] edges) {
		graph = new ArrayList<Node>(vertices.length);
		for (int vertex : vertices) {
			graph.add(new Node(vertex, null, 0));
		}
		for (int[] edge : edges) {
			addNodeAtLast(edge[0], edge[1]);
			addNodeAtLast(edge[1], edge[0]);
		}
		System.out.println(graph);
	}

	private void addNodeAtLast(int index, int value) {
		Node node = new Node(value, null, 0);
		Node vertex = graph.get(index-1);
		while (vertex.next != null) {
			vertex = vertex.next;
		}
		vertex.next = node;
	}

	public boolean hasHP() {
		return DFS(graph.get(1));
	}

	private boolean DFS(Node node) {
		if (allNodeVisited()) {
			return true;
		} else {
			graph.get(node.value-1).visitedCount++;
			while (node.next != null) {
				DFS(node.next);
				node = graph.get(node.value-1);
			}
			return false;
		}
	}

	private boolean allNodeVisited() {
		for (Node node : graph) {
			if (node.visitedCount != 1)
				return false;
		}
		return true;
	}

}

class Node {

	int value;
	Node next;
	int visitedCount;

	public Node(int value, Node next, int visitedCount) {
		super();
		this.value = value;
		this.next = next;
		this.visitedCount = visitedCount;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + ", visitedCount="
				+ visitedCount + "]";
	}

}