package com.deepak.algo.onlineTest;

import java.util.ArrayList;

public class AntiDiagonal {

	public ArrayList<ArrayList<Integer>> diagonal(
			ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(
				a.size());
		for (int i = 0; i < a.size(); i++) {
			ArrayList<Integer> integers = new ArrayList<Integer>();
			for (int k = i, l = 0; k >= 0 && l < a.size(); k--, l++) {
				integers.add(a.get(l).get(k));
			}
			result.add(integers);
		}
		for (int i = 1; i < a.size(); i++) {
			ArrayList<Integer> integers = new ArrayList<Integer>();
			for (int k = a.size()-1, l = i; k >= 0 && l < a.size(); k--, l++) {
				integers.add(a.get(l).get(k));
			}
			result.add(integers);
		}
		
		return result;

	}

	public ArrayList<ArrayList<Integer>> convertToList(int[][] arrays) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(
				arrays.length);
		for (int[] array : arrays) {
			ArrayList<Integer> list = new ArrayList<Integer>(array.length);
			for (int x : array) {
				list.add(x);
			}
			lists.add(list);
		}
		return lists;

	}
}
