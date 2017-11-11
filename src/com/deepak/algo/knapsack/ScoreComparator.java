package com.deepak.algo.knapsack;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Item> {

	@Override
	public int compare(Item item1, Item item2) {
        
	  double score1=item1.profit/item1.size;
	  double score2=item2.profit/item2.size;
	  if(score1>score2) return -1;
	  else if(score1<score2) return 1;
	  else return 0;
	}
	
	
	

}
