package com.deepak.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.deepak.algo.LinearMax;
import com.deepak.algo.RecurrsiveMax;

public class TestMax {
	
	private RecurrsiveMax recurrsiveMax=new RecurrsiveMax();
	private LinearMax linearMax=new LinearMax();
	@Test
	public void case1()
	{
		int[] a={12,34,37,9};
		System.out.println(recurrsiveMax.getMax(a, 0, a.length-1));
		
	}
	@Test
	public void case1List()
	{
		int[] a={12,34,37,9};
		List<Integer> list=new ArrayList<Integer>();
	    list.add(12);
	    list.add(34);
	    list.add(37);
	    list.add(9);
		System.out.println(recurrsiveMax.getMaxFromList(list, 0, list.size()-1));
		
	}
	
	@Test
	public void case2()
	{
		int[] a={12,34,37,9,48,2};
		System.out.println(recurrsiveMax.getMax(a, 0, a.length-1));
		
	}
	@Test
	public void case4()
	{
		int[] a={12,34,37,9,48,2};
		System.out.println(linearMax.max(a));
		
	}
	
	@Test
	public void case3()
	{
		int[] a=new int[10000000];
		for(int i=0,j=0;i<5000000;i++,j+=2)
		 a[j]=i;
		for(int i=5000000,j=1;i<10000000;i++,j+=2)
			 a[j]=i;
		
		System.out.println(linearMax.max(a));
	}
	
	@Test
	public void case3List()
	{
		int[] a=new int[10000000];
		List<Integer> integers=new ArrayList<Integer>(10000000);
		for(int i=0,j=0;i<5000000;i++,j+=2)
		  integers.add(j);
		for(int i=5000000,j=1;i<10000000;i++,j+=2)
			integers.add(i);
		
		System.out.println(recurrsiveMax.getMaxFromList(integers, 0,integers.size()-1));
	}
	
	@Test
	public void case5()
	{
		int[] a=new int[10000000];
		for(int i=0,j=0;i<5000000;i++,j+=2)
		 a[j]=i;
		for(int i=5000000,j=1;i<10000000;i++,j+=2)
			 a[j]=i;
		
		System.out.println(recurrsiveMax.getMax(a, 0, a.length));
	}

}
