package com.deepak.test.online;

import java.util.Arrays;

import org.junit.Test;

import com.deepak.algo.onlineTest.LargestNumber;

public class TestLargestNumber {

	LargestNumber number = new LargestNumber();

	@Test
	public void test() {
		System.out.println(number.compare(34, 30));
	}

	@Test
	public void test1() {
		System.out.println(number.compare(30, 3));
	}

	@Test
	public void test3() {
		System.out.println(number.compare(344, 34));
	}

	@Test
	public void test4() {
		System.out.println(number.compare(340, 34));
	}
	
	@Test
	public void test5() {
		System.out.println(number.compare(6, 603));
	}
	
	@Test
	public void test12() {
		System.out.println(number.compare(12, 121));
	}
	
	@Test
	public void test13() {
		System.out.println(number.compare(27, 271));
	}

	@Test
	public void test2() {
		Integer[] integers = { 3, 30, 34, 5, 9 };
		System.out.println(number.largestNumber(Arrays.asList(integers)));
	}

	@Test
	public void test8() {
		Integer[] integers = { 1, 2, 5, 7, 2, 3, 4 };
		System.out.println(number.largestNumber(Arrays.asList(integers)));
	}
	
	@Test
	public void test10() {
		Integer[] integers = { 0,0,0,0,0,0 };
		System.out.println(number.largestNumber(Arrays.asList(integers)));
	}
	
	@Test
	public void test9() {
		Integer[] integers = { 412, 823, 580, 12, 220, 746, 541, 207, 603, 961, 743, 517, 747, 891, 550, 21, 991, 683, 19, 497, 584, 910, 984, 831, 335, 485, 203, 503, 448, 141, 350, 604, 380, 794, 770, 802, 747, 355, 888, 878, 219, 233, 60, 584, 648, 599, 100, 6, 423, 681, 188, 41, 413, 965, 204, 443, 896, 991, 698, 557, 813, 359, 972, 230, 497, 157, 644, 822, 16, 423 };
		System.out.println(number.largestNumber(Arrays.asList(integers)));
	}
	
}
