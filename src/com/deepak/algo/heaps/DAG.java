package com.deepak.algo.heaps;

import java.beans.DesignMode;
import java.util.List;

public class DAG {

	private DFS dfs;
	private static double INFINITY = Double.MAX_VALUE;

	public DAG(List<Vertex> vertexs, Edge[] edges) {
		this.dfs = new DFS(vertexs, edges);
	}

	public void init() {
		List<Vertex> vertexs = dfs.getTopologicalOrder();
		int first = 0;
		int last = vertexs.size() - 1;
		while (first <= last) {
			Vertex temp = vertexs.get(first);
			vertexs.set(first, vertexs.get(last));
			vertexs.set(last, temp);
			first++;
			last--;
		}

		dfs = new DFS(vertexs, dfs.getEdges());
	}

	public void doTopologicalSort() {
		dfs.dfs();
		init();
	}

	public void findSohrtestpath(Vertex source) {

		int sourceIndex = dfs.vertexs.indexOf(source);
		// set the cost of previous nodes to infinity
		for (int index = 0; index < sourceIndex; index++) {
			dfs.vertexs.get(index).cost = INFINITY;
		}
		dfs.vertexs.get(sourceIndex).cost = 0;
		relaxEdges(sourceIndex);
	}

	private void relaxEdges(int sourceIndex) {
		if (sourceIndex > dfs.vertexs.size() - 1)
			return;
		for (Integer integer : dfs.graph.get(sourceIndex)) {
			Vertex source = dfs.vertexs.get(sourceIndex);
			Vertex destination = dfs.vertexs.get(integer);
			if (destination.cost > source.cost
					+ dfs.weightMatrix[sourceIndex][integer]) {
				destination.cost = source.cost
						+ dfs.weightMatrix[sourceIndex][integer];
				destination.parent = source;
			}
		}
		relaxEdges(sourceIndex + 1);

	}

	public void printShortestPath(Vertex source, Vertex destination) {
		if (source.equals(destination)) {
			return;
		}
		System.out.print(destination.name + "-->");
		printShortestPath(source, destination.parent);

	}

	public List<List<Integer>> getGraph() {
		return dfs.graph;
	}

}
