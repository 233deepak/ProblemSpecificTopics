package com.deepak.algo.dynamicprogramming;

public class LCSWithTable {

	private char[][][] table;
	private char[] first;
	private char[] second;

	public char[] search(char[] first, char[] second) {
		this.first = first;
		this.second = second;
		initializeTable(first.length, second.length);
		for (int i = first.length - 1; i >= 0; i--) {
			for (int j = second.length - 1; j >= 0; j--) {
				table[i][j] = fill(i, j);
			}
		}
		return table[0][0];
	}

	private char[] fill(int i, int j) {
		int k = findFirstMatch(first[i], second);
		char[] rleft = null;
		if (k >= j) {
			char[] result = table[i + 1][k + 1];
			rleft = concateChar(first[i], result);
		}
		char[] rRight = table[i + 1][j];
		return getlargestArray(rleft, rRight);
	}

	public void initializeTable(int m, int n) {
		int largest = (m > n) ? m : n;
		table = new char[m + 1][n + 1][largest];
		for (int i = 0; i < m + 1; i++) {
			table[i][n] = null;
		}
		for (int j = 0; j < n + 1; j++) {
			table[m][j] = null;
		}
	}

	public int findFirstMatch(char character, char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (character == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public char[] concateChar(char character, char[] array) {
		char[] result;
		if (array == null) {
			result = new char[1];
			result[0] = character;
			return result;
		}
		result = new char[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			result[i + 1] = array[i];
		}
		result[0] = character;
		return result;
	}

	public char[] getlargestArray(char[] left, char[] right) {
		if (left == null && right == null)
			return null;
		else if (left != null && right == null)
			return left;
		else if (right != null && left == null)
			return right;
		return (left.length > right.length) ? left : right;
	}

	public char[][][] getTable() {
		return table;
	}

}
