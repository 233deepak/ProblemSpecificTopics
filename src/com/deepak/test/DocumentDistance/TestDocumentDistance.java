package com.deepak.test.DocumentDistance;

import java.io.IOException;

import org.junit.Test;

import com.deepak.algo.document.DocumentDistanceCalculator;

public class TestDocumentDistance {

	private DocumentDistanceCalculator calaulator = new DocumentDistanceCalculator();

	@Test
	public void testCountMap() throws IOException {

		System.out
				.println(calaulator
						.getWordCountMap("F:\\Algorithm\\mit\\lecture2\\data\\t1.verne.txt"));
	}

	@Test
	public void testDistance() throws IOException {
		System.out.println(calaulator.findDistance(
				"F:\\Algorithm\\mit\\lecture2\\data\\t9.bacon.txt",
				"F:\\Algorithm\\mit\\lecture2\\data\\t2.bobsey.txt"));
	}
	
	@Test
	public void testDistance1() throws IOException {
		System.out.println(calaulator.findDistance(
				"F:\\Algorithm\\mit\\lecture2\\data\\Cat.txt",
				"F:\\Algorithm\\mit\\lecture2\\data\\Dog.txt"));
	}
	
	
	@Test
	public void testDistance3() throws IOException {
		System.out.println(calaulator.findDistance(
				"F:\\Algorithm\\mit\\lecture2\\data\\t5.churchill.txt",
				"F:\\Algorithm\\mit\\lecture2\\data\\t6.onemillion.txt"));
	}
}
