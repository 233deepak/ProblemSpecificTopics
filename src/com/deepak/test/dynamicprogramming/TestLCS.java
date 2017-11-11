package com.deepak.test.dynamicprogramming;

import org.junit.Test;

import com.deepak.algo.dynamicprogramming.LCSSolver;

public class TestLCS {

	private LCSSolver lCSSolver = new LCSSolver();

	@Test
	public void testSearchCharacter() {
		System.out.println(lCSSolver.findFirstMatch('A',
				"asdhjbvasdAdfnb".toCharArray()));
	}

	@Test
	public void testConcateCharacter() {
		System.out.println(lCSSolver.concateChar('G',
				"asdhjbvasdAdfnb".toCharArray()));
	}

	@Test
	public void testConcateCharacter1() {
		System.out.println(lCSSolver.concateChar('G', null));
	}

	@Test
	public void testLargestArray() {
		System.out.println(lCSSolver.getlargestArray(
				"AANVHBdsfksd".toCharArray(),
				"asjbdfasjhbfjasfbjasdhfbhjasd".toCharArray()));
	}

	@Test
	public void testSubString() {
		System.out.println(lCSSolver.getSubstring(10,
				"asdhjbvasdAdfnb".toCharArray()));
	}

	@Test
	public void testLCS() {
		System.out.println(lCSSolver.search("abcde".toCharArray(),
				"bceadq".toCharArray()));
	}
	
	@Test
	public void testLCS1() {
		System.out.println(lCSSolver.search(
				"aANVHBdsfksd".toCharArray(),
				"asjbdsfasjhbfjasfbjasdhfbhjasd".toCharArray()));
	}
}
