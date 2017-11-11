package com.deepak.algo;

public class LinearMax {
	
	public int max(int a[])
	{
		int max=a[0];
		
		for(int x:a)
		{
			max=(x>max)?x:max;
		}
		return max;
		
	}

}
