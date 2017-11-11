package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

import com.triplepoint.logger.factory.LoggerFactory;
import com.triplepoint.logger.intf.Logger;

public class SearchInsert {
	Logger logger =LoggerFactory.getLogger(getClass());

	public int searchInsert(ArrayList<Integer> a, int b) {
		return searchRow(a, 0, a.size() - 1, b);
	}

	private int searchRow(ArrayList<Integer> arrayList, int start, int end,
			int b) {
		logger.error("This is call:"+start+","+end);
		if (start == end) {
			if (b > arrayList.get(start)) {
				return start + 1;
			} else if (b <= arrayList.get(start)) {
				return (start == 0) ? 0 : start - 1;
			}

		}
		if (start > end) {
			return 0;
		}
		int mid = (start + end) / 2;
		if (arrayList.get(mid) == b) {
			if (mid == 0)
				return 0;
			else
				return mid;
		} else if ((mid > 0) && b >= arrayList.get(mid - 1)
				&& b < arrayList.get(mid)) {
			return mid - 1;
		} else if (((mid + 1) < arrayList.size()) && b > arrayList.get(mid)
				&& b <= arrayList.get(mid + 1)) {
			return mid + 1;
		} else if (b > arrayList.get(mid)) {
			return searchRow(arrayList, mid + 1, end, b);
		} else if (b < arrayList.get(mid)) {
			return searchRow(arrayList, start, mid - 1, b);
		}
		return 0;
	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
