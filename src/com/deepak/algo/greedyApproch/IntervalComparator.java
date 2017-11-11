package com.deepak.algo.greedyApproch;

import java.util.Comparator;

public class IntervalComparator implements Comparator<Interval> {

	@Override
	public int compare(Interval i1, Interval i2) {

		if(i1.startPoint<i2.startPoint) return -1;
		else if(i1.startPoint>i2.startPoint) return 1;
		else return 0;
	}

}
