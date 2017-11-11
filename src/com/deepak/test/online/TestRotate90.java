package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.RotateMatrix;

public class TestRotate90 {

	RotateMatrix rotate = new RotateMatrix();

	@Test
	public void testRotate() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		System.out.println(rotate.rotate(rotate.convertToList(matrix)));
	}

	@Test
	public void testRotat1e() {
		int[][] matrix = { { 0 } };
		System.out.println(rotate.rotate(rotate.convertToList(matrix)));
	}

	@Test
	public void testRotate5() {
		int[][] matrix = { { 0 } };
		System.out.println(rotate.rotate(rotate.convertToList(matrix)));
	}

}
