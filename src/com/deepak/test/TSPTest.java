package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.backtracking.TSPSolver;

public class TSPTest {

	private TSPSolver tspSolver = new TSPSolver();

	@Test
	public void testEvaluteCost() {
		int[][] costmatrix = { { 0, 2, 6, 1 }, { 2, 0, 9, 2 }, { 6, 9, 0, 4 },
				{ 1, 2, 4, 0 } };
		int q[] = { 0, 2, 1, 3 };
		tspSolver.setCostmatrix(costmatrix);
		System.out.println(tspSolver.evaluateCost(q, 4));
	}

	@Test
	public void testEvaluteCost1() {
		int[][] costmatrix = { { 0, 2, 6, 1 }, { 2, 0, 9, 2 }, { 6, 9, 0, 4 },
				{ 1, 2, 4, 0 } };
		int q[] = { 2, 0, 1, 3 };
		tspSolver.setCostmatrix(costmatrix);
		System.out.println(tspSolver.evaluateCost(q, 4));
	}

	@Test
	public void testEvaluteMinCost1() {
		int[][] costmatrix = { { 0, 2, 6, 1 }, { 2, 0, 9, 2 }, { 6, 9, 0, 4 },
				{ 1, 2, 4, 0 } };
		double q[] = { 2, 1, 1, 3 };
		System.out.println(tspSolver.findMinimum(q));
	}

	@Test
	public void testRequiredNodes() {
		int[] nodes = { 0, 1, 2, 3 };
		int[] q = { 2, 1, -1, -1 };
		tspSolver.setNodes(nodes);
		int[] requiredNodes = tspSolver.unTouchedNodes(q, 4);
		tspSolver.print(requiredNodes, requiredNodes.length);
	}

	@Test
	public void findMinimumRoot() {
		int[][] costmatrix = { { 0, 2, 6, 1 }, { 2, 0, 9, 2 }, { 6, 9, 0, 4 },
				{ 1, 2, 4, 0 } };
		int[] q = { 0, -1, -1, -1 };
		int[] nodes = { 0, 1, 2, 3 };
		tspSolver.setNodes(nodes);
		tspSolver.setCostmatrix(costmatrix);
		System.out.println(tspSolver.search(q, 4, 1));
	}

}
