package com.deepak.algo;

import java.util.List;

public class RecurrsiveMax {
	
	public int getMax(int a[],int startIndex,int endIndex)
	{
		if((endIndex-startIndex)==1)
			return (a[startIndex]>a[endIndex])?a[startIndex]:a[endIndex];
			else if((endIndex-startIndex)==0)
                  return  (startIndex==a.length)?0:a[startIndex];				
			else 
			{
				int mid=(startIndex+endIndex)/2;
				int max1=getMax(a,startIndex,mid);
				int max2=getMax(a, mid+1, endIndex);
				return  (max1>max2)?max1:max2;
			}
		
	}	
	
	public int getMaxFromList(List<Integer> list,int startIndex,int endIndex)
	{
		if((endIndex-startIndex)==1)
			return (list.get(startIndex)>list.get(endIndex))?list.get(startIndex):list.get(endIndex);
			else if((endIndex-startIndex)==0)
                  return  (startIndex==list.size())?0:list.get(startIndex);				
			else 
			{
				int mid=(startIndex+endIndex)/2;
				int max1=getMaxFromList(list, startIndex, mid);
				int max2=getMaxFromList(list, mid+1, endIndex);
				return  (max1>max2)?max1:max2;
			}
		
	}	

}
