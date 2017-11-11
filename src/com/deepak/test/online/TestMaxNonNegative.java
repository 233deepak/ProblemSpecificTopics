package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.MaxNonNagetiveArray;

public class TestMaxNonNegative {

	MaxNonNagetiveArray subArraySum = new MaxNonNagetiveArray();

	@Test
	public void test1() {
		int[] array = { 1, 2, 5, -7, 2, 3 };
		System.out.println(subArraySum.maxset(subArraySum.convertList(array)));
	}

	@Test
	public void test2() {
		int[] array = { 1, 2, 5, -7, 2, 3, 4 };
		System.out.println(subArraySum.maxset(subArraySum.convertList(array)));
	}
	
	@Test
	public void test3() {
		int[] array = { 1, 2, 5, -7, 2, 3, 3 };
		System.out.println(subArraySum.maxset(subArraySum.convertList(array)));
	}
	
	@Test
	public void test4() {
		int[] array = { 336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421 };
		System.out.println(subArraySum.maxset(subArraySum.convertList(array)));
	}
	
	@Test
	public void test5() {
		int[] array = { 1159126505, -1632621729, 1433925857, 84353895, 2001100545, 1548233367, -1585990364 };
		System.out.println(subArraySum.maxset(subArraySum.convertList(array)));
	}
	
	@Test
	public void test6() {
		int[] array = { -52263  };
		System.out.println(subArraySum.maxset(subArraySum.convertList(array)));
	}
	
	
}
