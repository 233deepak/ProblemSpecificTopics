package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxDistance {

	/*
	 * public int maximumGap(final List<Integer> a) { int max = 0; for (int i =
	 * 0; i < a.size(); i++) { for (int j = i; j < a.size(); j++) { if (a.get(j)
	 * >= a.get(i)) { if ((j - i) >= max) { max = (j - i); } } } } return max; }
	 */
	public int maximumGap(final List<Integer> a) {
		ArrayList<Integer> integers = new ArrayList<Integer>(a);
		Collections.sort(a);
		int[] indexArray = new int[a.size()];
		for (int i = 0; i < a.size(); i++) {
			indexArray[i] = integers.lastIndexOf(a.get(i));
		}
		 int maxIndex = Integer.MIN_VALUE; // -Infinity
         for (int i = indexArray.length - 1; i >= 0; i--) {
          maxIndex = Math.max(maxIndex, indexArray[i]);
          indexArray[i] = maxIndex;
      }
		return maxIndex;
	}

	public int findMaxIndex(int index, int[] array) {
		int max = array[index];
		for (int i = index; i < array.length; i++) {
			if (array[index] > max)
				max = array[index];
		}
		return max;
	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
