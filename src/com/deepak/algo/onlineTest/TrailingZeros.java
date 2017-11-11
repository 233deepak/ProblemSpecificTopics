package com.deepak.algo.onlineTest;

public class TrailingZeros {

	public int trailingZeroes(int a) {
		int power = 1;
		int result = 0;
		long x = 0;
		while (true) {
			x = (long) (a / (Math.pow(5, power++)));
			if (x <= 0)
				break;
			result += Math.floor(x);
		}
		return result;
	}

}
