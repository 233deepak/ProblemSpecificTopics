package com.deepak.test.online;

import org.junit.Test;
import com.deepak.algo.onlineTest.Interval;

import com.deepak.algo.onlineTest.MergeIntervals;

public class TestMergeOverlaps {

	MergeIntervals merge = new MergeIntervals();

	@Test
	public void test() {
		int[][] intervals = { { 1, 3 }, { 6, 9 } };
		System.out.println(merge.insert(merge.convertToList(intervals),
				new Interval(2, 5)));
	}

	@Test
	public void test1() {
		int[][] intervals = { { 0, 1 }, { 3, 6 }, { 8, 9 } };
		System.out.println(merge.insert(merge.convertToList(intervals),
				new Interval(2, 5)));
	}

	@Test
	public void test2() {
		int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 },
				{ 12, 16 } };
		System.out.println(merge.insert(merge.convertToList(intervals),
				new Interval(4, 9)));
	}
	
	@Test
	public void test3() {
		int[][] intervals = { { 1, 2 }, { 3, 4 },  { 8, 10 },
				{ 12, 16 } };
		System.out.println(merge.insert(merge.convertToList(intervals),
			new Interval(5, 7)));
	}
	
	@Test
	public void test4() {
		int[][] intervals = { { 1, 2 } };
		System.out.println(merge.insert(merge.convertToList(intervals),
			new Interval(5, 7)));
	}
	
	@Test
	public void test5() {
		int[][] intervals = { {3, 6}, {8, 10} };
		System.out.println(merge.insert(merge.convertToList(intervals),
			new Interval(1, 2)));
	}
	
	@Test
	public void test6() {
		int[][] intervals = { {3, 5}, {8, 10} };
		System.out.println(merge.insert(merge.convertToList(intervals),
			new Interval(1, 12)));
	}
}
