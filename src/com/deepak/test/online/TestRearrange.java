package com.deepak.test.online;

import java.util.ArrayList;

import org.junit.Test;

import com.deepak.algo.onlineTest.Rearrange;

public class TestRearrange {
	
	Rearrange rearrange =new Rearrange();
	
	@Test
	public void test(){
		int[] array ={4, 0, 2, 1, 3};
		rearrange.arrange((ArrayList<Integer>) rearrange.getList(array));
	}

}
