package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.RotatedSearch;

public class TestRotetedSerch {

	private RotatedSearch rotatedSearch = new RotatedSearch();

	@Test
	public void testSearch(){
		int[] array ={4,5,6,7,0,1,2};
		System.out.println(rotatedSearch.search(rotatedSearch.getList(array), 4));
		
	}
}
