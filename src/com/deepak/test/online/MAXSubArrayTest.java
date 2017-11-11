package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.MaxSubArraySum;
import com.deepak.algo.onlineTest.MaxSubarray;

public class MAXSubArrayTest {

	private MaxSubarray subarry = new MaxSubarray();
	private MaxSubArraySum sum =new MaxSubArraySum();

	@Test
	public void test1() {
		int[] array = { -2, -5, 6, -2, -3, 1, 5, -6 };
		System.out.println(subarry.getMaxSubArray(array, 0, array.length-1));
	}

	@Test
	public void test2() {
		int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
		
		System.out.println(sum.maxSubArray(sum.getList(array)));
	}
}
