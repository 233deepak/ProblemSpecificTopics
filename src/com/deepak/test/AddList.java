package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.onlineTest.AddNumber;

public class AddList {

	private AddNumber addNumber = new AddNumber();

	@Test
	public void test() {
		int[] number1 = { 5, 6, 3 };
		int[] number2 = { 8, 4, 2 };
		addNumber.print(addNumber.addTwoNumber(number1, number2));
	}
	
	@Test
	public void test1() {
		int[] number1 = { 6,4,9,5,7};
		int[] number2 = { 4,8 };
		addNumber.print(addNumber.addTwoNumber(number1, number2));
		
	}
}
