package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.nphard.Graph;
import com.deepak.algo.nphard.HamiltonionPath;

public class HamiltonionPathTest {

	HamiltonionPath hamiltonionPath = new HamiltonionPath();

	@Test
	public void testCreateGraph() {
		Integer[] vertices = { 1, 2, 3, 4 };
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 }, { 1, 4 } };
		Graph<Integer> graph = new Graph<Integer>(vertices, edges);
		System.out.println(graph);
	}

	@Test
	public void testCreateGraph2() {
		Integer[] vertices = { 1, 2, 3, 4 };
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 }, { 1, 4 } };
		Graph<Integer> graph = new Graph<Integer>(vertices, edges);
		System.out.println(graph);
		boolean[] visited = { true, false, false, false };
		System.out.println(hamiltonionPath.hamiltonionPath(visited, 1, graph));

	}

	@Test
	public void testCreateGraph3() {
		Integer[] vertices = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 4 }, { 4, 5 },
				{ 5, 6 }, { 5, 8 }, { 6, 7 }, { 7, 8 } };
		Graph<Integer> graph = new Graph<Integer>(vertices, edges);
		System.out.println(graph);
		boolean[] visited = { true, false, false, false, false, false, false,
				false };
		System.out.println(hamiltonionPath.hamiltonionPath(visited, 1, graph));

	}
	
	@Test
	public void testCreateGraph4() {
		Integer[] vertices = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 4 }, 
				{ 5, 6 }, { 5, 8 }, { 6, 7 }, { 7, 8 } };
		Graph<Integer> graph = new Graph<Integer>(vertices, edges);
		System.out.println(graph);
		boolean[] visited = { true, false, false, false, false, false, false,
				false };
		System.out.println(hamiltonionPath.hamiltonionPath(visited, 1, graph));

	}

}
