package com.deepak.test.online;

import org.junit.Test;

import com.deepak.algo.onlineTest.Prime;

public class TestPrime {
	
	Prime prime=new Prime();
	
	@Test
	public void test(){
		System.out.println(prime.isPrime(1));
	}

	@Test
	public void test2(){
		System.out.println(prime.squareSum(10));
	}
	
	@Test
	public void test3(){
		System.out.println(prime.allFactors(38808));
	}
	
	@Test
	public void test5(){
		System.out.println(prime.sieve(10));
	}
	
	@Test
	public void test6(){
		System.out.println(prime.sieve(1));
	}
	
	@Test
	public void test7(){
		System.out.println(prime.findDigitsInBinary(0));
	}
	
	@Test
	public void test10(){
		System.out.println(prime.primesum(10));
	}
	
	@Test
	public void test11(){
		System.out.println(prime.primesum(16777214));
	}
}
