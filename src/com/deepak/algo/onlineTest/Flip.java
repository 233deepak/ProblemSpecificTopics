package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Flip {

	public ArrayList<Integer> flip(String A) {
		char[] array = A.toCharArray();
		boolean allOne = true;
		for (char ch : array) {
			if (ch != '1') {
				allOne = false;
				break;
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if (!allOne) {
			Node node = maximize(array, 0, array.length - 1);
			for (int x : node.indexArray) {
				arrayList.add(x + 1);
			}
		}

		return arrayList;
	}

	private Node maximize(char[] array, int start, int end) {
		if (start == end) {
			return new Node(new int[] { start, start },
					(array[start] == '0') ? 1 : -1);
		}

		int mid = (start + end) / 2;
		Node left = maximize(array, start, mid);
		Node right = maximize(array, mid + 1, end);
		Node merge = mergeArray(array, start, mid, end);
		List<Node> nodes = new ArrayList<Node>(3);
		nodes.add(left);
		nodes.add(right);
		nodes.add(merge);
		Collections.sort(nodes);
		return max(left, right, merge);
	}

	private Node max(Node maxSubArrayLeft, Node maxSubArrayRight, Node mergeSum) {

		return (maxSubArrayLeft.sum >= maxSubArrayRight.sum) ? ((maxSubArrayLeft.sum >= mergeSum.sum) ? maxSubArrayLeft
				: mergeSum)
				: ((maxSubArrayRight.sum > mergeSum.sum) ? maxSubArrayRight
						: mergeSum);
	}

	private Node mergeArray(char[] array, int start, int mid, int end) {
		int[] numberArray = new int[array.length];
		for (int i = start; i <= end; i++) {
			if (array[i] == '0')
				numberArray[i] = 1;
			else
				numberArray[i] = -1;
		}
		int sum = 0;
		for (int x : numberArray)
			sum += x;

		return new Node(new int[] { start, end }, sum);
	}

	class Node implements Comparable<Node> {
		int[] indexArray;
		int sum;

		public Node(int[] indexArray, int sum) {
			super();
			this.indexArray = indexArray;
			this.sum = sum;
		}

		@Override
		public String toString() {
			return "Node [indexArray=" + Arrays.toString(indexArray) + ", sum="
					+ sum + "]";
		}

		@Override
		public int compareTo(Node o) {
			if (this.indexArray[0] > o.indexArray[0])
				return 1;
			else if (this.indexArray[0] == o.indexArray[0])
				if (this.indexArray[1] > o.indexArray[1])
					return 1;
				else if (this.indexArray[1] == o.indexArray[1])
					return 0;
				else
					return -1;
			else {
				return -1;
			}
		}

	}
}
