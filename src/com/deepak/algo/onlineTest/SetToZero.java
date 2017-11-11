package com.deepak.algo.onlineTest;

import java.util.ArrayList;

public class SetToZero {

	public void setZeroes(ArrayList<ArrayList<Integer>> a) {

		boolean r=false, c=false;
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).size(); j++) {
				if (a.get(i).get(j) == 0) {
					if (i == 0)
						r = true;
					if (j == 0)
						c = true;
					setToMinus(i, j, a);

				}

			}
		}

		setZero(a,r,c);
		System.out.println(a);
	}

	private void setZero(ArrayList<ArrayList<Integer>> a, boolean r, boolean c) {

		
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).get(0) == -1) {
				for (int j = 0; j < a.get(i).size(); j++) {
					if (a.get(i).get(j) != -2)
						a.get(i).set(j, 0);
				}
			}

		}
		for (int i = 0; i < a.get(0).size(); i++) {
			if (a.get(0).get(i) == -2) {
				for (int j = 0; j < a.size(); j++) {
					a.get(j).set(i, 0);
				}
			}

		}
		if (c) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).get(0) != -2)
					a.get(i).set(0, 0);
			}
		}
		if(r){
			for (int i = 0; i < a.get(0).size(); i++) {
				if (a.get(0).get(i) != -1)
					a.get(0).set(i, 0);
			}

		}
	}

	private void setToMinus(int i, int j, ArrayList<ArrayList<Integer>> a) {
		if (i == 0 && j == 0)
			return;
		a.get(i).set(0, -1);
		a.get(0).set(j, -2);

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
