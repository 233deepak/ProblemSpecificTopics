package com.deepak.algo.test.peak;

import org.junit.Test;

import com.deepak.algo.peak.PeakFinderMatrix;

public class TestPeakFinderMatrix {

	private PeakFinderMatrix peakFinderMatrix = new PeakFinderMatrix();

	@Test
	public void testMaxInColumn() {

		int[][] matrix = { { 5, 2, 10, 1 }, { 14, 13, 12, 3 },
				{ 15, 9, 11, 17 }, { 16, 17, 19, 20 } };
		System.out.println(peakFinderMatrix.findMax(matrix, 1));

	}
	
	@Test
	public void testPeak() {

		int[][] matrix = { { 5, 2, 10, 1 }, { 14, 13, 12, 3 },
				{ 15, 9, 11, 17 }, { 16, 17, 19, 20 } };
		System.out.println(peakFinderMatrix.findPeak(matrix, matrix.length, 0, matrix[0].length-1));

	}

}
