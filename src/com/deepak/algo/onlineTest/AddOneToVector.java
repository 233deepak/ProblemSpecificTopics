package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.List;

public class AddOneToVector {

	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		a = removeLeadingZero(a);
		int[] array = new int[a.size() + 1];
		reverseAndCopy(a, array);
		int carry = 1, index;
		for (index = 0; index < array.length - 1; index++) {
			int sum = carry + array[index];
			array[index] = sum % 10;
			carry = sum / 10;
		}
		if (carry > 0) {
			array[index] = carry;
		}
		return getResultList(array);
	}

	private ArrayList<Integer> getResultList(int[] array) {
		int size = (array[array.length - 1] == 0) ? array.length - 1
				: array.length;
		ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
		for (int index = size - 1; index >= 0; index--) {
			arrayList.add(array[index]);
		}
		return arrayList;
	}

	public void reverseAndCopy(ArrayList<Integer> a, int[] array) {
		int k = 0;
		for (int index = a.size() - 1; index >= 0; index--) {
			array[k++] = a.get(index);
		}
	}

	public ArrayList<Integer> removeLeadingZero(ArrayList<Integer> integers) {
		int index = 0;
		for (; index < integers.size(); index++) {
			if (integers.get(index) != 0)
				break;
		}
		ArrayList<Integer> list = new ArrayList<Integer>(integers.size()
				- index + 1);
		for (int i = index; i < integers.size(); i++) {
			list.add(integers.get(i));
		}
		return list;
	}

	public List<Integer> getList(int[] array) {
		List<Integer> integers = new ArrayList<Integer>();
		for (int x : array) {
			integers.add(x);
		}
		return integers;
	}

}
