package com.deepak.algo.onlineTest;

import java.util.ArrayList;

public class BSMatrix {

	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		return searchMatrix(a, 0, a.size() - 1, b);
	}

	private int searchMatrix(ArrayList<ArrayList<Integer>> a, int startRow,
			int endrow, int b) {
		if (startRow > endrow)
			return 0;
		int mid = (startRow +endrow ) / 2;
		if (searchRow(a.get(mid), 0, a.get(mid).size() - 1, b) == 1)
			return 1;
		else if (b > a.get(mid).get(a.get(mid).size() - 1)) {
			return searchMatrix(a, mid + 1, endrow, b);
		} else if (b < a.get(mid).get(0)) {
			return searchMatrix(a, startRow, mid - 1, b);
		}
		return 0;

	}

	private int searchRow(ArrayList<Integer> arrayList, int start, int end,
			int b) {
		if (start > end) {
			return 0;
		}
		int mid = (start + end) / 2;
		if (arrayList.get(mid) == b)
			return 1;
		else if (b > arrayList.get(mid)) {
			return searchRow(arrayList, mid + 1, end, b);
		} else if (b < arrayList.get(mid)) {
			return searchRow(arrayList, start, mid - 1, b);
		}
		return 0;
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
