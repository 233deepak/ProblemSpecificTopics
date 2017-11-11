package com.deepak.test;

import org.junit.Test;

import com.deepak.algo.patternmatching.PatternMatcher;

public class TestPatternMatcher {

	private PatternMatcher patternmatcher = new PatternMatcher();

	@Test
	public void testhArrayCreation() {
		int[] harray = patternmatcher.prepareHArray("abcdabcy");
		patternmatcher.printArray(harray);
	}

	@Test
	public void testhArrayCreation1() {
		int[] harray = patternmatcher.prepareHArray("ababcabab");
		patternmatcher.printArray(harray);
	}

	@Test
	public void testhArrayCreation2() {
		int[] harray = patternmatcher.prepareHArray("abababab");
		patternmatcher.printArray(harray);
	}

	@Test
	public void testhArrayCreation3() {
		int[] harray = patternmatcher.prepareHArray("aabaacd");
		patternmatcher.printArray(harray);
	}

	@Test
	public void testFindPattern() {
		System.out.println(patternmatcher.findOccurrence(
				"abcxabcdabxabcdabcdabcy", "abcdabcy"));
	}

	@Test
	public void testFindPattern1() {
		System.out.println(patternmatcher.findOccurrence("GEEK FOR GEEKS",
				"GEEKS"));
	}

	@Test
	public void testFindAndHighlight() {
		System.out.println(patternmatcher.findAndHiglightOccurrence(
				"GEEK FOR GEEKS", "GEEKS"));
	}

	@Test
	public void testFindAndHighlight1() {
		System.out.println(patternmatcher.findAndHiglightOccurrence("input : Array of size n "+
	"output: max element in (3n/2-2) comparision 	Algo:-  Take array as argument 	* if number of element is 2 then return the max"+
	"* else divide the array into two haves and cal the function recurrsively for both halves * compare the result of bot haves to find max.",
				"halves"));
	}
	
	@Test
	public void testFindAndHighlight2() {
		System.out.println(patternmatcher.findAndHiglightAllOccurrence("input : Array of size n "+
	"output: max element in (3n/2-2) comparision 	Algo:-  Take array as argument halves * if number of element is 2 then return the max"+
	"* else divide the array into two haves and cal the function recurrsively for both halves * compare the result of bot haves to find max.",
				"halves"));
	}
}
