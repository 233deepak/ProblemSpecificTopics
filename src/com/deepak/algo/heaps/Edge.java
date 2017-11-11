package com.deepak.algo.heaps;


public class Edge {
	Vertex u;
	Vertex v;
	double weight;
	
	
	public Edge(Vertex u, Vertex v, double weight) {
		super();
		this.u = u;
		this.v = v;
		this.weight = weight;
	}

	public Edge(Vertex u, Vertex v) {
		super();
		this.u = u;
		this.v = v;
	}

	@Override
	public String toString() {
		return "Edge [u=" + u.name + ", v=" + v.name + "]";
	}

}

