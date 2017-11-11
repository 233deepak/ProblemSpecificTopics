package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.MaxDistance;

public class TestMaxDist {

	MaxDistance dist = new MaxDistance();

	@Test
	public void test() {
		int[] array = { 3, 5, 4, 2 };
		System.out.println(dist.maximumGap(dist.getList(array)));
	}
	

	@Test
	public void test3() {
		int[] array = { 100, 100, 100, 100, 100 };
		System.out.println(dist.maximumGap(dist.getList(array)));
	}
	
	@Test
	public void test4() {
		int[] array = {3, 2, 1};
		System.out.println(dist.maximumGap(dist.getList(array)));
	}
	

}
