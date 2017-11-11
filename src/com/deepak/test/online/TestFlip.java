package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.Flip;

public class TestFlip {
	Flip flip = new Flip();

	@Test
	public void test1() {
		System.out.println(flip.flip("1011001000"));
	}
	

	@Test
	public void test3() {
		System.out.println(flip.flip("0100110"));
	}
	
	@Test
	public void test2() {
		System.out.println(flip.flip("010"));
	}
	
	@Test
	public void test4() {
		System.out.println(flip.flip("111"));
	}
	
	@Test
	public void test6() {
		System.out.println(flip.flip("01010110"));
	}

	@Test
	public void test7() {
		System.out.println(flip.flip("100101101"));
	}
	
}
