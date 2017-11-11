package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.nphard.Hamiltonion;

public class HamiltonionTest {

	private Hamiltonion hamiltonion;

	@Test
	public void testCreateGraph() {
		int[] vertices = { 1, 2, 3, 4 };
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 }, { 1, 4 } };
        hamiltonion =new Hamiltonion(vertices, edges);
	}
	
	@Test
	public void testHP() {
		int[] vertices = { 1, 2, 3, 4 };
		int[][] edges = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 }, { 1, 4 } };
        hamiltonion =new Hamiltonion(vertices, edges);
        System.out.println(hamiltonion.hasHP());
	}

}
