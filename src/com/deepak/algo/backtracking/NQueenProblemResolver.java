package com.deepak.algo.backtracking;

public class NQueenProblemResolver {

	static public int count=0;
	public void search(int q[], int n, int nextSlot) {
		if (allSlotsFilled(q, n)) {
			if (validateConstraints(q, n)) {
				print(q, n);
				count++;
				System.out.println();
			}
		} else {
			for (int j = 0; j < n; j++) {
				q[nextSlot] = j;
				search(q, n, nextSlot + 1);
				q[nextSlot] =-1;
			}
		}
	}

	private boolean allSlotsFilled(int q[], int n) {
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (q[i] == -1) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean validateConstraints(int q[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (q[i] == q[j]) {
						return false;
					} else if (Math.abs(q[i] - q[j]) == Math.abs(i - j)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private void print(int[] q, int n) {
		for (int i = 0; i < q.length; i++) {
			System.out.print(q[i] + " ");
		}
	}
}
