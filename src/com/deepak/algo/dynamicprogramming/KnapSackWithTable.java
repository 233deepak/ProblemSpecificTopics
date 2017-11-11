package com.deepak.algo.dynamicprogramming;

public class KnapSackWithTable {
	private int initialCapacity;
	private int[] profits;
	private int[] weights;
	private int totalObjects;
	private int[][] table;

	public KnapSackWithTable(int initialCapacity, int[] profits, int[] weights) {
		this.initialCapacity = initialCapacity;
		this.profits = profits;
		this.weights = weights;
		this.totalObjects = profits.length;
		this.table = new int[initialCapacity + 1][totalObjects + 1];
		init(table);
	}

	public int search(int capacity, int i) {
		if (i >= totalObjects) {
			if (table[capacity][i] == -1) {
				table[capacity][i] = 0;
			}
			return table[capacity][i];
		} else if (capacity < weights[i]) {
			if (table[capacity][i + 1] == -1) {
				table[capacity][i + 1] = search(capacity, i + 1);
			}
			return table[capacity][i + 1];
		} else {
			if (table[capacity][i + 1] == -1) {
				table[capacity][i + 1] = search(capacity, i + 1);
			}
			if (table[capacity - weights[i]][i + 1] == -1) {
				table[capacity - weights[i]][i + 1] = search(capacity
						- weights[i], i + 1);
			}
			return max(table[capacity][i + 1], profits[i]
					+ table[capacity - weights[i]][i + 1]);
		}
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}

	private void init(int[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = -1;
			}
		}
	}

}
