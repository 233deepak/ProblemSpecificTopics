package com.deepak.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Find element with a given rank in an array
public class Rank {

	public Integer findElement(int rank,List<Integer> array){

		Map<Integer, List<Integer>> map=this.splitArray(array);
		List<Integer> listB =new ArrayList<Integer>();
		for(Integer key:map.keySet()){

			listB.add(getMedian(map.get(key)));
		}

		int approximateMedian=0;
		if(listB.size()==1) return approximateMedian=listB.get(0);
		else return approximateMedian=findElement(rank/10, listB);
		
	}
	
	public int findElementWithRank(int rank,List<Integer> array){
		
		int approximateMedian=findElement(rank, array);
		List<Integer> aLeft=getLeftSubArray(array, approximateMedian);
		List<Integer> aRight=getRightSubArray(array, approximateMedian);
		if(aLeft.size()==rank-1) return approximateMedian;
		else if(aLeft.size()>rank-1) return findElementWithRank(rank, aLeft);
		else return findElementWithRank(rank-aLeft.size()-1, aRight);
		
	}

	public Map<Integer,List<Integer>> splitArray(List<Integer> array){

		Map<Integer,List<Integer>> result=new HashMap<Integer, List<Integer>>();
		int counter=0,grooupNo=1;
		List<Integer> list=null;
		for(Integer element:array){

			if(counter%5==0)
			{
				list=new ArrayList<Integer>();
				result.put(grooupNo++, list);
			}
			list.add(element);
			counter++;
		}

		return result;
	}

	public Integer getMedian(List<Integer> integers){

		Collections.sort(integers);
		int index=integers.size()/2;
		return integers.get(index);
	}

	public List<Integer> getLeftSubArray(List<Integer> integers,int midElement){

		List<Integer> aLeft=new ArrayList<Integer>();
		for(Integer integer:integers){
			if(integer<midElement)
				aLeft.add(integer);
		}

		return aLeft;
	}
	public List<Integer> getRightSubArray(List<Integer> integers,int midElement){

		List<Integer> aRight=new ArrayList<Integer>();
		for(Integer integer:integers){
			if(integer>midElement)
				aRight.add(integer);
		}

		return aRight;
	}

}
