package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.AntiDiagonal;

public class TestAntiDiagonal {

	AntiDiagonal diagonal = new AntiDiagonal();

	@Test
	public void test1() {
		int[][] arrays = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(diagonal.diagonal(diagonal.convertToList(arrays)));
	}

	@Test
	public void test2() {
		int[][] arrays = { { 1, 2 }, { 3, 4 } };
		System.out.println(diagonal.diagonal(diagonal.convertToList(arrays)));
	}
	
	@Test
	public void test3() {
		int[][] arrays = { { 1 } };
		System.out.println(diagonal.diagonal(diagonal.convertToList(arrays)));
	}

}
