package com.deepak.algo.heaps;

public class Vertex {
	String name;
	Vertex parent;
	boolean isVisited;
	Vertex child;
	boolean isProcessing;
	double cost;
	
	public Vertex(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + ", isVisited=" + isVisited
				+ ", isProcessing=" + isProcessing + ", cost=" + cost + "]";
	}

	
}
