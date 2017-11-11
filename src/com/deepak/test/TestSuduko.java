package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.backtracking.Slot;
import com.deepak.algo.backtracking.SudukoSolver;

public class TestSuduko {

	private SudukoSolver sudukoSolver = new SudukoSolver();

	@Test
	public void testConstraints() {
		int[][] object = { { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 } };
		System.out.println(sudukoSolver.checkConstraint(object, 9));
	}

	@Test
	public void test1DArray() {
		int[] array = { 3, 2, 9, 7, 4, 5, 8, 9, 5 };
		System.out.println(sudukoSolver.isValidArray(array, 9));
	}

	@Test
	public void test3X3condition() {
		int[][] object = { { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 5, 4, 6, 7, 4, 5, 8, 9, 6 }, { 9, 8, 7, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 } };
		System.out.println(sudukoSolver.checkfor3X3Grid(object, 9));
	}

	@Test
	public void test3X3condition1() {
		int[][] object = { { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 5, 4, 6, 1, 2, 3, 7, 5, 4 }, { 9, 8, 7, 6, 8, 9, 1, 2, 3 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 },
				{ 3, 2, 1, 7, 4, 5, 8, 9, 6 }, { 3, 2, 1, 7, 4, 5, 8, 9, 6 } };
		System.out.println(sudukoSolver.checkfor3X3Grid(object, 9));
	}

	@Test
	public void testSuduko() {
		int[][] object = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				object[i][j] = -1;
			}
		}
		sudukoSolver.search(object, 9, new Slot(0, 0));
	}

	@Test
	public void testSlotGenerator() {
		Slot slot = new Slot(0, 8);
		System.out.println(sudukoSolver.findNextSlot(slot));

	}
	@Test
	public void testSlotGenerator1() {
		Slot slot = new Slot(1, 8);
		System.out.println(sudukoSolver.findNextSlot(slot));

	}
	@Test
	public void testSlotGenerator2() {
		Slot slot = new Slot(8, 8);
		System.out.println(sudukoSolver.findNextSlot(slot));

	}
	
	

}
