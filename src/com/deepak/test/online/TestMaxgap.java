package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.MaxCinsecutiveGap;

public class TestMaxgap {

	MaxCinsecutiveGap gap = new MaxCinsecutiveGap();

	@Test
	public void test() {
		int[] array = { 1, 10, 5 };
		System.out.println(gap.maximumGap(gap.getList(array)));
	}
	
	@Test
	public void test1() {
		int[] array = { 1, 2,5,7,0,3,4 };
		System.out.println(gap.maximumGap(gap.getList(array)));
	}
	
	@Test
	public void test3() {
		int[] array = { 1, 2 };
		System.out.println(gap.maximumGap(gap.getList(array)));
	}
	@Test
	public void test4() {
		int[] array = { 1,1, 2 };
		System.out.println(gap.maximumGap(gap.getList(array)));
	}
	

}
