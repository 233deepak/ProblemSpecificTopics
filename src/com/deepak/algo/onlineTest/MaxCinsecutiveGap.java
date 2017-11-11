package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class MaxCinsecutiveGap {

	public int maximumGap(final List<Integer> a) {

		if (a.size() < 2)
			return 0;
		int max = a.get(0), min = a.get(0);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > max)
				max = a.get(i);
			if (a.get(i) < min)
				min = a.get(i);
		}

		Bucket[] buckets = new Bucket[a.size()];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new Bucket(-1, -1);
		}
		double interval = (double) a.size() / (max - min);
		int bucketIndex;
		Bucket bucket;
		for (int index = 0; index < a.size(); index++) {
			bucketIndex = (int) ((a.get(index) - min) * interval);
			if (bucketIndex >= a.size())
				bucketIndex--;
			bucket = buckets[bucketIndex];
			if (bucket.low == -1) {
				bucket.low = a.get(index);
				bucket.high = a.get(index);
			} else {
				if (a.get(index) < bucket.low)
					bucket.low = a.get(index);
				if (a.get(index) > bucket.high)
					bucket.high = a.get(index);
			}

		}

		int result = 0;
		Bucket bucket2;
		int prevHigh = buckets[0].high;
		for (int i = 1; i < buckets.length; i++) {
			bucket2 = buckets[i];
			if (bucket2.high == -1)
				continue;
			result = Math.max(result, bucket2.low - prevHigh);
			prevHigh = bucket2.high;
		}
		return result;
	}

	class Bucket {
		int high;
		int low;

		public Bucket(int high, int low) {
			super();
			this.high = high;
			this.low = low;
		}

	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
