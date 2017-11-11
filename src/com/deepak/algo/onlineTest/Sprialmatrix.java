package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class Sprialmatrix {

	public void printSprial(int[][] matrix, int offset) {
		int i = offset, j = offset;
		if (i >= matrix.length / 2 && j >= matrix[0].length / 2)
			return;
		for (; j < matrix[i].length - offset - 1; j++) {
			System.out.print(matrix[i][j] + " ");
		}
		for (; i < matrix.length - offset - 1; i++) {
			System.out.print(matrix[i][j] + " ");
		}
		for (; j > 0 + offset; j--) {
			System.out.print(matrix[i][j] + " ");
		}
		for (; i > 0 + offset; i--) {
			System.out.print(matrix[i][j] + " ");
		}
		offset++;
		printSprial(matrix, offset);
	}

	public void print(int matrix[][], int m, int n) {
		int t = 0, b = m - 1, l = 0, r = n - 1;
		printRecursive(t, b, l, r, matrix);
	}

	private void printRecursive(int t, int b, int l, int r, int[][] matrix) {
		int i;
		if (t > b && l > r)
			return;
		for (i = l; i <= r; i++) {
			System.out.print(matrix[t][i] + " ");
		}
		t++;
		for (i = t; i <= b; i++) {
			System.out.print(matrix[i][r] + " ");
		}
		r--;
		for (i = r; i >= l; i--) {
			System.out.print(matrix[b][i] + " ");
		}
		b--;
		for (i = b; i >= t; i--) {
			System.out.print(matrix[i][l] + " ");
		}
		l++;
		printRecursive(t, b, l, r, matrix);
	}

	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		// Populate result;
		int t = 0, b = a.size() - 1, l = 0, r = a.get(0).size() - 1;
		printRecursive(t, b, l, r, a,result);
		return result;
	}

	public void printRecursive(int t, int b, int l, int r,
			List<ArrayList<Integer>> matrix, ArrayList<Integer> result) {
		int i;
		if (b < 0 || r < 0)
			return;
		if (t > matrix.size() - 1 || l > matrix.get(0).size() - 1)
			return;
		if (t > b && l > r)
			return;
		for (i = l; i <= r && (t<=b); i++) {
			System.out.print(matrix.get(t).get(i) + " ");
			result.add(matrix.get(t).get(i));
		}
		t++;
		for (i = t; i <= b && (l<=r); i++) {
			System.out.print(matrix.get(i).get(r) + " ");
			result.add(matrix.get(i).get(r));
		}
		r--;
		for (i = r; i >= l && (t<=b); i--) {
		
			System.out.print(matrix.get(b).get(i) + " ");
			result.add(matrix.get(b).get(i));
		}
		b--;
		for (i = b; i >= t && (l<=r); i--) {
			System.out.print(matrix.get(i).get(l) + " ");
			result.add(matrix.get(i).get(l));
		}
		l++;
		printRecursive(t, b, l, r, matrix, result);
	}

	public List<ArrayList<Integer>> prepareList(int[][] matrix) {
		List<ArrayList<Integer>> matrixList = new ArrayList<ArrayList<Integer>>();
		for (int[] array : matrix) {
			List<Integer> arrayList = new ArrayList<Integer>();
			for (int x : array) {
				arrayList.add(x);
			}
			matrixList.add((ArrayList<Integer>) arrayList);
		}
		return matrixList;
	}
}
