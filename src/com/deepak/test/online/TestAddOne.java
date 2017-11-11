package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.AddOne;

public class TestAddOne {

	AddOne addoNe = new AddOne();

	@Test
	public void test1() {
      System.out.println(addoNe.addOne(13));
	}
	
	@Test
	public void test2() {
      System.out.println(addoNe.addOne(-13));
	}
}
