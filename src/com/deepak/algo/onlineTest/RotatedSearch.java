package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class RotatedSearch {

	public int search(final List<Integer> a, int b) {
		int pos = findStartIndexOfCirularArray(a, a.size());
		return binarySearch(0, a.size() - 1, a, b, a.size(), pos);
	}
	
	

	public int binarySearch(int low, int high, List<Integer> a, int ser,
			int size, int offset) {
		       int L = 0;
			  int R = size - 1;

			  while (L <= R) {
			    // Avoid overflow, same as M=(L+R)/2
			    int M = L + ((R - L) / 2);
			    if (a.get(M) == ser) return M;

			    // the bottom half is sorted
			    if (a.get(L) <= a.get(M)) {
			      if (a.get(L) <= ser && ser < a.get(M))
			        R = M - 1;
			      else
			        L = M + 1;
			    }
			    // the upper half is sorted
			    else {
			      if (a.get(M) < ser && ser <= a.get(R))
			        L = M + 1;
			      else 
			        R = M - 1;
			    }
			  }
			  return -1;}

	public int findStartIndexOfCirularArray(List<Integer> a, int size) {
		int min = a.get(0), startIndex = 0;

		for (int index = 1; index < size; index++) {
			if (a.get(index) < min) {
				startIndex = index;
				min = a.get(index);
			}

		}
 
		return startIndex;

	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
