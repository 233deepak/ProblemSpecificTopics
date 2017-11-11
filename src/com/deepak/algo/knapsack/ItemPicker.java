package com.deepak.algo.knapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemPicker {
	
	private List<Item> items;
	private List<Item> pickedItems;
	private double knapsackSize;

	public ItemPicker(List<Item> items,double knapsacSize) {
		super();
		this.items = items;
		this.knapsackSize=knapsacSize;
		pickedItems=new ArrayList<Item>();
	}
	
	public void pickItems() {
		Collections.sort(items,new ScoreComparator());
		for(Item item:items) {
			if((knapsackSize-item.size)>=0){
				pickedItems.add(item);
				knapsackSize-=item.size;
				item.fraction=1;
			}
			else if(knapsackSize>0){
				 item.fraction=knapsackSize/item.size;
				 knapsackSize-=item.fraction;
				 pickedItems.add(item);
				 break;
			}
		}
		System.out.println("picked items "+pickedItems);
	}
	
	
	public double maximumProfit() {
		pickItems();
		double profit=0;
		for(Item item:pickedItems) {
			profit+=(item.fraction*item.profit);
		}
		return profit;
	}

}
