package com.deepak.algo.onlineTest;

import java.util.List;

public class MaxSubarray {

	

	public int[] findMaxSubArrayIndex(int[] array, int start, int end) {
		if ((end - start + 1) == 2) {

		}
		int mid = (start + end) / 2;
		int[] leftMax = findMaxSubArrayIndex(array, start, mid - 1);
		int[] rightMax = findMaxSubArrayIndex(array, mid, end);
		int leftMaxValue = maxOfRange(array, leftMax[0], leftMax[1]);
		int rightMaxValue = maxOfRange(array, rightMax[0], rightMax[1]);
		int combineMax = maxOfRange(array, leftMax[0], rightMax[1]);
		int max = Integer.MIN_VALUE;
		if (leftMaxValue > rightMaxValue) {
			if (leftMaxValue > combineMax) {
				return leftMax;
			} else {
				return new int[] { leftMax[0], rightMax[1] };
			}
		} else {
			if (rightMaxValue > combineMax) {
				return rightMax;
			} else {
				return new int[] { leftMax[0], rightMax[1] };
			}
		}

	}

	public int maxOfRange(int[] array, int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index < endIndex; index++) {
			sum += array[index];
		}
		return sum;
	}

	public int getMaxSubArray(int[] array, int start, int end) {
		if(start==end)
			return array[start];
		int mid = (start + end) / 2;
		return max(getMaxSubArray(array, start, mid),
				getMaxSubArray(array, mid + 1, end),
				getMergeSum(array, start, mid, end));

	}

	private int max(int maxSubArrayLeft, int maxSubArrayRight, int mergeSum) {

		return (maxSubArrayLeft > maxSubArrayRight) ? ((maxSubArrayLeft > mergeSum) ? maxSubArrayLeft
				: mergeSum)
				: ((maxSubArrayRight > mergeSum) ? maxSubArrayRight : mergeSum);
	}

	private int getMergeSum(int[] array, int start, int mid, int end) {

		int sum = 0;
		int left_sum = Integer.MIN_VALUE;
		for (int i = mid; i >= start; i--) {
			sum = sum + array[i];
			if (sum > left_sum)
				left_sum = sum;
		}

		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for (int i = mid + 1; i <= end; i++) {
			sum = sum + array[i];
			if (sum > right_sum)
				right_sum = sum;
		}

		return left_sum + right_sum;
	}
	
	/*public int maxSubArray(final List<Integer> a) {
		
	}*/
	
}
