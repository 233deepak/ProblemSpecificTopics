package com.deepak.algo.dynamicprogramming;

public class MatrixCMTable {

	int[][] table;

	public int search(int[] array) {
		init(table, array.length);
		int n = array.length;
		for (int j = n - 1; j >= 0; j--) {
			for (int k = j + 1; k < n; k++) {
					table[j][k] = fill(j, k, array);
			}
		}
		return table[0][n - 1];
	}

	private int fill(int j, int k, int[] array) {
		if (k == j + 1)
			return 0;

		int[] cost = new int[k - j + 1];
		int count = 0;
		for (int i = j + 1; i < k; i++) {
			cost[count++] = table[j][i] + table[i][k] + array[j] * array[i]
					* array[k];
		}
		return findMin(cost);
	}

	private void init(int[][] table, int length) {
		this.table = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				this.table[i][j] = 0;
			}
		}
	}

	public int findMin(int[] array) {
		int min = array[0];
		for (int x : array)
			min = (x < min && x != 0) ? x : min;
		return min;
	}
}
