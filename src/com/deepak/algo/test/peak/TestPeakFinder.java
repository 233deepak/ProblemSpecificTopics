package com.deepak.algo.test.peak;

import java.util.Random;

import org.junit.Test;

import com.deepak.algo.peak.PeakFinder;

public class TestPeakFinder {

	private PeakFinder peakFinder = new PeakFinder();

	@Test
	public void testLinear() {
		int[] array = { 10, 6, 4, 3, 12, 19, 18 };
		System.out.println(peakFinder.getPeakLinear(array));
	}

	@Test
	public void testBinary() {
		int[] array = { 10, 6, 1, 3, 12, 19, 18 };
		System.out.println(peakFinder.getPeakBinary(array, 0, array.length));
	}

	@Test
	public void testLinearHuge() {
		int[] array = new int[10000000];
		Random random =new Random();
		for(int i=0;i<10000000;i++){
			array[i]=random.nextInt(1000000 - 1) + 1;
		}
        System.out.println(peakFinder.getPeakLinear(array));
	}
	
	@Test
	public void testLinearHugeBinay() {
		int[] array = new int[10000000];
		Random random =new Random();
		for(int i=0;i<10000000;i++){
			array[i]=random.nextInt(1000000 - 1) + 1;
		}
        System.out.println(peakFinder.getPeakBinary(array, 0, array.length));
	}
}
