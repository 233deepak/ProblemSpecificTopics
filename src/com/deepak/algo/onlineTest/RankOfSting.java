package com.deepak.algo.onlineTest;

public class RankOfSting {

	public int findRank(String a) {
		Long rank = (long) 0;
		int x = 0;
		for (int index = 0; index < a.length(); index++) {
			x=0;
			for (int i = index + 1; i < a.length(); i++) {
				if (a.charAt(index) > a.charAt(i))
					x++;
			}
			rank += (long)(x * factroial(a.length() - 1 - index));
		}
		//if (rank > Integer.MAX_VALUE)
			rank %= 1000003;
		return rank.intValue()+1;
	}

	public long factroial(int x) {
		
		return (x <= 1)? 1 :(long)(x * factroial(x-1));
		/*long fact = 1;
		for (int i = x; i > 0; i--)
			fact *= i;
		return fact;*/
	}
}
