package com.deepak.algo.independentset;

import java.util.List;

public class IndependentSet {
	
	private int [][] edges;
	private int [] vertices;
	private List<Integer> independentset;
	
	public IndependentSet(int[][] edges,int[] vertices){
		
		this.edges=edges;
		this.vertices=vertices;
	}
	
	
	public void findIndependentSet(int [][] edges,Integer []vertices){
		
		Graph<Integer> graph=new UnweightedGraph<Integer>(edges, vertices);
		List<List<Integer>> neighboursList=graph.getAdjancencyList();
		int indexOfMinDegreeeElement=findVertexWithMinimumDegree(neighboursList);
		independentset.add(vertices[indexOfMinDegreeeElement]);
		vertices=removeVertex(vertices,indexOfMinDegreeeElement);
		
	}
	
	private Integer[] removeVertex(Integer[] vertices,
			int indexOfMinDegreeeElement) {
 
		
		return null;
	}


	public int findVertexWithMinimumDegree(List<List<Integer>> neighboursList){
		
		int index=0,minsize=999999999,minIndex = 0;
		for(List<Integer> integers:neighboursList){
			
			if(integers.size()<minsize){
				minIndex=index;
				minsize=integers.size();
			}
			
		}
		
		return minIndex;
	}

	
	
	
	
}
