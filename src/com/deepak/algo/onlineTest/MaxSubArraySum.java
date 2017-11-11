package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArraySum {

	public int maxSubArray(final List<Integer> a) {
		return getMaxSubArray(a, 0, a.size() - 1);

	}

	public Integer getMaxSubArray(List<Integer> array, int start, int end) {
		if (start == end)
			return array.get(start);
		int mid = (start + end) / 2;
		int x1 = getMaxSubArray(array, start, mid);
		int x2 = getMaxSubArray(array, mid + 1, end);
		int x3 = getMergeSum(array, start, mid, end);
		return max(x1, x2, x3);

	}

	private int max(int maxSubArrayLeft, int maxSubArrayRight, int mergeSum) {

		return (maxSubArrayLeft > maxSubArrayRight) ? ((maxSubArrayLeft > mergeSum) ? maxSubArrayLeft
				: mergeSum)
				: ((maxSubArrayRight > mergeSum) ? maxSubArrayRight : mergeSum);
	}

	private int getMergeSum(List<Integer> array, int start, int mid, int end) {

		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for (int i = mid; i >= start; i--) {
			sum = sum + array.get(i);
			if (sum > left_sum)
				left_sum = sum;
		}

		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for (int i = mid + 1; i <= end; i++) {
			sum = sum + array.get(i);
			if (sum > right_sum)
				right_sum = sum;
		}

		return left_sum + right_sum;
	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
