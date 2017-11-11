package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.GridUniquePath;

public class TestUniquePath {
	
	GridUniquePath gridUniquePath =new GridUniquePath();
	
	@Test
	public void test(){
		System.out.println(gridUniquePath.uniquePaths(2, 2));
	}
    
	@Test
	public void test1(){
		System.out.println(gridUniquePath.uniquePaths(3, 6));
	}
	
	@Test
	public void test2(){
		System.out.println(gridUniquePath.uniquePaths(1, 1));
	}
	
	@Test
	public void test3(){
		System.out.println(gridUniquePath.uniquePaths(0, 0));
	}
}
