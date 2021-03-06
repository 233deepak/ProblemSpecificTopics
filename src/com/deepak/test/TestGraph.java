package com.deepak.test;

import java.util.List;

import org.junit.Test;

import com.deepak.algo.independentset.Graph;
import com.deepak.algo.independentset.UnweightedGraph;

public class TestGraph {
	
	@Test
	public void testGraph(){
		
		int[][] edges = {
				 {0, 1}, {0, 3}, {0, 5},
				 {1, 0}, {1, 2}, {1, 3},
				 {2, 1}, {2, 3}, {2, 4}, {2, 10},
				 {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
				 {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
				 {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
				 {6, 5}, {6, 7},
				 {7, 4}, {7, 5}, {7, 6}, {7, 8},
				 {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
				 {9, 8}, {9, 11},
				 {10, 2}, {10, 4}, {10, 8}, {10, 11},
				 {11, 8}, {11, 9}, {11, 10}
				 };
		
		String[] vertices = {"Seattle", "San Francisco", "Los Angeles",
				 "Denver", "Kansas City", "Chicago", "Boston", "New York",
				 "Atlanta", "Miami", "Dallas", "Houston"};	
	    Graph<String> graph=new UnweightedGraph<String>(edges, vertices);
	    List<List<Integer>> neighboursList=graph. getAdjancencyList();
	    System.out.println(neighboursList);
	  
	}

}
