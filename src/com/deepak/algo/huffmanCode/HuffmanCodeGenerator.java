package com.deepak.algo.huffmanCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HuffmanCodeGenerator<T> {

	private List<Node<T>> subTrees;
	private Map<T, String> symbolAndCodeMap;

	public HuffmanCodeGenerator() {
		this.subTrees = new ArrayList<Node<T>>();
		this.symbolAndCodeMap = new HashMap<T, String>();
	}

	public String generateCode(Map<T, Integer> characterAndCountMap) {
		List<Node<T>> nodes = createInitialSubtreeArray(characterAndCountMap);
		Node<T> root = generateHuffmanTree(nodes);
		return null;

	}

	public Node<T> generateHuffmanTree(List<Node<T>> nodes) {
		createTree(nodes);
		return nodes.get(0);
	}

	private void createTree(List<Node<T>> nodes) {
		if (nodes.size() == 1)
			return;
		Collections.sort(nodes);
		Node<T> node = combineNodes(nodes.get(0), nodes.get(1));
		nodes.remove(1);
		nodes.remove(0);
		nodes.add(node);
		createTree(nodes);
	}

	private Node<T> combineNodes(Node<T> leftNode, Node<T> rightNode) {
		Node<T> newNode = new Node<T>();
		newNode.frequency = leftNode.frequency + rightNode.frequency;
		newNode.left = leftNode;
		newNode.right = rightNode;
		return newNode;
	}

	public List<Node<T>> createInitialSubtreeArray(
			Map<T, Integer> characterAndCountMap) {
		Set<T> keySet = characterAndCountMap.keySet();
		for (T t : keySet) {
			Node<T> node = new Node<T>(t, characterAndCountMap.get(t));
			subTrees.add(node);
		}
		return subTrees;
	}

	public void assignCode(Node<T> root, String prefix) {
		if (root.left == null && root.right == null) {
			root.code = prefix;
			symbolAndCodeMap.put(root.value, prefix);
			return;
		}
		prefix += "0";
		assignCode(root.left, prefix);
		prefix = prefix.substring(0, prefix.length() - 1);
		prefix += "1";
		assignCode(root.right, prefix);
		prefix = prefix.substring(0, prefix.length() - 1);
	}

	public List<Node<T>> getSubTrees() {
		return subTrees;
	}

	public void setSubTrees(List<Node<T>> subTrees) {
		this.subTrees = subTrees;
	}

	public Map<T, String> getSymbolAndCodeMap() {
		return symbolAndCodeMap;
	}

}
