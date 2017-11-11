package com.deepak.algo.backtracking;

public class TSPSolver {

	private int[][] costmatrix;
	private int startNode;
	private int[] nodes;
	private int[] optimumRoot;

	public double search(int q[], int n, int nextSlot) {
		if (allSlotsFilled(q, n)) {
			return evaluateCost(q, n);
		} else {
			int[] possibleNodes = unTouchedNodes(q, n);
			double[] costs = new double[possibleNodes.length];
			for (int index = 0; index < possibleNodes.length; index++) {
				q[nextSlot] = possibleNodes[index];
				double cost = search(q, n, nextSlot + 1);
				q[nextSlot] = -1;
				costs[index] = cost;
			}
			return findMinimum(costs);
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

	public double evaluateCost(int q[], int n) {
		double cost = 0;
		for (int i = 0; i < n - 1; i++) {
			cost += costmatrix[q[i]][q[i + 1]];
		}
		cost += costmatrix[q[0]][q[n - 1]];
		return cost;
	}

	public int[] unTouchedNodes(int q[], int n) {
		int requiredlength = 0;
		for (int i = 0; i < n; i++) {
			if (q[i] == -1) {
				requiredlength++;
			}
		}
		int[] requiredNodes = new int[requiredlength];
		int k = 0;
		for (int index = 0; index < nodes.length; index++) {
			if (!elementFound(q, requiredlength, nodes[index])) {
				requiredNodes[k++] = nodes[index];
			}
		}
		return requiredNodes;
	}

	private boolean elementFound(int[] q, int length, int element) {
		for (int j = 0; j < q.length - length; j++) {
			if (q[j] == element) {
				return true;
			}
		}
		return false;
	}

	public double findMinimum(double[] costs) {
		double min = 999999999;
		for (double cost : costs) {
			min = (cost < min) ? cost : min;
		}
		return min;
	}

	public void print(int[] q, int n) {
		for (int i = 0; i < q.length; i++) {
			System.out.print(q[i] + " ");
		}
	}

	public int[] getNodes() {
		return nodes;
	}

	public void setNodes(int[] nodes) {
		this.nodes = nodes;
	}

	public int[][] getCostmatrix() {
		return costmatrix;
	}

	public void setCostmatrix(int[][] costmatrix) {
		this.costmatrix = costmatrix;
	}

	public int getStartNode() {
		return startNode;
	}

	public void setStartNode(int startNode) {
		this.startNode = startNode;
	}

}
