package com.deepak.test.dynamicprogramming;

import org.junit.Test;

import com.deepak.algo.dynamicprogramming.LCSWithTable;

public class TestLcsTable {

	private LCSWithTable lcsWithTable =new LCSWithTable();

	@Test
	public void testInitialize() {
		lcsWithTable.initializeTable(4, 5);
		System.out.println(lcsWithTable.getTable());
	}
   
	@Test
	public void testLCS() {
		System.out.println(lcsWithTable.search("abcd".toCharArray(),
				"bcead".toCharArray()));
	}
	
	@Test
	public void testLCS1() {
		System.out.println(lcsWithTable.search(
				"aANVHBdsfksd".toCharArray(),
				"asjbdsfasjhbfjasfbjasdhfbhjasd".toCharArray()));
	}
}
