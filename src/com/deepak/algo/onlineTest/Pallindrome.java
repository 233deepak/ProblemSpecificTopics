package com.deepak.algo.onlineTest;

public class Pallindrome {

	public boolean pallindrome(Integer a) {
		if (a < 0)
			return false;
		long reverse = 0;
		Integer x = a;
		while (a > 0) {
			int d = a % 10;
			reverse = (reverse * 10) + d;
			a = a / 10;
		}
		return (reverse == x);
	}

	public int reverse(int a) {
		Integer x = a;
		boolean negative = false;
		if (a < 0) {
			negative =true;
			x = Math.abs(a);
		}
		Long reverse = (long) 0;
		while (x > 0) {
			int d = x % 10;
			reverse = (reverse * 10) + d;
			if(reverse>Integer.MAX_VALUE)
				return 0;
			x = x / 10;
		}
		return (negative) ? -reverse.intValue() : reverse.intValue();
	}

}
