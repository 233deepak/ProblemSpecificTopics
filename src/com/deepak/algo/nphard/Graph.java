package com.deepak.algo.nphard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph<V> {

	List<V> vertices;
	List<List<Integer>> neighbours;

	public Graph(V[] vertices, int[][] edges) {
		this.vertices = new ArrayList<V>(vertices.length);
		for (V vertex : vertices) {
			this.vertices.add(vertex);
		}
		this.neighbours = new ArrayList<List<Integer>>();
		for (V vertex : this.vertices) {
			List<Integer> list = new LinkedList<Integer>();
			neighbours.add(list);
		}
		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			neighbours.get(u-1).add(v);
		}

	}

	@Override
	public String toString() {
		return "Graph [vertices=" + vertices + ", neighbours=" + neighbours
				+ "]";
	}
     
	
}
