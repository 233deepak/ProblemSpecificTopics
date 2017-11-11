package com.deepak.algo.heaps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DFS {

	List<List<Integer>> graph;
	List<Vertex> vertexs;
	List<Vertex> topologicalOrder;
	Edge[] edges;
	double[][] weightMatrix;

	public DFS(List<Vertex> vertexs, Edge[] edges) {
		this.vertexs = vertexs;
		this.edges = edges;
		this.topologicalOrder = new ArrayList<Vertex>(vertexs.size());
		init(vertexs, edges);
	}

	public void init(List<Vertex> vertexs, Edge[] edges) {
		this.graph = new ArrayList<List<Integer>>(vertexs.size());
		List<Integer> neighbours;
		for (Vertex vertex : vertexs) {
			vertex.cost = Double.MAX_VALUE;
			neighbours = new LinkedList<Integer>();
			graph.add(neighbours);
		}

		weightMatrix = new double[vertexs.size()][vertexs.size()];
		for (Edge edge : edges) {
			int sourceIndex = vertexs.indexOf(edge.u);
			int destIndex = vertexs.indexOf(edge.v);
			graph.get(sourceIndex).add(destIndex);
			weightMatrix[sourceIndex][destIndex] = edge.weight;
		}

	}

	public void dfs() {
		for (Vertex vertex : vertexs) {
			if (!vertex.isVisited) {
				vertex.parent = null;
				vertex.isVisited = true;
				dfsVisit(vertex);
			}
		}
	}

	private void dfsVisit(Vertex vertex) {
		vertex.isProcessing = true;
		int index = vertexs.indexOf(vertex);
		for (Integer neighbourIndex : graph.get(index)) {
			Vertex childVetrex = vertexs.get(neighbourIndex);
			if (childVetrex.isProcessing) {
				System.out.println();
				System.out.println("Backward Egde :" + vertex.name + "-->"
						+ childVetrex.name);
				System.out.println("cycle detected :");
				System.out.print(childVetrex.name + "<--");
				printBackPath(vertex);

			}
			if (!childVetrex.isVisited) {
				vertex.child = childVetrex;
				childVetrex.isVisited = true;
				childVetrex.parent = vertex;
				dfsVisit(childVetrex);
			}
		}
		vertex.isProcessing = false;
		topologicalOrder.add(vertex);
	}

	private void printBackPath(Vertex vertex) {
		System.out.print(vertex.name + "<--");
		if (vertex.parent == null)
			return;
		printPath(vertex.parent);

	}

	public void printDisjointVisits() {
		for (Vertex vertex : vertexs) {
			if (vertex.parent == null) {
				printPath(vertex);
				System.out.println();
			}
		}
	}

	private void printPath(Vertex vertex) {
		System.out.print(vertex.name + "-->");
		if (vertex.child == null)
			return;
		printPath(vertex.child);
	}

	public List<List<Integer>> getGraph() {
		return graph;
	}

	public List<Vertex> getTopologicalOrder() {
		return topologicalOrder;
	}

	public Edge[] getEdges() {
		return edges;
	}

}
