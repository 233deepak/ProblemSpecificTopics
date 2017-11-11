package com.deepak.test.online;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.deepak.algo.onlineTest.Sprialmatrix;

public class TestSpiralmatrix {

	private Sprialmatrix sprialmatrix = new Sprialmatrix();

	@Test
	public void test() {
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		sprialmatrix.printSprial(matrix, 0);
	}

	@Test
	public void test1() {
		int matrix[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 }, };
		sprialmatrix.printSprial(matrix, 0);
	}

	@Test
	public void test2() {
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		sprialmatrix.print(matrix, 4, 4);
	}

	@Test
	public void test3() {
		int matrix[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 }, };
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
	    sprialmatrix.spiralOrder(list);

	}

	@Test
	public void test4() {
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}

	@Test
	public void test5() {
		int matrix[][] = { { 313, 157, 290, 113, 119, 118, 187, 360, 104, 365,
				197, 103, 355, 240, 337, 174, 138, 252 } };
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}

	@Test
	public void test6() {
		int matrix[][] = { {1} };
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}

	@Test
	public void test7() {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}
	@Test
	public void test8() {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}
	
	@Test
	public void test9() {
		int matrix[][] = { {1},
				{2},
				{3}};
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}
	
	@Test
	public void test10() {
		int matrix[][] = {{1, 2},
				  {3, 4},
				  {5, 6}};
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}
	@Test
	public void test11() {
		int matrix[][] = {{1, 2},
				  };
		List<ArrayList<Integer>> list = sprialmatrix.prepareList(matrix);
		System.out.println(sprialmatrix.spiralOrder(list));

	}
	
	@Test
	public void test12(){
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		System.out.println(rotateArray((ArrayList<Integer>) integers, 1));
	}
	
	
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			ret.add(A.get((i + B)%A.size()));
		}
		return ret;
	}
}
