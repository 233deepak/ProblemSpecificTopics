package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.PowerOfTwo;

public class TestPowerOfTwo {
	
	PowerOfTwo powerOfTwo =new PowerOfTwo();
	
	@Test
	public void test(){
		System.out.println(powerOfTwo.isPower(4));
	}
	
	@Test
	public void test1(){
		System.out.println(powerOfTwo.isPower(49));
	}
	
	@Test
	public void test2(){
		System.out.println(powerOfTwo.isPower(10));
	}
	
	@Test
	public void test3(){
		System.out.println(powerOfTwo.isPower(1));
	}

}
