package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.Sqrt;

public class TestSqaureRoot {

	Sqrt sqrt = new Sqrt();

	@Test
	public void test() {
		System.out.println(sqrt.sqrt(9));
	}

	@Test
	public void test2() {
		System.out.println(sqrt.sqrt(11));
	}

	@Test
	public void test3() {
		System.out.println(sqrt.sqrt(2));
	}
	
	@Test
	public void test4() {
		System.out.println(sqrt.sqrt(3));
	}
	
	@Test
	public void test5() {
		System.out.println(sqrt.sqrt(2147483647));
	}

}
