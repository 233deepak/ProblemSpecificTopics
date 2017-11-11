package com.deepak.test.dynamicprogramming;

import org.junit.Test;

import com.deepak.algo.dynamicprogramming.KnapSackPicker;
import com.deepak.algo.dynamicprogramming.KnapSackWithTable;

public class TestKnapSack {

	private KnapSackPicker knapSackPicker;
	private KnapSackWithTable knapSackWithTable;

	@Test
	public void testKnapSack() {
		int[] values = { 4, 2, 2, 1, 10 };
		int[] weights = { 12, 1, 2, 1, 4 };
		knapSackPicker = new KnapSackPicker(15, values, weights);
		System.out.println(knapSackPicker.search(15, 0));
	}
	
	@Test
	public void testKnapSack1() {
		int[] values = { 4, 2, 2, 1, 10 };
		int[] weights = { 12, 1, 2, 1, 4 };
		knapSackWithTable = new KnapSackWithTable(15, values, weights);
		System.out.println(knapSackWithTable.search(15, 0));
	}
}
