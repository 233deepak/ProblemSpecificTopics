package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.GenerateSpiral;

public class TestSpiralGenerator {

	GenerateSpiral generateSpiral = new GenerateSpiral();

	@Test
	public void test1() {
		System.out.println(generateSpiral.generateMatrix(3));
	}

}
