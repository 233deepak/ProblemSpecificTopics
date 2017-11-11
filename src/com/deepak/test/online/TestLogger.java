package com.deepak.test.online;

import java.util.ArrayList;

import com.deepak.algo.onlineTest.SearchInsert;

public class TestLogger {
	
	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6 };
		System.out.println(new SearchInsert().searchInsert((ArrayList<Integer>) new SearchInsert().getList(array), 2));
	}

}
