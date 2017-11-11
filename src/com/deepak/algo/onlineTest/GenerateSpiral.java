package com.deepak.algo.onlineTest;

import java.util.ArrayList;

public class GenerateSpiral {

	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 1; i <= (a * a); i++) {
			array.add(i);
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(
				a);
		for (int i = 0; i < a; i++) {
			ArrayList<Integer> integers = new ArrayList<Integer>(a);
			for (int j = 0; j < a; j++) {
				integers.add(0);
			}

			result.add(integers);
		}
		int l = 0, r = a - 1, b = a - 1, t = 0;
		addNumbers(result, array, 0, t, l, r, b);
		return result;

	}

	private void addNumbers(ArrayList<ArrayList<Integer>> result,
			ArrayList<Integer> array, int nextNumber, int t, int l, int r, int b) {
		if (t > b && l > r) {
			return;
		}

		for (int i = l; i <= r; i++) {
			result.get(t).set(i, array.get(nextNumber));
			nextNumber++;
		}
		t++;
		for (int i = t; i <= b; i++) {
			result.get(i).set(r, array.get(nextNumber));
			nextNumber++;
		}
		r--;
		for (int i = r; i >= l; i--) {
			result.get(b).set(i, array.get(nextNumber));
			nextNumber++;
		}
		b--;
		for (int i = b; i >= t; i--) {
			result.get(i).set(l, array.get(nextNumber));
			nextNumber++;
		}
		l++;
       addNumbers(result, array, nextNumber, t, l, r, b);
	}
}
