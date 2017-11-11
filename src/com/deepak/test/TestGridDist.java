package com.deepak.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.deepak.algo.onlineTest.Grid;
import com.deepak.algo.onlineTest.GridTraversal;

public class TestGridDist {
	//GridTraversal gridTraversal = new GridTraversal();
	Grid gridTraversal = new Grid();

	@Test
	public void test1() {
		List<Integer> X = gridTraversal.getList(new int[] { 0, 1, 1 });
		List<Integer> Y = gridTraversal.getList(new int[] { 0, 1, 2 });
		System.out.println(gridTraversal.coverPoints((ArrayList<Integer>) X,
				(ArrayList<Integer>) Y));
	}

	@Test
	public void test2() {
		List<Integer> X = gridTraversal.getList(new int[] { 2, 6 });
		List<Integer> Y = gridTraversal.getList(new int[] { 3, 5 });
		System.out.println(gridTraversal.coverPoints((ArrayList<Integer>) X,
				(ArrayList<Integer>) Y));
	}

	@Test
	public void test3() {
		List<Integer> X = gridTraversal.getList(new int[] { -4, 1, -4, 8, -11,
				-12, -13, -3, -4, -4, -14, 7, -2, -2, -5, 5, -1, 0 });
		List<Integer> Y = gridTraversal.getList(new int[] { -8, -15, -4, 3, 11,
				8, -15, 4, 1, 7, 3, 9, -9, -9, -13, 10, -14, -8 });
		System.out.println(gridTraversal.coverPoints((ArrayList<Integer>) X,
				(ArrayList<Integer>) Y));
	}

	@Test
	public void test4() {
		List<Integer> X = gridTraversal.getList(new int[] { 4, 8, -7, -5, -13,
				9, -7, 8 });
		List<Integer> Y = gridTraversal.getList(new int[] { 4, -15, -10, -3,
				-13, 12, 8, -8 });
		System.out.println(gridTraversal.coverPoints((ArrayList<Integer>) X,
				(ArrayList<Integer>) Y));
	}

	@Test
	public void test5() {
		List<Integer> X = gridTraversal.getList(new int[] { -1, 0, 1 });
		List<Integer> Y = gridTraversal.getList(new int[] { -2, 0, 1 });
		System.out.println(gridTraversal.coverPoints((ArrayList<Integer>) X,
				(ArrayList<Integer>) Y));
	}

}
