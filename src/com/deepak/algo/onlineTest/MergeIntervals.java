package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals,
			Interval newInterval) {
		intervals.add(newInterval);

		if (intervals == null || intervals.size() <= 1)
			return intervals;

		// sort intervals by using self-defined Comparator
		Collections.sort(intervals, new IntervalComparator());

		ArrayList<Interval> result = new ArrayList<Interval>();

		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);

			if (prev.end >= curr.start) {
				// merged case
				Interval merged = new Interval(prev.start, Math.max(prev.end,
						curr.end));
				prev = merged;
			} else {
				result.add(prev);
				prev = curr;
			}
		}

		result.add(prev);

		return result;
	}

	public ArrayList<Interval> convertToList(int[][] arrays) {
		ArrayList<Interval> lists = new ArrayList<Interval>(arrays.length);
		for (int[] array : arrays) {
			Interval interval = new Interval(array[0], array[1]);
			lists.add(interval);
		}
		return lists;

	}

	class IntervalComparator implements Comparator<Interval> {
		public int compare(Interval i1, Interval i2) {
			return i1.start - i2.start;
		}
	}
}
