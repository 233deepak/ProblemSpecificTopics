package com.deepak.algo.onlineTest;

public class Sqrt {

	public int sqrt(int a) {
		if (a == 0)
			return 0;
		return searchBinary(a, 1, a);
	}

	private int searchBinary(int a, int start, int end) {
		if (start >= end) {
			long square = (long) start * start;
			if (square == a  )
				return start;
			else if(a > square){
				return start;
			}
			else {
				return (start>1)?(start - 1):1;
			}
		}
		int mid = start+(end -start) / 2;
		long midSquare = (long) mid * mid;
		if (midSquare == a)
			return mid;
		else if (midSquare > a) {
			return searchBinary(a, start, mid - 1);
		} else if (midSquare < a) {
			return searchBinary(a, mid + 1, end);
		}
		return 0;
	}

}
