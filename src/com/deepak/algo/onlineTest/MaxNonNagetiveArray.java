package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNagetiveArray {

	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		Integer[] array = converArray(a);
		MaxArray result = findMaxSubArray(array, 0, array.length - 1);
		if (result.array.length == 1 && result.array[0] < 0)
			return convertList(new int[0]);
		return convertList(result.array);
	}

	private MaxArray findMaxSubArray(Integer[] array, int start, int end) {
		if (start >= end) {
			return new MaxArray(new int[] { array[start] }, array[start]);
		}
		int mid = (start + end) / 2;
		MaxArray leftMax = findMaxSubArray(array, start, mid);
		MaxArray rightMax = findMaxSubArray(array, mid + 1, end);
		MaxArray mergedMax = mergeArray(array, start, mid, end);
		return max(leftMax, rightMax, mergedMax);
	}

	private MaxArray max(MaxArray leftMax, MaxArray rightMax, MaxArray mergedMax) {

		return compareMax(leftMax, rightMax) ? (compareMax(leftMax, mergedMax) ? leftMax
				: mergedMax)
				: (compareMax(mergedMax, rightMax) ? mergedMax : rightMax);
	}

	private boolean compareMax(MaxArray leftMax, MaxArray rightMax) {
		if (leftMax.sum > rightMax.sum) {
			return true;
		} else if (leftMax.sum == rightMax.sum) {
			if (leftMax.array.length >= rightMax.array.length)
				return true;
			else
				return false;
		}
		return false;
	}

	private MaxArray mergeArray(Integer[] array, int start, int mid, int end) {
		long maxSum = 0;
		long leftSum = 0;
		int i;
		for (i = mid; i >= start; i--) {
			if (array[i] < 0)
				break;
			maxSum += array[i];
			if (maxSum > leftSum) {
				leftSum = maxSum;
			}
		}

		long rightSum = 0;
		maxSum = 0;
		int j;
		for (j = mid + 1; j <= end; j++) {
			if (array[j] < 0)
				break;
			maxSum += array[j];
			if (maxSum > rightSum) {
				rightSum = maxSum;
			}

		}

		return new MaxArray(findSubArray(array, i + 1, j - 1), (long) leftSum
				+ rightSum);
	}

	private int[] findSubArray(Integer[] array, int i, int j) {
		int[] result = new int[j - i + 1];
		int k = 0;
		for (int index = i; index <= j; index++)
			result[k++] = array[index];
		return result;
	}

	public ArrayList<Integer> convertList(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(array.length);
		for (int index = 0; index < array.length; index++) {
			arrayList.add(array[index]);
		}
		return arrayList;
	}

	public Integer[] converArray(ArrayList<Integer> array) {
		Integer[] integers = new Integer[array.size()];
		int k = 0;
		for (Integer integer : array) {
			integers[k++] = integer;
		}
		return integers;
	}

	class MaxArray {
		int[] array;
		long sum;

		public MaxArray(int[] array, long sum) {
			super();
			this.array = array;
			this.sum = sum;
		}

		@Override
		public String toString() {
			return "MaxArray [array=" + Arrays.toString(array) + ", sum=" + sum
					+ "]";
		}

	}

}
