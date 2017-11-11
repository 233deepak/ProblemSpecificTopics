package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class RotatedArray {

	public int findMin(final List<Integer> a) {

		return binarySearch(a, 0, a.size() - 1);
	}

	private int binarySearch(List<Integer> a, int start, int end) {
		if (a.get(start) <= a.get(end)) {
			return a.get(start);
		}
		int mid = (start + end) / 2;
		int prev = (mid + a.size() - 1) % a.size();
		int next = (mid + 1) % a.size();
		if ((a.get(mid) <= a.get(next)) && (a.get(mid) <= a.get(prev))) {
			return a.get(mid);
		} else if (a.get(mid) <= a.get(end)) {
			end = mid - 1;
			return binarySearch(a, start, end);
		} else if (a.get(mid) >= a.get(start)) {
			start = mid + 1;
			return binarySearch(a, start, end);
		}
		return -1;
	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
