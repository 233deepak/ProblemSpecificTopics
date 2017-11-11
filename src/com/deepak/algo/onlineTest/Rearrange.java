package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class Rearrange {

	public void arrange(ArrayList<Integer> a) {
		int n = a.size();
		for (int index = 0; index < a.size(); index++) {
			Long d = (long) ((a.get((a.get(index))) % n) * n);
			a.set(index, a.get(index) + d.intValue());
		}

		for (int index = 0; index < a.size(); index++) {
			a.set(index, a.get(index) / n);
		}
		System.out.println(a);
	}
	
	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
