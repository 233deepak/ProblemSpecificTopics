package com.deepak.algo.onlineTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Prime {

	public int isPrime(int A) {
		if (A == 1)
			return 0;
		int upperLimit = (int) (Math.sqrt(A));
		for (int i = 2; i <= upperLimit; i++) {
			if (i < A && A % i == 0)
				return 0;
		}
		return 1;
	}

	public ArrayList<ArrayList<Integer>> squareSum(int A) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		for (int a = 0; a * a < A; a++) {
			for (int b = 0; b * b < A; b++) {
				if (a * a + b * b == A) {
					if (a > b)
						continue;
					ArrayList<Integer> newEntry = new ArrayList<Integer>();
					newEntry.add(a);
					newEntry.add(b);
					ans.add(newEntry);
				}
			}
		}
		return ans;
	}

	public ArrayList<Integer> allFactors(int a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		if (a != 1)
			list.add(a);
		int upperLimit = (int) (Math.sqrt(a));
		for (int i = 2; i <= upperLimit; i++) {
			if (a % i == 0) {
				list.add(i);
				int b = a / i;
				if (i != b)
					list.add(b);
			}

		}
		Collections.sort(list);
		return list;
	}

	public Set<Integer> sieve(int a) {
		boolean[] prime = new boolean[a + 1];
		Set<Integer> result = new HashSet<Integer>();
		for (int index = 0; index <= a; index++)
			prime[index] = true;
		int upperLimit = (int) (Math.sqrt(a));
		for (int i = 2; i <= upperLimit; i++) {
			if (prime[i] == true) {
				 for (int j=i*2; j<=a; j += i)
		                prime[j] = false;
			}
		}
		for (int i = 2; i <= a; i++) {
			if (prime[i] == true)
				result.add(i);
		}
		return result;
	}
	
	public int gcd(int a, int b) {
	    if (a == 0)
        return b;
      return gcd(b%a, a);
	}

	public String findDigitsInBinary(int a) {
		if (a == 0)
			return "0";
		StringBuilder builder = new StringBuilder();
		while (a > 0) {
			int d = a % 2;
			a = a / 2;
			builder.append(d);
		}
		builder.reverse();
		return builder.toString();

	}

	public ArrayList<Integer> primesum(int a) {

		Set<Integer> primes = sieve(a);
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		for (Integer x:primes) {
			int y = a - x;
			if (primes.contains(y) && x <= y) {
				Pair pair = new Pair(x, y);
				pairs.add(pair);
			}
		}
		Collections.sort(pairs);
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (pairs.size() > 0) {
			result.add(pairs.get(0).x);
			result.add(pairs.get(0).y);
		}
		return result;

	}

	class Pair implements Comparable<Pair> {
		int x;
		int y;

		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}

		@Override
		public int compareTo(Pair o) {
			if (this.x > o.x)
				return 1;
			else if (this.x < o.x)
				return -1;
			else {
				int x = (this.y < o.y) ? -1 : 1;
				if (this.y == o.y)
					x = 0;
				return x;
			}
		}

	}

}
