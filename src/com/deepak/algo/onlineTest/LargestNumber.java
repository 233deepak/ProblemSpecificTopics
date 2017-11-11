package com.deepak.algo.onlineTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LargestNumber {

	public String largestNumber(final List<Integer> a) {
		boolean allZero = true;
		for (Integer integer : a) {
			if (integer != 0) {
				allZero = false;
				break;
			}
		}
		if (allZero)
			return "0";
		Collections.sort(a, new Comparator<Integer>() {
			@Override
			public int compare(Integer first, Integer second) {
				StringBuilder firstStr = new StringBuilder(first.toString());
				StringBuilder secoStr = new StringBuilder(second.toString());

				StringBuilder firstSecond = firstStr.append(secoStr);
				StringBuilder secondFirst = secoStr.append(firstSecond);
				return secondFirst.toString().compareTo(firstSecond.toString());
			}
		});
		String result = "";
		for (Integer integer : a) {
			result += integer;
		}

		return result;
	}

	public int compare1(int first, int second) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		while (first > 0) {
			int d = first % 10;
			list1.addFirst(d);
			first = first / 10;
		}
		while (second > 0) {
			int d = second % 10;
			list2.addFirst(d);
			second = second / 10;
		}
		int maxSizeNumber = (list1.size() > list2.size()) ? 1 : 2;
		int diff = Math.abs(list1.size() - list2.size());

		for (int i = 1; i <= diff; i++) {
			if (maxSizeNumber == 1) {
				list2.addLast(0);
			} else {
				list1.add(0);
			}
		}
		int maxLength = Math.max(list1.size(), list2.size());
		for (int index = 0; index < maxLength; index++) {
			if (list1.get(index) > list2.get(index))
				return 1;
			else if (list1.get(index) < list2.get(index))
				return -1;

		}

		return -1;

	}

	public int compare(int first, int second) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		int firstOriginal = first;
		int secondOriginal = second;
		while (first > 0) {
			int d = first % 10;
			list1.addFirst(d);
			first = first / 10;
		}
		while (second > 0) {
			int d = second % 10;
			list2.addFirst(d);
			second = second / 10;
		}

		long firstSecond = (long) ((firstOriginal * Math.pow(10, list2.size())) + secondOriginal);
		long secondFirst = (long) ((secondOriginal * Math.pow(10, list1.size())) + firstOriginal);
		return (firstSecond > secondFirst) ? 1 : -1;
	}
}
