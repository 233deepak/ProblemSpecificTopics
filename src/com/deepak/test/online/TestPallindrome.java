package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.Pallindrome;

public class TestPallindrome {
	Pallindrome pallindrome = new Pallindrome();

	@Test
	public void test() {
       System.out.println(pallindrome.pallindrome(2147447412));
	}
	
	@Test
	public void test2() {
       System.out.println(pallindrome.reverse(-1146467285));
	}

	@Test
	public void test3() {
       System.out.println(pallindrome.reverse(-123));
	}
}
