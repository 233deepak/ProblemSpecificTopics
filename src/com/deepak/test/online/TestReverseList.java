package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.ReverseList;

public class TestReverseList {

	private ReverseList reverseList = new ReverseList();

	@Test
	public void test() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		reverseList.printList(reverseList.createLinkedList(array));
	}

	@Test
	public void test2() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverseList.printList(reverseList.createLinkedList(array));
	}

	@Test
	public void test3() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverseList.printList(reverseList.reverse(
				reverseList.createLinkedList(array), 3));
	}
	
	@Test
	public void test4() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8};
		reverseList.printList(reverseList.reverse(
				reverseList.createLinkedList(array), 3));
	}
}
