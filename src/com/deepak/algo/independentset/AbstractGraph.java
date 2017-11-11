package com.deepak.algo.independentset;

import java.util.ArrayList;
import java.util.List;

public class AbstractGraph<V> implements Graph<V> {
	
	private List<List<Integer>> neighbours;
	private int[][] adjacencyMatrix;
	private List<V> vertices;
	
	public AbstractGraph(int edges[][],V[] vertices) {
          
		this.adjacencyMatrix=new int[vertices.length][vertices.length];
		this.vertices=new ArrayList<V>();
	    for(V v:vertices){
	    	this.vertices.add(v);
	    }
	    
	    createAdjacencyList(edges,vertices);
	
	}
	

	private void createAdjacencyList(int[][] edges, V[] vertices) {

		this.neighbours=new ArrayList<List<Integer>>(vertices.length);
		for(int i=0;i<vertices.length;i++)
			neighbours.add(new ArrayList<Integer>());
		for(int i=0;i<edges.length;i++){
			
			int u=edges[i][0];
			int v=edges[i][1];
			neighbours.get(u).add(v);
		}
		
	}


	@Override
	public List<V> getNeighbours(V v) {

		
		return null;
	}

	@Override
	public List<List<Integer>> getAdjancencyList(){
		return neighbours;
		
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[][] getAdjacencyMatrix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<V> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}

}
