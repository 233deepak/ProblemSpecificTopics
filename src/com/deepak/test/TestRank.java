package com.deepak.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Test; 

import com.deepak.algo.Rank;

public class TestRank {
	
	Rank rank=new Rank();
	
	@Test
	public void testSplit(){
		 
		List<Integer> integers=new ArrayList<Integer>();
		for(int i=1;i<50;i++){
			Random random=new Random();
			Integer integer=random.nextInt();
			integers.add(integer);
		}
		
		System.out.println(integers);
		Map<Integer, List<Integer>> map=rank.splitArray(integers);
		System.out.println(map);
	}

	@Test
	public void testMedian(){
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(12);
		integers.add(9);
		integers.add(20);
		integers.add(25);
		integers.add(8);
		integers.add(2);
		integers.add(22);
		System.out.println(rank.getMedian(integers));
	}
	
	@Test
	public void testRank(){
		
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(12);
		integers.add(9);
		integers.add(20);
		integers.add(25);
		integers.add(8);
		integers.add(2);
		integers.add(22);
		integers.add(7);
		integers.add(19);
		integers.add(21);
		integers.add(24);
		integers.add(10);
		integers.add(1);
		integers.add(23);
		integers.add(13);
		integers.add(14);
		integers.add(18);
		integers.add(17);
		integers.add(16);
		integers.add(11);
		integers.add(15);
		integers.add(6);
		integers.add(4);
		integers.add(5);
		integers.add(3);
		System.out.println(rank.findElementWithRank(10, integers));
		
	}
	
	@Test
	public void testRank50(){
		
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(12);
		integers.add(9);
		integers.add(20);
		integers.add(25);
		integers.add(8);
		integers.add(2);
		integers.add(22);
		integers.add(7);
		integers.add(19);
		integers.add(21);
		integers.add(24);
		integers.add(10);
		integers.add(1);
		integers.add(23);
		integers.add(13);
		integers.add(14);
		integers.add(18);
		integers.add(17);
		integers.add(16);
		integers.add(11);
		integers.add(15);
		integers.add(6);
		integers.add(4);
		integers.add(5);
		integers.add(3);


		integers.add(26);
		integers.add(29);
		integers.add(30);
		integers.add(35);
		integers.add(33);
		integers.add(36);
		integers.add(39);
		integers.add(40);
		integers.add(43);
		integers.add(44);
		integers.add(50);
		integers.add(47);
		integers.add(48);
		integers.add(49);
		integers.add(46);
		integers.add(45);
		integers.add(42);
		integers.add(41);
		integers.add(38);
		integers.add(37);
		integers.add(34);
		integers.add(32);
		integers.add(31);
		integers.add(28);
		integers.add(27);
		System.out.println(rank.findElementWithRank(30, integers));
		
	}
	
	@Test
	public void testNormalCollectionSort(){
		
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(12);
		integers.add(9);
		integers.add(20);
		integers.add(25);
		integers.add(8);
		integers.add(2);
		integers.add(22);
		integers.add(7);
		integers.add(19);
		integers.add(21);
		integers.add(24);
		integers.add(10);
		integers.add(1);
		integers.add(23);
		integers.add(13);
		integers.add(14);
		integers.add(18);
		integers.add(17);
		integers.add(16);
		integers.add(11);
		integers.add(15);
		integers.add(6);
		integers.add(4);
		integers.add(5);
		integers.add(3);


		integers.add(26);
		integers.add(29);
		integers.add(30);
		integers.add(35);
		integers.add(33);
		integers.add(36);
		integers.add(39);
		integers.add(40);
		integers.add(43);
		integers.add(44);
		integers.add(50);
		integers.add(47);
		integers.add(48);
		integers.add(49);
		integers.add(46);
		integers.add(45);
		integers.add(42);
		integers.add(41);
		integers.add(38);
		integers.add(37);
		integers.add(34);
		integers.add(32);
		integers.add(31);
		integers.add(28);
		integers.add(27);
		
		Collections.sort(integers);
		System.out.println(integers.get(30));
		
	}
	
	@Test
	public void testHugeData(){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<50000000; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        
        System.out.println(rank.findElementWithRank(30, list));
	}
	@Test
	public void testHugeDataWithSort(){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<50000000; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        Collections.sort(list);
		System.out.println(list.get(29));
        
	}
	
}
