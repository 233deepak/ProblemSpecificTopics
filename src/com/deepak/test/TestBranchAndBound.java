package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.branchAndBound.KnapSackResolver;

public class TestBranchAndBound {

	private KnapSackResolver knapSackResolver;

	@Test
	public void testConstraints() {
		int[] values = { 20, 3, 7, 5 };
		int[] weights = { 5, 2, 4, 1 };
		knapSackResolver = new KnapSackResolver(values, weights, 8);
		int[] objects = { 1, 0, 0, 1 };
		knapSackResolver.setInitialObject(objects);
		System.out.println(knapSackResolver.checkConstraints(objects));

	}

	@Test
	public void testConstraints2() {
		int[] values = { 20, 3, 7, 5 };
		int[] weights = { 5, 2, 4, 1 };
		knapSackResolver = new KnapSackResolver(values, weights, 8);
		int[] objects = { 1, 0, 1, 1 };
		knapSackResolver.setInitialObject(objects);
		System.out.println(knapSackResolver.checkConstraints(objects));

	}

	@Test
	public void testCostFunction() {
		int[] values = { 20, 3, 7, 5 };
		int[] weights = { 5, 2, 4, 1 };
		knapSackResolver = new KnapSackResolver(values, weights, 8);
		int[] objects = { 1, 0, 1, 1 };
		knapSackResolver.setInitialObject(objects);
		System.out.println(knapSackResolver.getCost(objects));

	}

	@Test
	public void testSearch() {
		int[] values = { 20, 3, 7, 5 };
		int[] weights = { 5, 2, 4, 1 };
		knapSackResolver = new KnapSackResolver(values, weights, 8);
		int[] objects = { -1, -1, -1, -1 };
		System.out.println(knapSackResolver.search(objects, 0));
	}

	@Test
	public void testSearch1() {
		int[] values = { 4, 2, 2, 1, 10 };
		int[] weights = { 12, 1, 2, 1, 4 };
		knapSackResolver = new KnapSackResolver(values, weights, 15);
		int[] objects = { -1, -1, -1, -1 ,-1 };
		System.out.println(knapSackResolver.search(objects, 0));
	}
}
