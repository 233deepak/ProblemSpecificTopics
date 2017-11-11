package com.deepak.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.deepak.algo.knapsack.Item;
import com.deepak.algo.knapsack.ItemPicker;

public class TestKanpsack {

	private ItemPicker itemPicker;
    
	@Test
	public void testPickItems() {
        Item item1=new Item(60, 10, 0);
        Item item2=new Item(100, 20, 0);
        Item item3=new Item(120, 30, 0);
        List<Item> items=new ArrayList<Item>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
		itemPicker=new ItemPicker(items, 50);
	    System.out.println(itemPicker.maximumProfit()); 
	}
	
	@Test
	public void testPickItems2() {
        Item item1=new Item(4, 12, 0);
        Item item2=new Item(2, 1, 0);
        Item item3=new Item(2, 2, 0);
        Item item4=new Item(1, 1, 0);
        Item item5=new Item(10, 4, 0);
        List<Item> items=new ArrayList<Item>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
		itemPicker=new ItemPicker(items, 15);
	    System.out.println(itemPicker.maximumProfit()); 
	}

}
