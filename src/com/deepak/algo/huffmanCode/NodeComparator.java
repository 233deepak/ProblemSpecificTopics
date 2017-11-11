package com.deepak.algo.huffmanCode;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {

	@Override
	public int compare(Node node1, Node node2) {
		if (node1.frequency > node2.frequency)
			return 1;
		else if (node1.frequency < node2.frequency)
			return -1;
		else
			return 0;
	}

}
