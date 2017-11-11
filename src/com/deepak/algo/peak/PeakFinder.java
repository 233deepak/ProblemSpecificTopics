package com.deepak.algo.peak;

public class PeakFinder {

	public int getPeakLinear(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				if (array[i] > array[i + 1])
					return array[i];
				else
					continue;
			}

			else if (i == array.length - 1) {
				if (array[i] > array[i - 1]) {
					return array[i];
				} else
					continue;
			}

			else if (array[i] > array[i - 1] && array[i] > array[i + 1])
				return array[i];
		}
		return -1;
	}

	public int getPeakBinary(int array[], int start, int end) {
		int mid = (start + end) / 2;
		int peak = 0;
		if (mid == start && array[mid] > array[mid + 1])
			peak = array[mid];
		else if (mid == end && array[mid] > array[mid - 1])
			peak = array[mid];
		else {
			if (array[mid] < array[mid - 1])
				peak = getPeakBinary(array, start, mid - 1);
			else if (array[mid] < array[mid + 1])
				peak = getPeakBinary(array, mid + 1, end);
			else
				peak = array[mid];
		}
		return peak;
	}
}
