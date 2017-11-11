package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wave {

	public ArrayList<Integer> wave(ArrayList<Integer> a) {
		Collections.sort(a);
		for (int i = 0; i <= a.size()-2; i+=2) {
			int temp = a.get(i);
			a.set(i, a.get(i + 1));
			a.set(i + 1, temp);
		}
		return a;
	}
	
	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
