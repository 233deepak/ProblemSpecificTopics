package com.deepak.algo.branchAndBound;

import java.util.Arrays;

public class FinalOutcome {

	 int[] objects;
	 int profit;
	 int cost;

	public FinalOutcome(int[] objects, int profit) {
		super();
		this.objects = objects;
		this.profit = profit;
	}

	@Override
	public String toString() {
		return "FinalOutcome [objects=" + Arrays.toString(objects)
				+ ", profit=" + profit + "]";
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

	
}
