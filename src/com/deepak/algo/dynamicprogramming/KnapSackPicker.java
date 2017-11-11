package com.deepak.algo.dynamicprogramming;

public class KnapSackPicker {

	private int initialCapacity;
	private int[] profits;
	private int[] weights;
	private int totalObjects;
	private int[][] table;

	public KnapSackPicker(int initialCapacity, int[] profits, int[] weights) {
		this.initialCapacity = initialCapacity;
		this.profits = profits;
		this.weights = weights;
		this.totalObjects = profits.length;
	}

	public int search(int capacity, int i) {
		if (i >= totalObjects) {
			return 0;
		} else if (capacity < weights[i]) {
			return search(capacity, i + 1);
		} else {
			return max(search(capacity, i + 1),
					profits[i] + search(capacity - weights[i], i + 1));
		}
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
