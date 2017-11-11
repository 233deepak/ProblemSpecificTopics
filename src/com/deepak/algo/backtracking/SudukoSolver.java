package com.deepak.algo.backtracking;

public class SudukoSolver {

	public void search(int[][] object, int n, Slot slot) {
		if (allSlotsFilled(object)) {
			if (checkConstraint(object, object.length)) {
				print(object);
			}
		} else {
			for (int i = 1; i < 9; i++) {
				object[slot.i][slot.j] = i;
				search(object, n, findNextSlot(slot));
				object[slot.i][slot.j] = -1;
			}
		}
	}

	public Slot findNextSlot(Slot slot) {
		if (slot.j < 8) {
			slot.j++;
		} else if (slot.j >= 8 && slot.i < 8) {
			slot.j = 0;
			slot.i++;
		}
		return new Slot(slot.i, slot.j);
	}

	public boolean checkConstraint(int[][] object, int length) {
		if (checkConstraint(object, length, 0)
				&& checkConstraint(object, length, 1)
				&& checkfor3X3Grid(object, length))
			return true;
		return false;
	}

	private boolean checkConstraint(int[][] object, int n, int constant) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					// check in same row
					if (constant == 0 && (j != k)) {
						if (object[i][j] == object[i][k])
							return false;
					}
					// check in same column
					if (constant == 1 && (i != k)) {
						if (object[i][j] == object[k][j])
							return false;
					}
				}
			}
		}
		return true;
	}

	public boolean checkfor3X3Grid(int[][] object, int length) {

		for (int k = 0; k < length; k = k + 3) {
			for (int l = 0; l < length; l = l + 3) {
				int index = 0, a[] = new int[length];
				for (int i = k; i < k + 3; i++) {
					for (int j = l; j < l + 3; j++) {
						a[index++] = object[i][j];
					}
				}
				if (!isValidArray(a, length))
					return false;
			}
		}
		return true;

	}

	public boolean isValidArray(int q[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && q[i] == q[j])
					return false;
			}
		}
		return true;
	}

	private boolean allSlotsFilled(int[][] object) {
		boolean flag = true;
		for (int[] intArray : object) {
			for (int element : intArray) {
				if (element == -1) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	private void print(int[][] object) {
		for (int array[] : object) {
			for (int element : array) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}
