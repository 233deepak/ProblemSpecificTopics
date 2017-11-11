package com.deepak.algo.dynamicprogramming;

public class MatrixCM {

	int[] cost;
	int[] left;
	int[] right;

	private void init(int[] cost) {
		for (int i = 0; i < cost.length; i++) {
			cost[i] = -1;
		}

	}

	/*
	 * Search space is the array of matrix size to be multiply i.e d[0...n]
	 * where d[i-1] and d[i] are the row and colmn size of matrix M[i].
	 */
	public int search(int[] searchSpace) {

		/*
		 * if M1,M2...Mn are n matrix to be multiply the divide the search space
		 * into sub space S=s1 U s2 U ....sn.where such that s[i] has the
		 * matrices M1,M2...Mi and in left sub tree and Mi+1 to Mn in right sub
		 * tree
		 */
		int[] cost = new int[searchSpace.length];
		init(cost);

		if (searchSpace.length == 2)
			return 0;
		for (int i = 1; i < searchSpace.length - 1; i++) {
			int leftCost = search(getSubArray(searchSpace, 0, i));
			int rightCost = search(getSubArray(searchSpace, i,
					searchSpace.length - 1));
			cost[i] = leftCost + rightCost + searchSpace[0] * searchSpace[i]
					* searchSpace[searchSpace.length - 1];
		}
		return findMin(getSubArray(cost, 1, cost.length - 1));
	}

	public int[] getSubArray(int[] array, int startIndex, int endIndex) {
		int[] subArray = new int[endIndex - startIndex + 1];
		int k = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			subArray[k++] = array[i];
		}
		return subArray;
	}

	public void print(int[] array) {
		for (int x : array) {
			System.out.print(x + " ");
		}
	}

	public int findMin(int[] array) {
		int min = array[0];
		for (int x : array)
			min = (x < min && x!=-1) ? x : min;
		return min;
	}
}
