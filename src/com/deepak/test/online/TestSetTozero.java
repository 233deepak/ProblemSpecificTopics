package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.SetToZero;

public class TestSetTozero {

	SetToZero setToZero = new SetToZero();

	@Test
	public void test() {
		int[][] array = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		setToZero.setZeroes(setToZero.convertToList(array));
	}
	
	@Test
	public void tes2() {
		int[][] array = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 0 } };
		setToZero.setZeroes(setToZero.convertToList(array));
	}
	@Test
	public void test1() {
		int[][] array = { { 0,0}, { 1,1 } };
		setToZero.setZeroes(setToZero.convertToList(array));
	}

}
