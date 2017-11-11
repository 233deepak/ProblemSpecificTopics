package com.deepak.test.online;

import java.util.ArrayList;

import org.junit.Test;

import com.deepak.algo.onlineTest.AddOneToVector;

public class AddOnetoVectorTest {

	AddOneToVector addOne = new AddOneToVector();

	@Test
	public void test1() {
		int[] array = { 1, 2, 3 };
        System.out.println(addOne.plusOne((ArrayList<Integer>) addOne.getList(array)));
	}
	
	/*@Test
	public void test2() {
		int[] array = { 1, 2, 3 };
        System.out.println(addOne.writeNumber(124));
	}*/

	@Test
	public void test5() {
		int[] array = {0, 1, 2, 3 };
        System.out.println(addOne.plusOne((ArrayList<Integer>) addOne.getList(array)));
	}
}
