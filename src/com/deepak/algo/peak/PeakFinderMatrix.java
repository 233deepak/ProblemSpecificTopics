package com.deepak.algo.peak;

public class PeakFinderMatrix {
	private static int MAX = -1;

	public int findPeak(int[][] matrix, int m, int startcolumn, int endColumn) {
		if (startcolumn-endColumn == 0) {
			int index = findMax(matrix, endColumn - 1);
			return matrix[index][endColumn];
		}
		int midColumn = (endColumn + startcolumn) / 2;
		int maxInColumnRowIndex = findMax(matrix, midColumn);
		int left, right, peak = 0;
		left = (midColumn - 1 < 0) ? MAX
				: matrix[maxInColumnRowIndex][midColumn - 1];
		right = (midColumn + 1 == endColumn+1) ? MAX
				: matrix[maxInColumnRowIndex][midColumn + 1];
		if (matrix[maxInColumnRowIndex][midColumn] > left
				&& matrix[maxInColumnRowIndex][midColumn] > right) {
			peak = matrix[maxInColumnRowIndex][midColumn];
		} else if (matrix[maxInColumnRowIndex][midColumn] < left) {
			peak = findPeak(matrix, m, startcolumn, midColumn - 1);
		} else if (matrix[maxInColumnRowIndex][midColumn] < right) {
			peak = findPeak(matrix, m, midColumn + 1, endColumn);
		}
		return peak;
	}

	public int findMax(int[][] matrix, int columnIndex) {
		int max = MAX;
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			max = (matrix[i][columnIndex] > max) ? matrix[i][columnIndex] : max;
			index = i;
			index = (matrix[i][columnIndex] > max) ? i : index;
		}
		return index;
	}

}
