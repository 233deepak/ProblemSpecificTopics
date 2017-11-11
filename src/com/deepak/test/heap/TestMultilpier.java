package com.deepak.test.heap;

import org.junit.Test;

import com.deepak.algo.heaps.HighPrecisionMultiplier;

public class TestMultilpier {

	HighPrecisionMultiplier multiplier = new HighPrecisionMultiplier();

	@Test
	public void testMultiplication() {
       System.out.println(multiplier.multiply("100004", "100004"));  
	}
	
	@Test
	public void testMultiplication2() {
       System.out.println(multiplier.multiply("1000000008", "1000000008"));  
	}
	
	@Test
	public void testMultiplication3() {
       System.out.println(multiplier.multiply("10000000008", "10000000008"));  
	}

}
