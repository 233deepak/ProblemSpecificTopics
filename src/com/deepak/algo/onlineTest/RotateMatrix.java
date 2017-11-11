package com.deepak.algo.onlineTest;

import java.util.ArrayList;

public class RotateMatrix {

	public ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> a) {
		rotate90(0, a.size() - 1, 0, a.size() - 1, a);
		return a;
	}

	public void rotate90(int t, int b, int l, int r,
			ArrayList<ArrayList<Integer>> a) {
		if (l > r || t > b)
			return;
		for (int i = l; i < r; i++) {
			int temp1 = a.get(t).get(i);
			int temp2 = a.get(i).get(r);
			int temp3 = a.get(b).get(a.size() - 1 - i);
			int temp4 = a.get(a.size() - 1 - i).get(l);
			a.get(t).set(i, temp4);
			a.get(i).set(r, temp1);
			a.get(b).set(a.size() - 1 - i, temp2);
			a.get(a.size() - 1 - i).set(l, temp3);

		}
		t++;
		l++;
		r--;
		b--;
		rotate90(t, b, l, r, a);

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
