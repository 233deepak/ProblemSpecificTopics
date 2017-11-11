package com.deepak.algo.heaps;

public class HeapBuilder {

	public void heapify(int[] array, int index) {
		int left = -1, right = -1;
		if (2 * index + 1 <= array.length - 1)
			left = array[2 * index + 1];
		if (2 * index + 2 <= array.length - 1)
			right = array[2 * index + 2];
		if (left == -1 && right == -1)
			return;
		int max = (left > right) ? 2 * index + 1 : 2 * index + 2;
		if (array[index] < array[max]) {
			int temp = array[index];
			array[index] = array[max];
			array[max] = temp;
			heapify(array, max);
		} else {
			return;
		}

	}

	public void buildMaxHeap(int[] array) {
		for (int i = ((array.length / 2) - 1); i >= 0; i--) {
			heapify(array, i);
		}
	}
}
