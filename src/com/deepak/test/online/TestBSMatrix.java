package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.BSMatrix;

public class TestBSMatrix {

	BSMatrix bsMatrix = new BSMatrix();

	@Test
	public void test() {
		int[][] array = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
				{ 23, 30, 34, 50 } };
		System.out.println(bsMatrix.searchMatrix(bsMatrix.convertToList(array),
				3));
	}

	@Test
	public void test2() {
		int[][] array = { { 3 }, { 29 }, { 36 }, { 63 }, { 67 }, { 72 },
				{ 74 }, { 78 }, { 85 } };
		System.out.println(bsMatrix.searchMatrix(bsMatrix.convertToList(array),
				41));
	}

}
