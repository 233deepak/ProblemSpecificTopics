package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.TrailingZeros;

public class TestTrailinZero {

	TrailingZeros trailingZeros = new TrailingZeros();
	
	@Test
	public void test(){
		System.out.println(trailingZeros.trailingZeroes(5));
	}
	
	@Test
	public void test1(){
		System.out.println(trailingZeros.trailingZeroes(10));
	}
	
	@Test
	public void test2(){
		System.out.println(trailingZeros.trailingZeroes(101));
	}
}
