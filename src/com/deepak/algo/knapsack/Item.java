package com.deepak.algo.knapsack;

public class Item {
	
	int profit;
	int size;
	double fraction;
	
	
	public Item(int profit, int size, double fraction) {
		super();
		this.profit = profit;
		this.size = size;
		this.fraction = fraction;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getFraction() {
		return fraction;
	}
	public void setFraction(double fraction) {
		this.fraction = fraction;
	}
	@Override
	public String toString() {
		return "Item [profit=" + profit + ", size=" + size + ", fraction="
				+ fraction + "]";
	}
	
	
   
}
