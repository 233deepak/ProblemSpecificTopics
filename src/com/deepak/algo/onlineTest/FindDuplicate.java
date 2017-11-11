package com.deepak.algo.onlineTest;

import java.util.HashSet;
import java.util.List;

public class FindDuplicate {

	public int repeatedNumber(final List<Integer> a) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (Integer integer : a) {
			if (hashSet.contains(integer)) {
				return integer;
			} else {
				hashSet.add(integer);
			}
		}
		return -1;
	}

}
