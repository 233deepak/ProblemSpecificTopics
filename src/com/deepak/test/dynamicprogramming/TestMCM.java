package com.deepak.test.dynamicprogramming;

import org.junit.Test;

import com.deepak.algo.dynamicprogramming.MatrixCM;
import com.deepak.algo.dynamicprogramming.MatrixCMTable;

public class TestMCM {

	private MatrixCM matrixCM = new MatrixCM();
	private MatrixCMTable matrixCMTable = new MatrixCMTable();

	@Test
	public void testSubArray() {
		int[] array = { 3, 2, 4, 5, 1 };
		matrixCM.print(matrixCM.getSubArray(array, 0, 2));

	}

	@Test
	public void testMin() {
		int[] array = { 3, 2, 4, 5, 1 };
		System.out.println(matrixCM.findMin(array));

	}

	@Test
	public void testMinimizeCost() {
		int[] array = { 3, 2, 4, 1 };
		System.out.println(matrixCM.search(array));
	}

	@Test
	public void testMinimizeCost1() {
		int[] array = { 40, 20, 30, 10, 30 };
		System.out.println(matrixCM.search(array));
	}

	@Test
	public void testMinimizeCost3() {
		int[] array = { 3, 2, 4, 1 };
		System.out.println(matrixCMTable.search(array));
	}
	
	@Test
	public void testMinimizeCost6() {
		int[] array = { 40, 20, 30, 10, 30 };
		System.out.println(matrixCM.search(array));
	}
	
}
