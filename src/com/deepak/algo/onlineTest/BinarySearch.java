package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	int count = 0;

	public int findCount(final List<Integer> a, int b) {
		binarySearch(a, 0, a.size() - 1, b);
		return count;
	}

	private void binarySearch(List<Integer> a, int start, int end, int b) {
		if (start > end)
			return;
		int mid = start + (end - start) / 2;
		if (a.get(mid) == b) {
			int k = mid;
			while ((k >= 0) && (a.get(k) == b)) {
				count++;
				k--;
			}
			k = mid + 1;
			while ((k <= a.size() - 1) && (a.get(k) == b)) {
				count++;
				k++;
			}
			return;
		}

		else if (b > a.get(mid))
			binarySearch(a, mid + 1, end, b);
		else if (b < a.get(mid))
			binarySearch(a, start, mid - 1, b);
	}

	

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
