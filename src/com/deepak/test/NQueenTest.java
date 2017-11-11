package com.deepak.test;

import static junit.framework.Assert.*;

import org.junit.Test;

import com.deepak.algo.backtracking.NQueenProblemResolver;

public class NQueenTest {
	private NQueenProblemResolver nQueens = new NQueenProblemResolver();

	@Test
	public void testConstraints() {
		int q[] = { 0, 2, 1, 3 };
		System.out.println(nQueens.validateConstraints(q, 4));
		assertEquals(false, nQueens.validateConstraints(q, 4));
	}

	@Test
	public void test4Queens() {
		int q[] = { -1, -1, -1, -1 };
		nQueens.search(q, 4, 0);
	}

	@Test
	public void test8Queens() {
		int q[] = { -1, -1, -1, -1, -1, -1, -1, -1 };
		nQueens.search(q, 8, 0);
		System.out.println(NQueenProblemResolver.count);
	}
}
