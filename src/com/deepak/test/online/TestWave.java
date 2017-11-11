package com.deepak.test.online;

import java.util.ArrayList;

import org.junit.Test;

import com.deepak.algo.onlineTest.Wave;

public class TestWave {

	Wave wave = new Wave();

	@Test
	public void test1() {

		int array[] = { 13, 9, 5, 1, 14, 10, 6, 2 };
		System.out.println(wave.wave((ArrayList<Integer>) wave.getList(array)));

	}

	@Test
	public void test2() {
		int array[] = { 1, 2, 3, 4 };
		System.out.println(wave.wave((ArrayList<Integer>) wave.getList(array)));
	}
	
	@Test
	public void test3() {
		int array[] = { 1,2};
		System.out.println(wave.wave((ArrayList<Integer>) wave.getList(array)));
	}

}
