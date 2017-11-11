package com.deepak.algo.branchAndBound;

import java.util.Arrays;

public class KnapSackResolver {

	int[] values;
	int[] weights;
	int capacity;
	int[] initialObject;
	int minCost = 99999999;
	FinalOutcome finalOutcome;

	public KnapSackResolver(int[] values, int[] weights, int capacity) {
		super();
		this.values = values;
		this.weights = weights;
		this.capacity = capacity;
		this.initialObject = new int[values.length];
		this.finalOutcome = new FinalOutcome(initialObject, 0);

	}

	public FinalOutcome search(int[] objects, int nextSlot) {
		if (allSlotsFilled(objects)) {
			this.finalOutcome.objects = Arrays.copyOf(objects, objects.length);
			this.finalOutcome.profit = getProfit(objects);
			this.finalOutcome.setCost(getCost(objects));
			return finalOutcome;
		} else {
			for (int i = 1; i >= 0; i--) {
				objects[nextSlot] = i;
				int cost = getCost(objects);
				if (checkConstraints(objects) && cost <= minCost) {
					finalOutcome = search(objects, nextSlot + 1);
					minCost = finalOutcome.cost;
				}
				objects[nextSlot] = -1;
			}
			return finalOutcome;
		}

	}

	private boolean allSlotsFilled(int q[]) {
		boolean flag = true;
		for (int i = 0; i < q.length; i++) {
			if (q[i] == -1) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public boolean checkConstraints(int[] objects) {
		int totalWeight = 0;
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == 1) {
				totalWeight += weights[i];
			}
		}
		if (totalWeight > capacity)
			return false;
		else
			return true;
	}

	public int getCost(int[] objects) {
		int totalCost = 0;
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == 0) {
				totalCost += values[i];
			}
		}
		return (totalCost == 0) ? this.minCost : totalCost;
	}

	public int getProfit(int[] objects) {
		int totalCost = 0;
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == 1) {
				totalCost += values[i];
			}
		}
		return totalCost;
	}

	public int[] getInitialObject() {
		return initialObject;
	}

	public void setInitialObject(int[] initialObject) {
		this.initialObject = initialObject;
	}

}
