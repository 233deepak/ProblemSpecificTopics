package com.deepak.test.heap;

import org.junit.Test;

import com.deepak.algo.heaps.BinarySearchTree;
import com.deepak.algo.heaps.HeapBuilder;
import com.deepak.algo.heaps.RunwayReservation;

public class TestHeaps {

	HeapBuilder heapBuilder = new HeapBuilder();

	@Test
	public void testHepify() {
		int[] array = { 16, 4, 10, 14, 7, 9, 3, 2, 8, 1, 0 };
		heapBuilder.heapify(array, 1);
		System.out.println(array);
	}

	@Test
	public void testHepify1() {
		int[] array = { 16, 4, 10, 7, 14, 9, 3, 2, 8, 5 };
		heapBuilder.heapify(array, 1);
		System.out.println(array);
	}

	@Test
	public void testHepify2() {
		int[] array = { 16, 4, 10, 7, 14, 9, 3, 2, 8, 5 };
		heapBuilder.buildMaxHeap(array);
		System.out.println(array);
	}

	@Test
	public void testBuildBST() {
		int[] array = { 16, 4, 10, 7, 14, 9, 3, 2, 8, 5 };
		BinarySearchTree tree = new BinarySearchTree(array);
		System.out.println(tree.getRoot());
	}

	@Test
	public void testRunwayReservation() {
		int[] array = { 49, 79, 46, 41, 42, 45 };
		RunwayReservation reservation = new RunwayReservation();
		for (int time : array)
			reservation.processLandingRequest(time, 3);
		reservation.inOrderTraversal(reservation.getRoot());
	}

	@Test
	public void testBuildBST4() {
		int[] array = { 49, 79, 46, 41, 64, 83 };
		BinarySearchTree tree = new BinarySearchTree(array);
		System.out.println(tree.getRoot());
	}

	@Test
	public void testBuildBST5() {
		int[] array = { 49, 79, 46, 41, 64, 83 };
		BinarySearchTree tree = new BinarySearchTree(array);
		tree.inOrderTraversal(tree.getRoot());
		System.out.println(tree.rankOfElement(79, tree.getRoot()));
	}

	@Test
	public void testBuildBST6() {
		int[] array = { 49, 79, 46, 41, 64, 83 };
		BinarySearchTree tree = new BinarySearchTree(array);
		tree.inOrderTraversal(tree.getRoot());
		System.out.println(tree.rankOfElement(46, tree.getRoot()));
	}

	@Test
	public void testBuildBST7() {
		int[] array = { 49, 79, 46, 41, 64, 83 };
		BinarySearchTree tree = new BinarySearchTree(array);
		tree.inOrderTraversal(tree.getRoot());
		System.out.println(tree.max(tree.getRoot()));
	}

	@Test
	public void testBuildBST8() {
		int[] array = { 49, 79, 41, 46, 64, 83 };
		BinarySearchTree tree = new BinarySearchTree(array);
		tree.inOrderTraversal(tree.getRoot());
		System.out.println(tree.getNextLargest(tree.getRoot(), 46));
	}
	
	@Test
	public void testBuildBST9() {
		int[] array = { 49, 79, 46, 41, 64, 83 };
		BinarySearchTree tree = new BinarySearchTree(array);
		tree.levelOrderTraversal(tree.getRoot());
	}
}
