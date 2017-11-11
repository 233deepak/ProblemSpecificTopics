package com.deepak.algo.onlineTest;

public class GridUniquePath {

	public int uniquePaths(int a, int b) {
		if(a==0 || b==0)
			return 0;
		if (a == 1 || b == 1)
			return 1;
		
		return uniquePaths(a-1, b) + uniquePaths(a, b - 1);
	}

}
